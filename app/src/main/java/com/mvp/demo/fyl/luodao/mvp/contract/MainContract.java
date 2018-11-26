package com.mvp.demo.fyl.luodao.mvp.contract;


import com.mvp.demo.fyl.luodao.base.BaseModel;
import com.mvp.demo.fyl.luodao.base.BasePresenter;
import com.mvp.demo.fyl.luodao.base.BaseView;
import com.mvp.demo.fyl.luodao.manager.UrlManager;

import okhttp3.ResponseBody;
import rx.Observable;

/**
 * Created by fengyalu on 18-7-12.
 */

public interface MainContract {
    interface View extends BaseView {
        void onSucceed(String data);

        void onFail(String err);
    }

    interface Model extends BaseModel {
        Observable<ResponseBody> login();
    }

    abstract class Presenter extends BasePresenter<View,Model> {
        public abstract void login();
    }
}
