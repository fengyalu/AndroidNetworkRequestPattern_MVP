package com.mvp.demo.fyl.luodao.mvp.model;

import com.mvp.demo.fyl.luodao.bean.login.LoginInfo;
import com.mvp.demo.fyl.luodao.manager.ConstantUrl;
import com.mvp.demo.fyl.luodao.mvp.contract.LoginContract;
import com.mvp.demo.fyl.luodao.net.NetUtils;
import com.mvp.demo.fyl.luodao.rx.RxSchedulers;
import com.mvp.demo.fyl.luodao.service.LoginService;

import java.util.Map;

import rx.Observable;

/**
 * Created by Administrator on 2018/7/16.
 */

public class LoginModel implements LoginContract.Model {
    @Override
    public Observable<LoginInfo> login(Map<String, String> map) {
        return NetUtils.getInstance()
                .getService(LoginService.class, ConstantUrl.LOGIN)
                .login(map)
                .compose(RxSchedulers.<LoginInfo>switchThread());
    }
}
