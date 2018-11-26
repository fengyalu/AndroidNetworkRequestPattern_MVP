package com.mvp.demo.fyl.luodao.mvp.presenter;

import android.util.Log;

import com.mvp.demo.fyl.luodao.mvp.contract.MainContract;
import com.mvp.demo.fyl.luodao.mvp.model.MainModel;

import java.io.IOException;

import okhttp3.ResponseBody;
import rx.Subscriber;
import rx.Subscription;

/**
 * Created by fengyalu on 18-7-12.
 */

public class MainPresenter extends MainContract.Presenter{

    private MainContract.View view;
    private final MainModel model;

    public MainPresenter(MainContract.View view) {
        this.view=view;
        model = new MainModel();
    }

    @Override
    public void login() {
        Subscription subscription=model.login()
                .subscribe(new Subscriber<ResponseBody>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onNext(ResponseBody responseBody) {
                try {
                    view.onSucceed(responseBody.string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        subscribe(subscription);
    }
}
