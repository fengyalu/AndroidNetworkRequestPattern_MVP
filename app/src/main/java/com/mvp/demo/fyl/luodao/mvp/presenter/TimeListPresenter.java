package com.mvp.demo.fyl.luodao.mvp.presenter;

import android.util.Log;

import com.mvp.demo.fyl.luodao.bean.StationInfo;
import com.mvp.demo.fyl.luodao.bean.TransTimeList;
import com.mvp.demo.fyl.luodao.exception.ExceptionHandle;
import com.mvp.demo.fyl.luodao.mvp.contract.StationContract;
import com.mvp.demo.fyl.luodao.mvp.contract.TimeListContract;
import com.mvp.demo.fyl.luodao.mvp.model.StationModel;
import com.mvp.demo.fyl.luodao.mvp.model.TimeListModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Subscriber;
import rx.Subscription;

/**
 * Created by fengyalu on 18-7-13.
 */

public class TimeListPresenter extends TimeListContract.Presenter {

    private TimeListContract.View view;
    private final TimeListModel model;
    private   List<String> sendList;
    public TimeListPresenter(TimeListContract.View view) {
        this.view = view;
        model = new TimeListModel();
        sendList=new ArrayList<>();
    }


    @Override
    public void getTimeList(String trainNum, String trainDate) {
        Map<String, String> map = new HashMap<>();
        map.put("showapi_appid", "69540");
        map.put("showapi_sign", "4c0459c53b9a48159ebc88c6f70ada1a");
        map.put("trainNum", trainNum);
        map.put("trainDate", trainDate);
        Subscription subscription = model.getTimeList(map)
                .subscribe(new Subscriber<TransTimeList>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        view.fail(ExceptionHandle.handleException(e));
                    }

                    @Override
                    public void onNext(TransTimeList transTimeList) {
                        if (0 == transTimeList.getShowapi_res_code()) {
                            if (0==transTimeList.getShowapi_res_body().getRet_code()) {
                                List<List> context = transTimeList.getShowapi_res_body().getContext();
                                for (int i = 0; i <context.size() ; i++) {
                                    List list = context.get(i);
                                    for (int j = 0; j <list.size() ; j++) {
                                        if (list.get(i) instanceof Integer){
                                            Log.i("######", "onNext: ");
                                        }
                                    }
                                }

                            }else {
                                view.fail(ExceptionHandle.handleErrorMsg(transTimeList));
                            }
                        }else {
                            view.fail(ExceptionHandle.handleErrorMsg(transTimeList));
                        }
                    }
                });
        subscribe(subscription);
    }
}
