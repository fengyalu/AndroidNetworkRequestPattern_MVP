package com.mvp.demo.fyl.luodao.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mvp.demo.fyl.luodao.R;


public abstract class BaseActivity <Presenter extends BasePresenter>extends AppCompatActivity{

    protected Presenter presenter;
    protected abstract Presenter onCreatePresenter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        if (onCreatePresenter()!=null){
            presenter=onCreatePresenter();
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            presenter.unsubscribe();
        }
    }
}
