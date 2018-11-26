package com.mvp.demo.fyl.luodao.mvp.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mvp.demo.fyl.luodao.R;
import com.mvp.demo.fyl.luodao.bean.StationInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/7/22 0022.
 */

public class StationAdapter extends BaseAdapter {
    private Context context;
    private List<StationInfo.ShowapiResBodyBean.TrainsBean> list;

    public StationAdapter(Context context) {
        this.context = context;
    }

    public void setList(List<StationInfo.ShowapiResBodyBean.TrainsBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        // 若无可重用的 view 则进行加载
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_station, parent, false);
            // 初始化 ViewHolder 方便重用
            viewHolder = new ViewHolder();
            viewHolder.from = (TextView) convertView.findViewById(R.id.from);
            viewHolder.fromTime = (TextView) convertView.findViewById(R.id.from_time);
            viewHolder.num = (TextView) convertView.findViewById(R.id.num);
            viewHolder.to = (TextView) convertView.findViewById(R.id.to);
            viewHolder.toTime = (TextView) convertView.findViewById(R.id.to_time);
            convertView.setTag(viewHolder);
        } else { // 否则进行重用
            viewHolder = (ViewHolder) convertView.getTag();
        }
        try {
            viewHolder.from.setText(list.get(position).getFromCity());
            viewHolder.fromTime.setText(list.get(position).getFromTime());
            viewHolder.num.setText(String.valueOf(list.get(position).getNum()));
            viewHolder.to.setText(list.get(position).getToCity());
            viewHolder.toTime.setText(list.get(position).getToTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return convertView;
    }

    public static class ViewHolder {
        private TextView from, fromTime, num, to, toTime;
    }
}
