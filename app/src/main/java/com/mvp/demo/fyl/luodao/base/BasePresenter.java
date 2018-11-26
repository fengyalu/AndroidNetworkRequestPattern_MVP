package com.mvp.demo.fyl.luodao.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by fengyalu on 18-7-13.
 */

public class BasePresenter<View extends BaseView, Model extends BaseModel> {
    protected View view;
    protected Model model;

    private CompositeSubscription compositeSubscription;


    protected void subscribe(Subscription subscription) {
        try {
            if (compositeSubscription == null) {
                compositeSubscription = new CompositeSubscription();
            }
            compositeSubscription.add(subscription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void unsubscribe() {
        if (view != null) {
            view = null;
        }
        if (compositeSubscription != null && compositeSubscription.hasSubscriptions()) {
            compositeSubscription.clear();
        }
    }

}
