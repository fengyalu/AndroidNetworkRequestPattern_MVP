package com.mvp.demo.fyl.luodao.mvp.contract;

import com.mvp.demo.fyl.luodao.base.BaseModel;
import com.mvp.demo.fyl.luodao.base.BasePresenter;
import com.mvp.demo.fyl.luodao.base.BaseView;
import com.mvp.demo.fyl.luodao.bean.login.LoginInfo;
import com.mvp.demo.fyl.luodao.exception.ExceptionHandle;

import java.util.Map;

import rx.Observable;

/**
 * Created by Administrator on 2018/7/16.
 */

public interface LoginContract {
    interface View extends BaseView{
        void sucess(String str);
        void fail(ExceptionHandle.ResponeThrowable e);
    }

    interface Model extends BaseModel{
        Observable<LoginInfo> login(Map<String,String> map);
    }

    abstract class Presenter extends BasePresenter<View,Model>{
        public abstract void login(String userName,String passWord);
    }
}
