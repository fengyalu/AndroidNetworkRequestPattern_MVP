package com.mvp.demo.fyl.luodao.mvp.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mvp.demo.fyl.luodao.R;
import com.mvp.demo.fyl.luodao.base.BaseActivity;
import com.mvp.demo.fyl.luodao.exception.ExceptionHandle;
import com.mvp.demo.fyl.luodao.mvp.contract.TimeListContract;
import com.mvp.demo.fyl.luodao.mvp.presenter.TimeListPresenter;

import java.util.List;


public class TimeListActivity extends BaseActivity<TimeListPresenter> implements TimeListContract.View,View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_list);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String trainNum = bundle.getString("trainNum");
        Log.i("*******", "onCreate: "+trainNum);
        String trainDate = bundle.getString("trainDate");
        Log.i("*******", "onCreate: "+trainDate);
        presenter.getTimeList(trainNum,trainDate);
    }

    @Override
    protected TimeListPresenter onCreatePresenter() {
        return new TimeListPresenter(this);
    }


    @Override
    public void onClick(View v) {

    }


    @Override
    public void sendTimeList(List list) {
        if (list!=null&&!list.isEmpty()){

        }
    }

    @Override
    public void fail(ExceptionHandle.ResponeThrowable e) {

    }
}
