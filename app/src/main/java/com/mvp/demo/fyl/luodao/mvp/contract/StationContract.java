package com.mvp.demo.fyl.luodao.mvp.contract;

import com.mvp.demo.fyl.luodao.base.BaseModel;
import com.mvp.demo.fyl.luodao.base.BasePresenter;
import com.mvp.demo.fyl.luodao.base.BaseView;
import com.mvp.demo.fyl.luodao.bean.StationInfo;
import com.mvp.demo.fyl.luodao.exception.ExceptionHandle;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import rx.Observable;

/**
 * Created by fengyalu on 18-7-13.
 */

public interface StationContract {
    interface View extends BaseView {
        void showapiResBody(String from,String to);
        void trainList(List<StationInfo.ShowapiResBodyBean.TrainsBean> list);
        void fail(ExceptionHandle.ResponeThrowable e);
    }

    interface Model extends BaseModel {
        Observable<StationInfo> getStation(Map<String,String> map);
    }

    abstract class Presenter extends BasePresenter<View,Model> {
        public abstract void getStation(String trainDate,String end,String time);
    }

}
