package com.mvp.demo.fyl.luodao.mvp.contract;

import com.mvp.demo.fyl.luodao.base.BaseModel;
import com.mvp.demo.fyl.luodao.base.BasePresenter;
import com.mvp.demo.fyl.luodao.base.BaseView;
import com.mvp.demo.fyl.luodao.bean.TransTimeList;
import com.mvp.demo.fyl.luodao.exception.ExceptionHandle;

import java.util.List;
import java.util.Map;

import rx.Observable;

/**
 * Created by fyl on 18-7-13.
 */

public interface TimeListContract {
    interface View extends BaseView {
        void sendTimeList( List list);
        void fail(ExceptionHandle.ResponeThrowable e);
    }

    interface Model extends BaseModel {
        Observable<TransTimeList> getTimeList(Map<String, String> map);
    }

    abstract class Presenter extends BasePresenter<View,Model> {
        public abstract void getTimeList(String trainNum,String trainDate);
    }

}
