package com.mvp.demo.fyl.luodao.mvp.model;

import com.mvp.demo.fyl.luodao.bean.StationInfo;
import com.mvp.demo.fyl.luodao.manager.ConstantEnvironment;
import com.mvp.demo.fyl.luodao.manager.ConstantUrl;
import com.mvp.demo.fyl.luodao.mvp.contract.StationContract;
import com.mvp.demo.fyl.luodao.net.NetUtils;
import com.mvp.demo.fyl.luodao.rx.RxSchedulers;
import com.mvp.demo.fyl.luodao.service.StationService;

import java.util.HashMap;
import java.util.Map;

import rx.Observable;

/**
 * Created by fengyalu on 18-7-13.
 */

public class StationModel implements StationContract.Model{
    @Override
    public Observable<StationInfo> getStation(Map<String,String> map) {
            return NetUtils.getInstance()
                    .getService(StationService.class, ConstantUrl.QUERY_STATION)
                    .getStation(map)
                    .compose(RxSchedulers.<StationInfo>switchThread());
    }
}
