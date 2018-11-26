package com.mvp.demo.fyl.luodao.mvp.model;

import com.mvp.demo.fyl.luodao.bean.StationInfo;
import com.mvp.demo.fyl.luodao.bean.TransTimeList;
import com.mvp.demo.fyl.luodao.manager.ConstantUrl;
import com.mvp.demo.fyl.luodao.mvp.contract.StationContract;
import com.mvp.demo.fyl.luodao.mvp.contract.TimeListContract;
import com.mvp.demo.fyl.luodao.net.NetUtils;
import com.mvp.demo.fyl.luodao.rx.RxSchedulers;
import com.mvp.demo.fyl.luodao.service.StationService;
import com.mvp.demo.fyl.luodao.service.TimeListService;

import java.util.Map;

import rx.Observable;

/**
 * Created by fengyalu on 18-7-13.
 */

public class TimeListModel implements TimeListContract.Model{
    @Override
    public Observable<TransTimeList> getTimeList(Map<String,String> map) {
            return NetUtils.getInstance()
                    .getService(TimeListService.class, ConstantUrl.QUERY_TIME_LIST)
                    .getTimeList(map)
                    .compose(RxSchedulers.<TransTimeList>switchThread());
    }
}
