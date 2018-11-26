package com.mvp.demo.fyl.luodao.service;


import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by fyl on 18-7-12.
 */

public interface MainService {
    /**
     * 表单提交要加 @FormUrlEncoded
     * 登录
     * @return
     */
    // @FormUrlEncoded
    @POST("common/loginandpremission")
    //Call<ResponseBody> login(@FieldMap Map<String, String> map);
    Observable<ResponseBody> login(@Body RequestBody loginStr);
}
