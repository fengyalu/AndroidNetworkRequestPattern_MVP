package com.mvp.demo.fyl.luodao.service;

import com.mvp.demo.fyl.luodao.bean.TransTimeList;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by fengyalu on 18-7-13.
 */

public interface TimeListService {
    /**
     * 表单提交要加 @FormUrlEncoded
     * @return
     */
     @FormUrlEncoded
    @POST("909-2")
    Observable<TransTimeList> getTimeList(@FieldMap Map<String, String> map);
}
