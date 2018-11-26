package com.mvp.demo.fyl.luodao.mvp.view.adapter;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.mvp.demo.fyl.luodao.R;

import java.util.ArrayList;


/**
 * Created by fyl on 2018/3/5.
 */

public class HomePagerFragmentPagerAdapter extends FragmentPagerAdapter {
  private   ArrayList<Fragment> list;
    private Context context;
    private String[] titles;
    private TabLayout tabLayout;

    public HomePagerFragmentPagerAdapter(FragmentManager fm, ArrayList<Fragment> list, Context context, String[] titles, TabLayout tabLayout) {
        super(fm);
        this.list = list;
        this.context=context;
        this.titles=titles;
        this.tabLayout=tabLayout;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    public View getTabView(int position) {
        View v = LayoutInflater.from(context).inflate(R.layout.tab_check_mail, null);
        TextView textView = (TextView) v.findViewById(R.id.tv_title);
        textView.setText(titles[position]);
        textView.setTextColor(tabLayout.getTabTextColors());
        return v;
    }
}