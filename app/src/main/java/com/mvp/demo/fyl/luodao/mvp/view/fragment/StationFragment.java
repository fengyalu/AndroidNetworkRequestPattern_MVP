package com.mvp.demo.fyl.luodao.mvp.view.fragment;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.lljjcoder.Interface.OnCityItemClickListener;
import com.lljjcoder.bean.CityBean;
import com.lljjcoder.bean.DistrictBean;
import com.lljjcoder.bean.ProvinceBean;
import com.lljjcoder.citywheel.CityConfig;
import com.lljjcoder.style.citylist.CityListSelectActivity;
import com.lljjcoder.style.citylist.Toast.ToastUtils;
import com.lljjcoder.style.citylist.bean.CityInfoBean;
import com.lljjcoder.style.citylist.utils.CityListLoader;
import com.lljjcoder.style.citypickerview.CityPickerView;
import com.mvp.demo.fyl.luodao.R;
import com.mvp.demo.fyl.luodao.mvp.view.activity.StationActivity;

import java.util.Calendar;

import static android.app.Activity.RESULT_OK;


/**
 * A simple {@link Fragment} subclass.
 */
public class StationFragment extends Fragment implements View.OnClickListener {


    private TextView editTime, editBegin, editEnd;
    private Button button;
    //申明对象
    CityPickerView mPicker = new CityPickerView();

    public StationFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_station, container, false);
        /**
         * 预先加载一级列表显示 全国所有城市市的数据
         */
        CityListLoader.getInstance().loadCityData(getActivity());
        initView(view);
        initOnClick();
        return view;
    }

    private void initView(View view) {
        editBegin = (TextView) view.findViewById(R.id.edit_begin);
        editEnd = (TextView) view.findViewById(R.id.edit_end);
        editTime = (TextView) view.findViewById(R.id.edit_time);
        button = (Button) view.findViewById(R.id.query_station);
    }

    private void initOnClick() {
        button.setOnClickListener(this);
        editBegin.setOnClickListener(this);
        editTime.setOnClickListener(this);
        editEnd.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.query_station:
                String begin = editBegin.getText().toString().trim();
                String end = editEnd.getText().toString().trim();
                String time = editTime.getText().toString().trim();
                if (!TextUtils.isEmpty(begin) && !TextUtils.isEmpty(end) && !TextUtils.isEmpty(time)) {
                    Intent intent = new Intent(getActivity(), StationActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("begin", begin);
                    bundle.putString("end", end);
                    bundle.putString("time", time);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                break;
            case R.id.edit_time:
                setTime();
                break;
            case R.id.edit_begin:
                getFromCity();
                break;
            case R.id.edit_end:
                getToCity();
                break;
            default:
                break;
        }
    }


    private void getFromCity() {
        Intent intent = new Intent(getActivity(), CityListSelectActivity.class);
        startActivityForResult(intent, 0);
    }

    private void getToCity() {
        Intent intent = new Intent(getActivity(), CityListSelectActivity.class);
        startActivityForResult(intent, 1);
    }

    private void setTime() {
        try {
            Calendar calendar = Calendar.getInstance();
            DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                            //                                binding.begin.setVisibility(View.GONE);
                            //                                binding.tvBegin.setVisibility(View.VISIBLE);
                            String time;
                            if (monthOfYear < 9) {
                                if (dayOfMonth < 9) {
                                    time = year + "-" + "0" + (monthOfYear + 1)
                                            + "-" + "0" + dayOfMonth;
                                } else {
                                    time = year + "-" + "0" + (monthOfYear + 1)
                                            + "-" + dayOfMonth;
                                }

                            } else {
                                if (dayOfMonth < 9) {
                                    time = year + "-" + (monthOfYear + 1)
                                            + "-" + "0" + dayOfMonth;
                                } else {
                                    time = year + "-" + (monthOfYear + 1)
                                            + "-" + dayOfMonth;
                                }
                            }
                            if (time != null) {
                                editTime.setText(time);
                            }

                        }
                    },

                    calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH));
            datePickerDialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (data == null) {
                return;
            }
            Bundle bundle = data.getExtras();

            CityInfoBean cityInfoBean = (CityInfoBean) bundle.getParcelable("cityinfo");

            if (null == cityInfoBean) {
                return;
            }
            String name = cityInfoBean.getName();
            name=name.substring(0,name.length()-1);
            if (requestCode == 0) {
                editBegin.setText(name);
            } else if (requestCode == 1) {
                editEnd.setText(name);
            }
        }
    }
}
