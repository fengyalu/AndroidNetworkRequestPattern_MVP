package com.mvp.demo.fyl.luodao.mvp.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mvp.demo.fyl.luodao.R;
import com.mvp.demo.fyl.luodao.bean.StationInfo;


public class TrainDetialActivity extends AppCompatActivity implements View.OnClickListener{

    private StationInfo.ShowapiResBodyBean.TrainsBean trains;
    private TextView  fromCity, toCity, fromTime, toTime, usedTime, hardseaPrice, hardsleepermPrice
            , noseatPrice, softsleeperdPrice, businessseatPrice, firstseatPrice, secondseatPrice
            ,hardseatTicketNum,hardsleepermTicketNum,noseatTicketNum,softsleeperdTicketNum
            ,businessseatTicketNum,firstseatTicketNum,secondseatTicketNum;
    private RelativeLayout rlHardseat, rlHardsleepermPrice, rlNoseat, rlSoftsleeperd, rlBusinessseat, rlFirstseat, rlSecondseat;
    private RelativeLayout titleBar;
    private LinearLayout timeList;
    private String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_detial);
        initView();
        initOnClick();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String trainJson = bundle.getString("trainJson");
        time = bundle.getString("time");
        if (!TextUtils.isEmpty(trainJson)) {
            trains = new Gson().fromJson(trainJson, new TypeToken<StationInfo.ShowapiResBodyBean.TrainsBean>() {
            }.getType());
        }
        setDataView(trains);
    }

    private void initView() {
        fromCity = (TextView) findViewById(R.id.fromCity);
        toCity = (TextView) findViewById(R.id.toCity);
        fromTime = (TextView) findViewById(R.id.fromTime);
        toTime = (TextView) findViewById(R.id.toTime);
        usedTime = (TextView) findViewById(R.id.usedTime);
        hardseaPrice = (TextView) findViewById(R.id.hardseat_price);
        hardseatTicketNum = (TextView) findViewById(R.id.hardseat_ticketNum);
        rlHardseat = (RelativeLayout) findViewById(R.id.rl_hardseat);
        hardsleepermPrice = (TextView) findViewById(R.id.hardsleeperm_price);
        hardsleepermTicketNum = (TextView) findViewById(R.id.hardsleeperm_ticketNum);
        rlHardsleepermPrice = (RelativeLayout) findViewById(R.id.rl_hardsleeperm);
        noseatPrice = (TextView) findViewById(R.id.noseat_price);
        noseatTicketNum = (TextView) findViewById(R.id.noseat_ticketNum);
        rlNoseat = (RelativeLayout) findViewById(R.id.rl_noseat);
        softsleeperdPrice = (TextView) findViewById(R.id.softsleeperd_price);
        softsleeperdTicketNum = (TextView) findViewById(R.id.softsleeperd_ticketNum);
        rlSoftsleeperd = (RelativeLayout) findViewById(R.id.rl_softsleeperd);
        businessseatPrice = (TextView) findViewById(R.id.businessseat_price);
        businessseatTicketNum = (TextView) findViewById(R.id.businessseat_ticketNum);
        rlBusinessseat = (RelativeLayout) findViewById(R.id.rl_businessseat);
        firstseatPrice = (TextView) findViewById(R.id.firstseat_price);
        firstseatTicketNum = (TextView) findViewById(R.id.firstseat_ticketNum);
        rlFirstseat = (RelativeLayout) findViewById(R.id.rl_firstseat);
        secondseatPrice = (TextView) findViewById(R.id.secondseat_price);
        secondseatTicketNum = (TextView) findViewById(R.id.secondseat_ticketNum);
        rlSecondseat = (RelativeLayout) findViewById(R.id.rl_secondseat);
        titleBar = (RelativeLayout) findViewById(R.id.title_bar);
        timeList= (LinearLayout) findViewById(R.id.time_list);
    }

    private void initOnClick() {
        titleBar.setOnClickListener(this);
        timeList.setOnClickListener(this);
    }

    private void setDataView(StationInfo.ShowapiResBodyBean.TrainsBean trains) {

        if (trains != null) {
            try {
                fromCity.setText(trains.getFromCity());
                toCity.setText(trains.getToCity());
                fromTime.setText(trains.getFromTime());
                toTime.setText(trains.getToTime());
                usedTime.setText(String.valueOf((trains.getUsedTime()/60)+"小时"+(trains.getUsedTime()%60)+"分钟"));
                StationInfo.ShowapiResBodyBean.TrainsBean.TicketInfoBean ticketInfo =trains.getTicketInfo();
                if (ticketInfo != null) {
                    if (ticketInfo.getHardseat() != null) {
                        hardseaPrice.setText("￥"+String.valueOf(ticketInfo.getHardseat().getPrice()));
                        hardseatTicketNum.setText(ticketInfo.getHardseat().getTicketNum());
                    } else {
                        rlHardseat.setVisibility(View.GONE);
                    }
                    if (ticketInfo.getHardsleepermid() != null) {
                        hardsleepermPrice.setText("￥"+String.valueOf(ticketInfo.getHardsleepermid().getPrice()));
                        hardsleepermTicketNum.setText(ticketInfo.getHardsleepermid().getTicketNum());
                    } else {
                        rlHardsleepermPrice.setVisibility(View.GONE);
                    }

                    if (ticketInfo.getNoseat() != null) {
                        noseatPrice.setText("￥"+String.valueOf(ticketInfo.getNoseat().getPrice()));
                        noseatTicketNum.setText(ticketInfo.getNoseat().getTicketNum());
                    } else {
                        rlNoseat.setVisibility(View.GONE);
                    }

                    if (ticketInfo.getSoftsleeperdown() != null) {
                        softsleeperdPrice.setText("￥"+String.valueOf(ticketInfo.getSoftsleeperdown().getPrice()));
                        softsleeperdTicketNum.setText(ticketInfo.getSoftsleeperdown().getTicketNum());
                    } else {
                        rlSoftsleeperd.setVisibility(View.GONE);
                    }
                    if (ticketInfo.getBusinessseat() != null) {
                        businessseatPrice.setText("￥"+String.valueOf(ticketInfo.getBusinessseat().getPrice()));
                        businessseatTicketNum.setText(ticketInfo.getBusinessseat().getTicketNum());
                    } else {
                        rlBusinessseat.setVisibility(View.GONE);
                    }

                    if (ticketInfo.getFirstseat() != null) {
                        firstseatPrice.setText("￥"+String.valueOf(ticketInfo.getFirstseat().getPrice()));
                        firstseatTicketNum.setText(ticketInfo.getFirstseat().getTicketNum());
                    } else {
                        rlFirstseat.setVisibility(View.GONE);
                    }

                    if (ticketInfo.getSecondseat() != null) {
                        secondseatPrice.setText("￥"+String.valueOf(ticketInfo.getSecondseat().getPrice()));
                        secondseatTicketNum.setText(ticketInfo.getSecondseat().getTicketNum());
                    } else {
                        rlSecondseat.setVisibility(View.GONE);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.title_bar:
                finish();
                break;
            case R.id.time_list:
               Intent intent=new Intent(this,TimeListActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("trainNum",trains.getNum());
                bundle.putString("trainDate",time);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            default:

                break;
        }
    }
}
