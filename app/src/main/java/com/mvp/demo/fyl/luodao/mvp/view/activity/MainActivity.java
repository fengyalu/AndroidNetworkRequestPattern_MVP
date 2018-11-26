package com.mvp.demo.fyl.luodao.mvp.view.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

import com.mvp.demo.fyl.luodao.R;
import com.mvp.demo.fyl.luodao.base.BaseActivity;
import com.mvp.demo.fyl.luodao.mvp.contract.MainContract;
import com.mvp.demo.fyl.luodao.mvp.presenter.MainPresenter;
import com.mvp.demo.fyl.luodao.mvp.view.adapter.HomePagerFragmentPagerAdapter;
import com.mvp.demo.fyl.luodao.mvp.view.fragment.StationFragment;
import com.mvp.demo.fyl.luodao.mvp.view.fragment.TrainFragment;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View,View.OnClickListener {
    private static final String TAG = "MainActivity";

    private LinearLayout linearLayout;

    private HomePagerFragmentPagerAdapter adapter;
    private String[] titles = {"到站查询", "车次查询"};
    private ArrayList<Fragment> fragmentList;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected MainPresenter onCreatePresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initViewPager();
        initListener();
    }

    private void initListener() {
        linearLayout.setOnClickListener(this);
    }

    private void initView() {
        fragmentList = new ArrayList<>();
        linearLayout= (LinearLayout) findViewById(R.id.title_bar);
        viewPager = (ViewPager) findViewById(R.id.viewPager_main);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
    }


    private void initViewPager() {
        try {
            StationFragment stationFragment = new StationFragment();
            TrainFragment trainFragment = new TrainFragment();
          //  CityListFragment cityListFragment = new CityListFragment();
            fragmentList.add(stationFragment);
            fragmentList.add(trainFragment);
          //  fragmentList.add(cityListFragment);
            adapter = new HomePagerFragmentPagerAdapter(getSupportFragmentManager(), fragmentList, this, titles, tabLayout);
            viewPager.setAdapter(adapter);
            tabLayout.setupWithViewPager(viewPager);
            for (int i = 0; i < tabLayout.getTabCount(); i++) {
                TabLayout.Tab tab = tabLayout.getTabAt(i);
                tab.setCustomView(adapter.getTabView(i));
            }
            //ViewPager显示第3个Fragment常用界面
            viewPager.setCurrentItem(0);
            tabLayout.getTabAt(0).select();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    public void onSucceed(String data) {
    }

    @Override
    public void onFail(String err) {
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.title_bar:
                finish();
                break;
            default:
                break;
        }
    }
}
