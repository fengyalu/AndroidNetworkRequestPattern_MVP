package com.mvp.demo.fyl.luodao.mvp.model;

import com.google.gson.Gson;
import com.mvp.demo.fyl.luodao.mvp.contract.MainContract;
import com.mvp.demo.fyl.luodao.net.NetUtils;
import com.mvp.demo.fyl.luodao.rx.RxSchedulers;
import com.mvp.demo.fyl.luodao.service.MainService;

import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import rx.Observable;

/**
 * Created by fyl on 18-7-12.
 */

public class MainModel implements MainContract.Model{


    @Override
    public Observable<ResponseBody> login() {
        try {
            Map<String,String> map=new HashMap<>();
            map.put("person_no", "yonganlu");
            map.put("password", "post123456");
            String str = new Gson().toJson(map);
            RequestBody body = RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), str);
            return NetUtils.getInstance()
                    .getService(MainService.class,"")
                    .login(body)
                    .compose(RxSchedulers.<ResponseBody>switchThread());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
