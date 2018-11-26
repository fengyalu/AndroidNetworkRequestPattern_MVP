package com.mvp.demo.fyl.luodao.mvp.presenter;
import com.mvp.demo.fyl.luodao.bean.StationInfo;
import com.mvp.demo.fyl.luodao.exception.ExceptionHandle;
import com.mvp.demo.fyl.luodao.manager.UrlManager;
import com.mvp.demo.fyl.luodao.mvp.contract.StationContract;
import com.mvp.demo.fyl.luodao.mvp.model.StationModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by fengyalu on 18-7-13.
 */

public class StationPresenter extends StationContract.Presenter {

    private StationContract.View view;
    private final StationModel model;

    public StationPresenter(StationContract.View view) {
        this.view = view;
        model=new StationModel();
    }

    @Override
    public void getStation(String begin,String end,String time) {
        Map<String,String> map=new HashMap<>();
        map.put("showapi_appid","69540");
        map.put("showapi_sign","4c0459c53b9a48159ebc88c6f70ada1a");
        map.put("from",begin);
        map.put("to",end);
        map.put("trainDate",time);
       Subscription subscription=model.getStation(map)
               .subscribe(new Subscriber<StationInfo>() {
                   @Override
                   public void onCompleted() {

                   }

                   @Override
                   public void onError(Throwable e) {
                        view.fail(ExceptionHandle.handleException(e));
                   }

                   @Override
                   public void onNext(StationInfo stationInfo) {
                       if (0==stationInfo.getShowapi_res_code()){
                           if ("0".equals(stationInfo.getShowapi_res_body().getRet_code())){
                           view.showapiResBody(stationInfo.getShowapi_res_body().getFrom(),stationInfo.getShowapi_res_body().getTo());
                           view.trainList(stationInfo.getShowapi_res_body().getTrains());
                           }else {
                               view.fail(ExceptionHandle.handleErrorMsg(stationInfo));
                           }
                       }else {
                           view.fail(ExceptionHandle.handleErrorMsg(stationInfo));
                       }
                   }
               });
        subscribe(subscription);
    }
}
