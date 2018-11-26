package com.mvp.demo.fyl.luodao.mvp.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.mvp.demo.fyl.luodao.R;
import com.mvp.demo.fyl.luodao.base.BaseActivity;
import com.mvp.demo.fyl.luodao.bean.StationInfo;
import com.mvp.demo.fyl.luodao.exception.ExceptionHandle;
import com.mvp.demo.fyl.luodao.mvp.contract.StationContract;
import com.mvp.demo.fyl.luodao.mvp.presenter.StationPresenter;
import com.mvp.demo.fyl.luodao.mvp.view.adapter.StationAdapter;

import java.util.List;


public class StationActivity extends BaseActivity<StationPresenter> implements StationContract.View,View.OnClickListener {
    private TextView fromCity,toCity;
    private ListView listView;
    private StationAdapter stationAdapter;
    private RelativeLayout titleBar;
    private List<StationInfo.ShowapiResBodyBean.TrainsBean> trainList;
    private String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station);
        initView();
       Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String begin = bundle.getString("begin");
        String end = bundle.getString("end");
        time = bundle.getString("time");
        if(!TextUtils.isEmpty(begin)&&!TextUtils.isEmpty(end)&&!TextUtils.isEmpty(time)) {
            presenter.getStation(begin, end, time);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (trainList!=null&&!trainList.isEmpty()){
                    StationInfo.ShowapiResBodyBean.TrainsBean itemTrains = trainList.get(position);
                    Gson gson=new Gson();
                    String trainJson = gson.toJson(itemTrains);
                    Intent intent=new Intent(StationActivity.this,TrainDetialActivity.class);
                    Bundle bundle=new Bundle();
                    bundle.putString("trainJson",trainJson);
                    bundle.putString("time", time);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }

    private void initView() {
        titleBar= (RelativeLayout) findViewById(R.id.title_bar);
        fromCity = (TextView) findViewById(R.id.from);
        toCity= (TextView) findViewById(R.id.to);
        listView = (ListView) findViewById(R.id.station_listView);
        stationAdapter=new StationAdapter(this);
        titleBar.setOnClickListener(this);
    }

    @Override
    protected StationPresenter onCreatePresenter() {
        return new StationPresenter(this);
    }


    @Override
    public void showapiResBody(String from, String to) {
        fromCity.setText(from);
        toCity.setText(to);
    }

    @Override
    public void trainList(List<StationInfo.ShowapiResBodyBean.TrainsBean> list) {
        if (list!=null&&!list.isEmpty()){
            trainList=list;
            stationAdapter.setList(list);
            listView.setAdapter(stationAdapter);
        }
    }

    @Override
    public void fail(ExceptionHandle.ResponeThrowable e) {
        Toast.makeText(this, e.message.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.title_bar:
                finish();
                break;
            default:

                break;
        }
    }
}
