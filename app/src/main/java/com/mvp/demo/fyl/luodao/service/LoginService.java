package com.mvp.demo.fyl.luodao.service;


import com.mvp.demo.fyl.luodao.bean.login.LoginInfo;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by fyl on 2018/7/16.
 */

public interface LoginService {
    @FormUrlEncoded
    @POST("login")
    Observable<LoginInfo> login(@FieldMap Map<String,String> map);
}
