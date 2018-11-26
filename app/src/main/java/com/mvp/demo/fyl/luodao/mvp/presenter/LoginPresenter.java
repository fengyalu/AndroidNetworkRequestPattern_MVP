package com.mvp.demo.fyl.luodao.mvp.presenter;

import com.mvp.demo.fyl.luodao.bean.login.LoginInfo;
import com.mvp.demo.fyl.luodao.exception.ExceptionHandle;
import com.mvp.demo.fyl.luodao.mvp.contract.LoginContract;
import com.mvp.demo.fyl.luodao.mvp.model.LoginModel;

import java.util.HashMap;
import java.util.Map;

import rx.Subscriber;
import rx.Subscription;

/**
 * Created by fyl on 2018/7/16.
 */

public class LoginPresenter extends LoginContract.Presenter {
    private LoginContract.View view;
    private final LoginContract.Model model;

    public LoginPresenter(LoginContract.View view) {
        this.view = view;
        model = new LoginModel();
    }


    @Override
    public void login(String userName, String passWord) {
        Map<String,String> map=new HashMap<>();
        map.put("userName",userName);
        map.put("passWord",passWord);
        Subscription subscription= null;
        try {
            subscription = model.login(map)
                    .subscribe(new Subscriber<LoginInfo>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            view.fail(ExceptionHandle.handleException(e));
                        }

                        @Override
                        public void onNext(LoginInfo loginInfo) {
                            if ("A00001".equals(loginInfo.getResCode())){
                                view.sucess(loginInfo.getResMsg());
                            }else {
                                view.fail(ExceptionHandle.handleErrorMsg(loginInfo));
                            }
                        }
                    });
            subscribe(subscription);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
