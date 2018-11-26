package com.mvp.demo.fyl.luodao.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/7/24 0024.
 */

public class TransTimeList {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"beginCity":"北京","beginStation":"北京西","updateTime":"2016-03-17 14:09:51","textHead":["站次","站名","日期","到达时间","开车时间","停车时间","里程","硬座","硬卧下","软卧下"],"trainDateTimeLong":1459440000000,"endStation":"昆明","beginTime":"08:55","endCity":"昆明","endTime":"19:33","usedTime":2078,"msg":"查询成功!","ret_code":0,"num":"Z53","flag":true,"allMil":"3174公里","context":[[1,"北京西","-","起点站","08:55","-",0,"0","0","0"],[2,"保定","第一天","10:09","10:11","2分","146公里","23.5","77.5","110.5"],[3,"石家庄","第一天","11:23","11:27","4分","281公里","43.5","97.5","141.5"],[4,"邢台","第一天","12:14","12:17","3分","390公里","54.5","108.5","161.5"],[5,"沙河市","第一天","12:32","12:34","2分","414公里","62.5","128","177"],[6,"安阳","第一天","13:32","13:34","2分","502公里","72","136","204"],[7,"新乡","第一天","14:24","14:27","3分","609公里","81","154","231"],[8,"郑州","第一天","15:12","15:18","6分","689公里","93","174","263"],[9,"许昌","第一天","16:00","16:02","2分","775公里","102","190","285"],[10,"武昌","第一天","19:52","19:58","6分","1225公里","152.5","279.5","427.5"],[11,"长沙","第一天","23:11","23:17","6分","1587公里","189.5","343.5","527.5"],[12,"娄底","第二天","01:09","01:15","6分","1764公里","201","361","575"],[13,"怀化","第二天","05:07","05:16","9分","2079公里","229","416","640"],[14,"玉屏","第二天","06:51","06:58","7分","2199公里","240","436","669"],[15,"镇远","第二天","07:50","07:54","4分","2260公里","243","477","694"],[16,"凯里","第二天","09:05","09:11","6分","2348公里","254.5","457","729"],[17,"贵阳","第二天","11:34","11:57","23分","2536公里","268.5","487.5","751.5"],[18,"安顺","第二天","13:09","13:17","8分","2633公里","278.5","506.5","780.5"],[19,"六盘水","第二天","15:27","15:40","13分","2785公里","290.5","525.5","810.5"],[20,"宣威","第二天","17:12","17:18","6分","2916公里","299.5","542.5","838.5"],[21,"曲靖","第二天","18:07","18:16","9分","3017公里","302.5","549.5","851.5"],[22,"昆明","第二天","19:33","终到站","-","3174公里","317","575","887"]],"trainDate":"2016-04-01","trainType":"直达特快","updateTimeLong":1458194991637}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * beginCity : 北京
         * beginStation : 北京西
         * updateTime : 2016-03-17 14:09:51
         * textHead : ["站次","站名","日期","到达时间","开车时间","停车时间","里程","硬座","硬卧下","软卧下"]
         * trainDateTimeLong : 1459440000000
         * endStation : 昆明
         * beginTime : 08:55
         * endCity : 昆明
         * endTime : 19:33
         * usedTime : 2078
         * msg : 查询成功!
         * ret_code : 0
         * num : Z53
         * flag : true
         * allMil : 3174公里
         * context : [[1,"北京西","-","起点站","08:55","-",0,"0","0","0"],[2,"保定","第一天","10:09","10:11","2分","146公里","23.5","77.5","110.5"],[3,"石家庄","第一天","11:23","11:27","4分","281公里","43.5","97.5","141.5"],[4,"邢台","第一天","12:14","12:17","3分","390公里","54.5","108.5","161.5"],[5,"沙河市","第一天","12:32","12:34","2分","414公里","62.5","128","177"],[6,"安阳","第一天","13:32","13:34","2分","502公里","72","136","204"],[7,"新乡","第一天","14:24","14:27","3分","609公里","81","154","231"],[8,"郑州","第一天","15:12","15:18","6分","689公里","93","174","263"],[9,"许昌","第一天","16:00","16:02","2分","775公里","102","190","285"],[10,"武昌","第一天","19:52","19:58","6分","1225公里","152.5","279.5","427.5"],[11,"长沙","第一天","23:11","23:17","6分","1587公里","189.5","343.5","527.5"],[12,"娄底","第二天","01:09","01:15","6分","1764公里","201","361","575"],[13,"怀化","第二天","05:07","05:16","9分","2079公里","229","416","640"],[14,"玉屏","第二天","06:51","06:58","7分","2199公里","240","436","669"],[15,"镇远","第二天","07:50","07:54","4分","2260公里","243","477","694"],[16,"凯里","第二天","09:05","09:11","6分","2348公里","254.5","457","729"],[17,"贵阳","第二天","11:34","11:57","23分","2536公里","268.5","487.5","751.5"],[18,"安顺","第二天","13:09","13:17","8分","2633公里","278.5","506.5","780.5"],[19,"六盘水","第二天","15:27","15:40","13分","2785公里","290.5","525.5","810.5"],[20,"宣威","第二天","17:12","17:18","6分","2916公里","299.5","542.5","838.5"],[21,"曲靖","第二天","18:07","18:16","9分","3017公里","302.5","549.5","851.5"],[22,"昆明","第二天","19:33","终到站","-","3174公里","317","575","887"]]
         * trainDate : 2016-04-01
         * trainType : 直达特快
         * updateTimeLong : 1458194991637
         */

        private String beginCity;
        private String beginStation;
        private String updateTime;
        private long trainDateTimeLong;
        private String endStation;
        private String beginTime;
        private String endCity;
        private String endTime;
        private int usedTime;
        private String msg;
        private int ret_code;
        private String num;
        private boolean flag;
        private String allMil;
        private String trainDate;
        private String trainType;
        private long updateTimeLong;
        private List<String> textHead;
        private List<List> context;

        public String getBeginCity() {
            return beginCity;
        }

        public void setBeginCity(String beginCity) {
            this.beginCity = beginCity;
        }

        public String getBeginStation() {
            return beginStation;
        }

        public void setBeginStation(String beginStation) {
            this.beginStation = beginStation;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public long getTrainDateTimeLong() {
            return trainDateTimeLong;
        }

        public void setTrainDateTimeLong(long trainDateTimeLong) {
            this.trainDateTimeLong = trainDateTimeLong;
        }

        public String getEndStation() {
            return endStation;
        }

        public void setEndStation(String endStation) {
            this.endStation = endStation;
        }

        public String getBeginTime() {
            return beginTime;
        }

        public void setBeginTime(String beginTime) {
            this.beginTime = beginTime;
        }

        public String getEndCity() {
            return endCity;
        }

        public void setEndCity(String endCity) {
            this.endCity = endCity;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public int getUsedTime() {
            return usedTime;
        }

        public void setUsedTime(int usedTime) {
            this.usedTime = usedTime;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }

        public String getAllMil() {
            return allMil;
        }

        public void setAllMil(String allMil) {
            this.allMil = allMil;
        }

        public String getTrainDate() {
            return trainDate;
        }

        public void setTrainDate(String trainDate) {
            this.trainDate = trainDate;
        }

        public String getTrainType() {
            return trainType;
        }

        public void setTrainType(String trainType) {
            this.trainType = trainType;
        }

        public long getUpdateTimeLong() {
            return updateTimeLong;
        }

        public void setUpdateTimeLong(long updateTimeLong) {
            this.updateTimeLong = updateTimeLong;
        }

        public List<String> getTextHead() {
            return textHead;
        }

        public void setTextHead(List<String> textHead) {
            this.textHead = textHead;
        }

        public List<List> getContext() {
            return context;
        }

        public void setContext(List<List> context) {
            this.context = context;
        }
    }
}
