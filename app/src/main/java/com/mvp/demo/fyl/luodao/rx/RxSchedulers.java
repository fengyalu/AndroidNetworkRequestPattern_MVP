package com.mvp.demo.fyl.luodao.rx;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by fengyalu on 18-7-12.
 */

public class RxSchedulers {

    public static <T> Observable.Transformer<T, T> switchThread() {
        try {
            return new Observable.Transformer<T, T>() {
                @Override
                public Observable<T> call(Observable<T> tObservable) {
                    return tObservable
                            .subscribeOn(Schedulers.io())
                            .unsubscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread());
                }
            };
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}