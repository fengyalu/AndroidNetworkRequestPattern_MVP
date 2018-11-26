package com.mvp.demo.fyl.luodao.net;

import android.util.Log;

import com.mvp.demo.fyl.luodao.manager.UrlManager;

import java.util.Properties;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by fyl on 18-7-12.
 */

public class NetUtils {
    private static final String TAG = "NetUtils";

    private volatile static NetUtils instance;

    public static NetUtils getInstance() {
        if (instance == null) {
            synchronized (NetUtils.class) {
                if (instance == null) {
                    instance = new NetUtils();
                }
            }
        }
        return instance;
    }

    private Retrofit creatRetrofitService(String url) {
        Retrofit retrofit = null;

        try {
            //日志拦截器
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    // .addInterceptor(new TokenInterceptor())//添加token
                    .addInterceptor(loggingInterceptor)//添加消息拦截
                    .build();


            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())//如果网络访问返回的是json字符串，使用gson转换器
                    .addConverterFactory(GsonConverterFactory.create())//此处顺序不能和上面对调，否则不能同时兼容普通字符串和Json格式字符串
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//为了支持rxjava,需要添加下面这个把 Retrofit 转成RxJava可用的适配类
                    .client(client)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retrofit;
    }

    public <T> T getService(Class<T> clazz, String urlType) {
        Retrofit retrofit = null;
        try {
            Properties urlConfig = UrlManager.getinstance().getProperties();
            String url = urlConfig.getProperty(urlType);
            Log.i(TAG, "getService: "+url);
            retrofit = creatRetrofitService(url);
            return retrofit.create(clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }


}
