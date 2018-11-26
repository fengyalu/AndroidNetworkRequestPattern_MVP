package com.mvp.demo.fyl.luodao.mvp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import com.mvp.demo.fyl.luodao.R;


/**
 * Created by Kingfar on 2017/12/15.
 * 一个打钩小动画
 */

public class TickView extends View{

    private static final int MAX_SWEEP_ANGLES = 360;  // 弧线需要扫过的总角度
    private static final int START_ANGLES = 90;       // 弧线起始角度
    private static final int DEFAULT_RADIUS = 200;    // 选中/未选中时圆的默认半径
    // 选中状态画笔默认颜色
    private static final int DEFAULT_CHECKED_COLOR = Color.parseColor("#008AFF");
    // 未选中状态画笔颜色
    private static final int UN_CHECKED_COLOR = Color.parseColor("#F2F2F2");

    private int halfWidth;       // 尺寸半款
    private int halfHeight;      // 尺寸半高

    private Paint checkedPaint;       // 选中状态画笔
    private Paint whitePaint;         // 选中状态白色画笔
    private Paint unCheckedPaint;     // 未选中状态画笔
    private Path tickPath;            // 绘制小勾的路径

    private int radius;                        // 选中/未选中时圆的半径
    private int whiteRadiusCounter;            // 白色圆缩小时动态变化的半径
    private int maxExpandRadius;               // 选中时圆变大的最大半径
    private int sweepAnglesCounter;            // 弧线已扫过角度
    private int expandRadiusCounter;           // 选中时圆变大的动态半径
    private int narrowRadiusCounter;           // 选中时圆变小的动态半径

    private boolean isCheck;     // 标记是否处于勾选状态

    public TickView(Context context) {
        this(context, null);
    }

    public TickView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // 创建画笔
        checkedPaint = new Paint();
        whitePaint = new Paint();
        unCheckedPaint = new Paint();

        // 获取xml属性
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TickView);
        checkedPaint.setColor(typedArray.getColor(R.styleable.TickView_checked_color, DEFAULT_CHECKED_COLOR));
        isCheck = typedArray.getBoolean(R.styleable.TickView_checked, false);
        radius = (int)typedArray.getDimension(R.styleable.TickView_radius, DEFAULT_RADIUS);
        typedArray.recycle();

        // 初始化画笔
        checkedPaint.setStyle(Paint.Style.STROKE);
        checkedPaint.setStrokeWidth(20);
        whitePaint.setColor(Color.WHITE);
        whitePaint.setStrokeWidth(20);
        unCheckedPaint.setStrokeWidth(20);
        unCheckedPaint.setColor(UN_CHECKED_COLOR);
        unCheckedPaint.setStyle(Paint.Style.STROKE);

        // 初始化半径参数
        whiteRadiusCounter = radius;
        maxExpandRadius = radius + 60;
        sweepAnglesCounter = 0;
        expandRadiusCounter = radius;
        narrowRadiusCounter = maxExpandRadius;

        // 初始化小勾路径
        int oneThirdOfTheRadius = radius/3;
        tickPath = new Path();
        tickPath.moveTo(-oneThirdOfTheRadius, 0);
        tickPath.lineTo(0, oneThirdOfTheRadius);
        tickPath.lineTo(oneThirdOfTheRadius, -oneThirdOfTheRadius);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasureSize(widthMeasureSpec), getMeasureSize(heightMeasureSpec));
    }

    private int getMeasureSize(int measureSpec){
        int modeSpec = MeasureSpec.getMode(measureSpec);
        int sizeSpec = MeasureSpec.getSize(measureSpec);
        int result;
        if(modeSpec == MeasureSpec.EXACTLY){
            result = sizeSpec;
        } else {
            result = maxExpandRadius<<1;
            if(modeSpec == MeasureSpec.AT_MOST){
                result = Math.min(sizeSpec, result);
            }
        }
        return result;
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        halfWidth = getWidth()>>1;
        halfHeight = getHeight()>>1;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(isCheck){
            drawChecked(canvas);
        }else{
            drawUnChecked(canvas);
        }
    }// onDraw()

    // 绘制选中时的状态
    private void drawChecked(Canvas canvas){
        canvas.save();
        canvas.translate(halfWidth, halfHeight);
        // 画彩色圆弧（动态）
        if(sweepAnglesCounter < MAX_SWEEP_ANGLES){
            sweepAnglesCounter += 12;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawArc(-radius, -radius, radius, radius, START_ANGLES, sweepAnglesCounter, false, checkedPaint);
        }

        // 动态圆弧已画完
        if(sweepAnglesCounter == MAX_SWEEP_ANGLES){
            // 画彩色圆（静态）
            checkedPaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(0, 0, radius, checkedPaint);

            // 画白色逐渐变小的圆（动态）
            if(whiteRadiusCounter >= 20){
                whiteRadiusCounter -= 20;
            }
            whitePaint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(0, 0, whiteRadiusCounter, whitePaint);
        }

        // 白色逐渐变小的圆（动态）已画完
        if(whiteRadiusCounter < 20){
            // 画“小勾”（静态）同时画彩色圆变大（动态）
            whitePaint.setStyle(Paint.Style.STROKE);
            if(expandRadiusCounter < maxExpandRadius){
                expandRadiusCounter += 20;
                canvas.drawCircle(0, 0, expandRadiusCounter, checkedPaint);
                canvas.drawPath(tickPath, whitePaint);// 画小勾
            }
        }

        // 彩色圆变大（动态）已画完
        if(expandRadiusCounter == maxExpandRadius){
            // 画“小勾”（静态）同时画彩色圆缩回变大前效果（动态）
            if(narrowRadiusCounter >= radius) {
                narrowRadiusCounter -= 20;
                canvas.drawCircle(0, 0, narrowRadiusCounter, checkedPaint);
                canvas.drawPath(tickPath, whitePaint);// 画小勾
            }
        }

        canvas.restore(); // 恢复坐标系
        // 彩色圆缩回变大前效果（动态）还没画完
        if(narrowRadiusCounter >= radius){
            // 重绘，也可以改成调用postInvalidateDelayed()方法控制动画速度
            invalidate();
        } else {
            // 动态效果绘制结束立刻重置变量
            // 避免窗口在onStop()-->onReStar()之后导致该View绘制异常
            reset();
        }
    }

    // 绘制没选中时的状态
    private void drawUnChecked(Canvas canvas){
        canvas.save();
        canvas.translate(halfWidth, halfHeight);
        // 绘制一个灰色的圆圈、小勾
        canvas.drawCircle(0, 0, radius, unCheckedPaint);
        canvas.drawPath(tickPath, unCheckedPaint);
        canvas.restore();
    }

    public void setCheck(boolean check) {
        isCheck = check;
        reset();
        invalidate();
    }

    public boolean getCheck(){
        return isCheck;
    }

    // 重置所有参数的状态
    private void reset(){
        checkedPaint.setStyle(Paint.Style.STROKE);

        whiteRadiusCounter = radius;
        sweepAnglesCounter = 0;
        expandRadiusCounter = radius;
        narrowRadiusCounter = maxExpandRadius;
    }
}
