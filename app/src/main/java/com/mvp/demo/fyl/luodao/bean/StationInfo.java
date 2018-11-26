package com.mvp.demo.fyl.luodao.bean;

import java.util.List;

/**
 * Created by fengyalu on 18-7-13.
 */

public class StationInfo {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"flag":true,"from":"北京","msg":"查询成功!","ret_code":"0","to":"武汉","trainDate":"2016-03-18","trains":[{"num":"K599","fromTime":"05:15","toTime":"22:10","usedTime":1015,"fromCity":"北京西","toCity":"武昌","beginCity":"包头","endCity":"广州","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"0"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"5"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"205"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"9"}}},{"num":"G507","fromTime":"06:53","toTime":"12:24","usedTime":331,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"汉口","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"17"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"106"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"809"}}},{"num":"G401","fromTime":"07:05","toTime":"12:29","usedTime":324,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"贵阳北","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"3"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"11"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"281"}}},{"num":"G501","fromTime":"07:10","toTime":"12:34","usedTime":324,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"长沙南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"26"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"138"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"675"}}},{"num":"G529","fromTime":"07:33","toTime":"12:53","usedTime":320,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"南宁东","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"22"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"102"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"632"}}},{"num":"G71","fromTime":"07:40","toTime":"13:05","usedTime":325,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"深圳北","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"21"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"89"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"283"}}},{"num":"K21","fromTime":"08:08","toTime":"01:27","usedTime":1039,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"桂林北","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"116"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"248"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"175"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"4"}}},{"num":"G307","fromTime":"08:30","toTime":"13:47","usedTime":317,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"成都东","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"8"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"1"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"371"}}},{"num":"Z149","fromTime":"08:45","toTime":"19:45","usedTime":660,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"贵阳","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"144"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"313"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"38"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"8"}}},{"num":"K967","fromTime":"08:46","toTime":"01:02","usedTime":976,"fromCity":"北京","toCity":"武昌","beginCity":"北京","endCity":"张家界","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"132"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"256"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"161"},"softsleeperdown":{"price":449.5,"ticketName":"软卧","ticketNum":"2"}}},{"num":"G81","fromTime":"08:55","toTime":"13:16","usedTime":261,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"贵阳北","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"11"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"110"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"469"}}},{"num":"Z53","fromTime":"08:55","toTime":"19:52","usedTime":657,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"昆明","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"52"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"202"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"68"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"20"}}},{"num":"G83","fromTime":"09:00","toTime":"13:21","usedTime":261,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"长沙南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"8"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"1"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"446"}}},{"num":"G421","fromTime":"09:07","toTime":"14:36","usedTime":329,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"南宁东","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"4"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"10"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"757"}}},{"num":"G511","fromTime":"09:27","toTime":"14:55","usedTime":328,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"74"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"217"},"specialseat":{"price":990.5,"ticketName":"特等座","ticketNum":"12"}}},{"num":"G309","fromTime":"09:32","toTime":"15:16","usedTime":344,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"重庆北","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"3"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"3"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"675"}}},{"num":"G79","fromTime":"10:00","toTime":"14:17","usedTime":257,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"深圳北","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"1"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"38"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"0"}}},{"num":"G65","fromTime":"10:33","toTime":"15:52","usedTime":319,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"广州南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"21"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"101"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"443"}}},{"num":"G487","fromTime":"10:45","toTime":"15:25","usedTime":280,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"南昌西","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"10"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"0"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"578"}}},{"num":"G557","fromTime":"11:07","toTime":"17:50","usedTime":403,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"4"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"24"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"456"}}},{"num":"Z49","fromTime":"11:32","toTime":"21:52","usedTime":620,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"成都","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"0"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"62"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"Z35","fromTime":"11:40","toTime":"22:02","usedTime":622,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"广州","ticketInfo":{"advancedsoftsleeper":{"price":789.5,"ticketName":"高级软卧","ticketNum":"2"},"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"140"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"43"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"178"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"4"}}},{"num":"G403","fromTime":"11:43","toTime":"17:11","usedTime":328,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"贵阳北","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"0"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"3"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"136"}}},{"num":"G67","fromTime":"12:13","toTime":"17:59","usedTime":346,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"广州南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"24"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"117"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"420"}}},{"num":"T145","fromTime":"12:32","toTime":"01:21","usedTime":769,"fromCity":"北京","toCity":"武昌","beginCity":"北京","endCity":"南昌","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"240"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"104"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"94"},"softsleeperdown":{"price":449.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"G491","fromTime":"12:34","toTime":"18:26","usedTime":352,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"南昌西","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"0"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"81"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"142"},"specialseat":{"price":990.5,"ticketName":"特等座","ticketNum":"7"}}},{"num":"G555","fromTime":"12:51","toTime":"17:34","usedTime":283,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"宜昌东","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"0"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"14"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"3"}}},{"num":"Z97","fromTime":"13:00","toTime":"23:16","usedTime":616,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"广州东","ticketInfo":{"advancedsoftsleeper":{"price":789.5,"ticketName":"高级软卧","ticketNum":"6"},"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"96"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"179"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"96"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"55"}}},{"num":"G69","fromTime":"13:05","toTime":"18:12","usedTime":307,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"广州南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"12"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"100"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"257"}}},{"num":"Z161","fromTime":"13:06","toTime":"23:43","usedTime":637,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"昆明","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"249"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"238"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"121"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"1"}}},{"num":"G519","fromTime":"14:05","toTime":"19:28","usedTime":323,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"4"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"32"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"629"}}},{"num":"T167","fromTime":"14:12","toTime":"02:46","usedTime":754,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"南昌","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"250"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"85"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"G503","fromTime":"14:38","toTime":"19:47","usedTime":309,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"长沙南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"0"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"1"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"354"}}},{"num":"G587","fromTime":"14:55","toTime":"20:43","usedTime":348,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"18"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"86"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"794"}}},{"num":"Z13","fromTime":"15:00","toTime":"01:41","usedTime":641,"fromCity":"北京","toCity":"武昌","beginCity":"沈阳北","endCity":"广州东","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"232"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"109"},"softsleeperdown":{"price":449.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"G521","fromTime":"15:23","toTime":"21:38","usedTime":375,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"汉口","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"8"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"90"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"732"}}},{"num":"T1","fromTime":"15:25","toTime":"03:46","usedTime":741,"fromCity":"北京","toCity":"武昌","beginCity":"北京","endCity":"长沙","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"315"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"254"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"144"}}},{"num":"G505","fromTime":"15:40","toTime":"20:56","usedTime":316,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"长沙南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"1"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"2"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"237"}}},{"num":"Z5","fromTime":"16:09","toTime":"02:34","usedTime":625,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"南宁","ticketInfo":{"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"6"}}},{"num":"Z77","fromTime":"16:15","toTime":"02:40","usedTime":625,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"贵阳","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"218"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"295"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"107"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"47"}}},{"num":"G573","fromTime":"16:18","toTime":"21:29","usedTime":311,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"2"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"10"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"358"}}},{"num":"G585","fromTime":"16:23","toTime":"22:07","usedTime":344,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"18"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"102"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"841"}}},{"num":"G523","fromTime":"16:30","toTime":"21:47","usedTime":317,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"6"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"87"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"743"}}},{"num":"G525","fromTime":"17:14","toTime":"22:54","usedTime":340,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"汉口","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"10"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"79"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"744"}}},{"num":"Z3","fromTime":"17:43","toTime":"04:15","usedTime":632,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"宜昌东","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"381"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"431"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"Z285","fromTime":"17:50","toTime":"04:16","usedTime":626,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"南宁","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"114"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"183"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"3"}}},{"num":"Z95","fromTime":"18:02","toTime":"04:33","usedTime":631,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"重庆北","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"68"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"175"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"216"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"16"}}},{"num":"K157","fromTime":"18:12","toTime":"09:06","usedTime":894,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"湛江","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"72"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"113"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"G527","fromTime":"18:12","toTime":"23:40","usedTime":328,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"4"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"80"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"619"}}},{"num":"K471","fromTime":"21:13","toTime":"10:55","usedTime":822,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"昆明","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"248"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"214"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"T289","fromTime":"22:10","toTime":"10:24","usedTime":734,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"南宁","ticketInfo":{"advancedsoftsleeper":{"price":789.5,"ticketName":"高级软卧","ticketNum":"3"},"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"206"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"66"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"140"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"Z37","fromTime":"20:47","toTime":"07:06","usedTime":619,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"武昌","ticketInfo":{"advancedsoftsleeper":{"price":789.5,"ticketName":"高级软卧","ticketNum":"0"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"Z207","fromTime":"21:02","toTime":"08:06","usedTime":664,"fromCity":"北京","toCity":"武昌","beginCity":"天津","endCity":"长沙","ticketInfo":{"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}}]}
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
         * flag : true
         * from : 北京
         * msg : 查询成功!
         * ret_code : 0
         * to : 武汉
         * trainDate : 2016-03-18
         * trains : [{"num":"K599","fromTime":"05:15","toTime":"22:10","usedTime":1015,"fromCity":"北京西","toCity":"武昌","beginCity":"包头","endCity":"广州","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"0"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"5"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"205"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"9"}}},{"num":"G507","fromTime":"06:53","toTime":"12:24","usedTime":331,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"汉口","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"17"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"106"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"809"}}},{"num":"G401","fromTime":"07:05","toTime":"12:29","usedTime":324,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"贵阳北","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"3"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"11"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"281"}}},{"num":"G501","fromTime":"07:10","toTime":"12:34","usedTime":324,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"长沙南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"26"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"138"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"675"}}},{"num":"G529","fromTime":"07:33","toTime":"12:53","usedTime":320,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"南宁东","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"22"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"102"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"632"}}},{"num":"G71","fromTime":"07:40","toTime":"13:05","usedTime":325,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"深圳北","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"21"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"89"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"283"}}},{"num":"K21","fromTime":"08:08","toTime":"01:27","usedTime":1039,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"桂林北","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"116"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"248"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"175"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"4"}}},{"num":"G307","fromTime":"08:30","toTime":"13:47","usedTime":317,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"成都东","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"8"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"1"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"371"}}},{"num":"Z149","fromTime":"08:45","toTime":"19:45","usedTime":660,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"贵阳","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"144"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"313"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"38"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"8"}}},{"num":"K967","fromTime":"08:46","toTime":"01:02","usedTime":976,"fromCity":"北京","toCity":"武昌","beginCity":"北京","endCity":"张家界","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"132"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"256"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"161"},"softsleeperdown":{"price":449.5,"ticketName":"软卧","ticketNum":"2"}}},{"num":"G81","fromTime":"08:55","toTime":"13:16","usedTime":261,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"贵阳北","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"11"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"110"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"469"}}},{"num":"Z53","fromTime":"08:55","toTime":"19:52","usedTime":657,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"昆明","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"52"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"202"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"68"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"20"}}},{"num":"G83","fromTime":"09:00","toTime":"13:21","usedTime":261,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"长沙南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"8"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"1"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"446"}}},{"num":"G421","fromTime":"09:07","toTime":"14:36","usedTime":329,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"南宁东","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"4"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"10"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"757"}}},{"num":"G511","fromTime":"09:27","toTime":"14:55","usedTime":328,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"74"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"217"},"specialseat":{"price":990.5,"ticketName":"特等座","ticketNum":"12"}}},{"num":"G309","fromTime":"09:32","toTime":"15:16","usedTime":344,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"重庆北","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"3"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"3"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"675"}}},{"num":"G79","fromTime":"10:00","toTime":"14:17","usedTime":257,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"深圳北","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"1"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"38"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"0"}}},{"num":"G65","fromTime":"10:33","toTime":"15:52","usedTime":319,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"广州南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"21"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"101"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"443"}}},{"num":"G487","fromTime":"10:45","toTime":"15:25","usedTime":280,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"南昌西","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"10"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"0"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"578"}}},{"num":"G557","fromTime":"11:07","toTime":"17:50","usedTime":403,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"4"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"24"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"456"}}},{"num":"Z49","fromTime":"11:32","toTime":"21:52","usedTime":620,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"成都","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"0"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"62"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"Z35","fromTime":"11:40","toTime":"22:02","usedTime":622,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"广州","ticketInfo":{"advancedsoftsleeper":{"price":789.5,"ticketName":"高级软卧","ticketNum":"2"},"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"140"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"43"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"178"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"4"}}},{"num":"G403","fromTime":"11:43","toTime":"17:11","usedTime":328,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"贵阳北","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"0"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"3"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"136"}}},{"num":"G67","fromTime":"12:13","toTime":"17:59","usedTime":346,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"广州南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"24"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"117"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"420"}}},{"num":"T145","fromTime":"12:32","toTime":"01:21","usedTime":769,"fromCity":"北京","toCity":"武昌","beginCity":"北京","endCity":"南昌","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"240"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"104"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"94"},"softsleeperdown":{"price":449.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"G491","fromTime":"12:34","toTime":"18:26","usedTime":352,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"南昌西","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"0"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"81"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"142"},"specialseat":{"price":990.5,"ticketName":"特等座","ticketNum":"7"}}},{"num":"G555","fromTime":"12:51","toTime":"17:34","usedTime":283,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"宜昌东","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"0"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"14"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"3"}}},{"num":"Z97","fromTime":"13:00","toTime":"23:16","usedTime":616,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"广州东","ticketInfo":{"advancedsoftsleeper":{"price":789.5,"ticketName":"高级软卧","ticketNum":"6"},"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"96"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"179"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"96"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"55"}}},{"num":"G69","fromTime":"13:05","toTime":"18:12","usedTime":307,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"广州南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"12"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"100"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"257"}}},{"num":"Z161","fromTime":"13:06","toTime":"23:43","usedTime":637,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"昆明","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"249"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"238"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"121"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"1"}}},{"num":"G519","fromTime":"14:05","toTime":"19:28","usedTime":323,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"4"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"32"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"629"}}},{"num":"T167","fromTime":"14:12","toTime":"02:46","usedTime":754,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"南昌","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"250"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"85"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"G503","fromTime":"14:38","toTime":"19:47","usedTime":309,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"长沙南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"0"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"1"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"354"}}},{"num":"G587","fromTime":"14:55","toTime":"20:43","usedTime":348,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"18"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"86"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"794"}}},{"num":"Z13","fromTime":"15:00","toTime":"01:41","usedTime":641,"fromCity":"北京","toCity":"武昌","beginCity":"沈阳北","endCity":"广州东","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"232"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"109"},"softsleeperdown":{"price":449.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"G521","fromTime":"15:23","toTime":"21:38","usedTime":375,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"汉口","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"8"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"90"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"732"}}},{"num":"T1","fromTime":"15:25","toTime":"03:46","usedTime":741,"fromCity":"北京","toCity":"武昌","beginCity":"北京","endCity":"长沙","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"315"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"254"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"144"}}},{"num":"G505","fromTime":"15:40","toTime":"20:56","usedTime":316,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"长沙南","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"1"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"2"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"237"}}},{"num":"Z5","fromTime":"16:09","toTime":"02:34","usedTime":625,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"南宁","ticketInfo":{"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"6"}}},{"num":"Z77","fromTime":"16:15","toTime":"02:40","usedTime":625,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"贵阳","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"218"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"295"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"107"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"47"}}},{"num":"G573","fromTime":"16:18","toTime":"21:29","usedTime":311,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"2"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"10"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"358"}}},{"num":"G585","fromTime":"16:23","toTime":"22:07","usedTime":344,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"18"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"102"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"841"}}},{"num":"G523","fromTime":"16:30","toTime":"21:47","usedTime":317,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"6"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"87"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"743"}}},{"num":"G525","fromTime":"17:14","toTime":"22:54","usedTime":340,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"汉口","ticketInfo":{"businessseat":{"price":1640.5,"ticketName":"商务座","ticketNum":"10"},"firstseat":{"price":827.5,"ticketName":"一等座","ticketNum":"79"},"secondseat":{"price":519.5,"ticketName":"二等座","ticketNum":"744"}}},{"num":"Z3","fromTime":"17:43","toTime":"04:15","usedTime":632,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"宜昌东","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"381"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"431"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"Z285","fromTime":"17:50","toTime":"04:16","usedTime":626,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"南宁","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"114"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"183"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"3"}}},{"num":"Z95","fromTime":"18:02","toTime":"04:33","usedTime":631,"fromCity":"北京西","toCity":"汉口","beginCity":"北京西","endCity":"重庆北","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"68"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"175"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"216"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"16"}}},{"num":"K157","fromTime":"18:12","toTime":"09:06","usedTime":894,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"湛江","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"72"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"113"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"G527","fromTime":"18:12","toTime":"23:40","usedTime":328,"fromCity":"北京西","toCity":"武汉","beginCity":"北京西","endCity":"武汉","ticketInfo":{"businessseat":{"price":1642.5,"ticketName":"商务座","ticketNum":"4"},"firstseat":{"price":832.5,"ticketName":"一等座","ticketNum":"80"},"secondseat":{"price":520.5,"ticketName":"二等座","ticketNum":"619"}}},{"num":"K471","fromTime":"21:13","toTime":"10:55","usedTime":822,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"昆明","ticketInfo":{"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"248"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"214"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"T289","fromTime":"22:10","toTime":"10:24","usedTime":734,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"南宁","ticketInfo":{"advancedsoftsleeper":{"price":789.5,"ticketName":"高级软卧","ticketNum":"3"},"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"206"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"66"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"140"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"Z37","fromTime":"20:47","toTime":"07:06","usedTime":619,"fromCity":"北京西","toCity":"武昌","beginCity":"北京西","endCity":"武昌","ticketInfo":{"advancedsoftsleeper":{"price":789.5,"ticketName":"高级软卧","ticketNum":"0"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"0"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}},{"num":"Z207","fromTime":"21:02","toTime":"08:06","usedTime":664,"fromCity":"北京","toCity":"武昌","beginCity":"天津","endCity":"长沙","ticketInfo":{"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"0"}}}]
         */

        private boolean flag;
        private String from;
        private String msg;
        private String ret_code;
        private String to;
        private String trainDate;
        private List<TrainsBean> trains;

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getRet_code() {
            return ret_code;
        }

        public void setRet_code(String ret_code) {
            this.ret_code = ret_code;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getTrainDate() {
            return trainDate;
        }

        public void setTrainDate(String trainDate) {
            this.trainDate = trainDate;
        }

        public List<TrainsBean> getTrains() {
            return trains;
        }

        public void setTrains(List<TrainsBean> trains) {
            this.trains = trains;
        }

        public static class TrainsBean {
            /**
             * num : K599
             * fromTime : 05:15
             * toTime : 22:10
             * usedTime : 1015
             * fromCity : 北京西
             * toCity : 武昌
             * beginCity : 包头
             * endCity : 广州
             * ticketInfo : {"hardseat":{"price":152.5,"ticketName":"硬座","ticketNum":"0"},"hardsleepermid":{"price":279.5,"ticketName":"硬卧","ticketNum":"5"},"noseat":{"price":152.5,"ticketName":"无座","ticketNum":"205"},"softsleeperdown":{"price":427.5,"ticketName":"软卧","ticketNum":"9"}}
             */

            private String num;
            private String fromTime;
            private String toTime;
            private int usedTime;
            private String fromCity;
            private String toCity;
            private String beginCity;
            private String endCity;
            private TicketInfoBean ticketInfo;

            public String getNum() {
                return num;
            }

            public void setNum(String num) {
                this.num = num;
            }

            public String getFromTime() {
                return fromTime;
            }

            public void setFromTime(String fromTime) {
                this.fromTime = fromTime;
            }

            public String getToTime() {
                return toTime;
            }

            public void setToTime(String toTime) {
                this.toTime = toTime;
            }

            public int getUsedTime() {
                return usedTime;
            }

            public void setUsedTime(int usedTime) {
                this.usedTime = usedTime;
            }

            public String getFromCity() {
                return fromCity;
            }

            public void setFromCity(String fromCity) {
                this.fromCity = fromCity;
            }

            public String getToCity() {
                return toCity;
            }

            public void setToCity(String toCity) {
                this.toCity = toCity;
            }

            public String getBeginCity() {
                return beginCity;
            }

            public void setBeginCity(String beginCity) {
                this.beginCity = beginCity;
            }

            public String getEndCity() {
                return endCity;
            }

            public void setEndCity(String endCity) {
                this.endCity = endCity;
            }

            public TicketInfoBean getTicketInfo() {
                return ticketInfo;
            }

            public void setTicketInfo(TicketInfoBean ticketInfo) {
                this.ticketInfo = ticketInfo;
            }

            public static class TicketInfoBean {
                /**
                 * hardseat : {"price":152.5,"ticketName":"硬座","ticketNum":"0"}
                 * hardsleepermid : {"price":279.5,"ticketName":"硬卧","ticketNum":"5"}
                 * noseat : {"price":152.5,"ticketName":"无座","ticketNum":"205"}
                 * softsleeperdown : {"price":427.5,"ticketName":"软卧","ticketNum":"9"}
                 * "businessseat": {"price": 1640.5,"ticketName": "商务座","ticketNum": "17"}
                 *  "firstseat": {"price": 827.5,"ticketName": "一等座","ticketNum": "106"}
                 *   "secondseat": {"price": 519.5,"ticketName": "二等座","ticketNum": "809"}
                 */

                private HardseatBean hardseat;
                private HardsleepermidBean hardsleepermid;
                private NoseatBean noseat;
                private SoftsleeperdownBean softsleeperdown;
                private BusinessseatBean businessseat;
                private FirstseatBean firstseat;
                private Secondseat secondseat;

                public HardseatBean getHardseat() {
                    return hardseat;
                }

                public void setHardseat(HardseatBean hardseat) {
                    this.hardseat = hardseat;
                }

                public HardsleepermidBean getHardsleepermid() {
                    return hardsleepermid;
                }

                public void setHardsleepermid(HardsleepermidBean hardsleepermid) {
                    this.hardsleepermid = hardsleepermid;
                }

                public NoseatBean getNoseat() {
                    return noseat;
                }

                public void setNoseat(NoseatBean noseat) {
                    this.noseat = noseat;
                }

                public SoftsleeperdownBean getSoftsleeperdown() {
                    return softsleeperdown;
                }

                public void setSoftsleeperdown(SoftsleeperdownBean softsleeperdown) {
                    this.softsleeperdown = softsleeperdown;
                }

                public BusinessseatBean getBusinessseat() {
                    return businessseat;
                }

                public void setBusinessseat(BusinessseatBean businessseat) {
                    this.businessseat = businessseat;
                }

                public FirstseatBean getFirstseat() {
                    return firstseat;
                }

                public void setFirstseat(FirstseatBean firstseat) {
                    this.firstseat = firstseat;
                }

                public Secondseat getSecondseat() {
                    return secondseat;
                }

                public void setSecondseat(Secondseat secondseat) {
                    this.secondseat = secondseat;
                }

                public static class HardseatBean {
                    /**
                     * price : 152.5
                     * ticketName : 硬座
                     * ticketNum : 0
                     */

                    private double price;
                    private String ticketName;
                    private String ticketNum;

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public String getTicketName() {
                        return ticketName;
                    }

                    public void setTicketName(String ticketName) {
                        this.ticketName = ticketName;
                    }

                    public String getTicketNum() {
                        return ticketNum;
                    }

                    public void setTicketNum(String ticketNum) {
                        this.ticketNum = ticketNum;
                    }
                }

                public static class HardsleepermidBean {
                    /**
                     * price : 279.5
                     * ticketName : 硬卧
                     * ticketNum : 5
                     */

                    private double price;
                    private String ticketName;
                    private String ticketNum;

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public String getTicketName() {
                        return ticketName;
                    }

                    public void setTicketName(String ticketName) {
                        this.ticketName = ticketName;
                    }

                    public String getTicketNum() {
                        return ticketNum;
                    }

                    public void setTicketNum(String ticketNum) {
                        this.ticketNum = ticketNum;
                    }
                }

                public static class NoseatBean {
                    /**
                     * price : 152.5
                     * ticketName : 无座
                     * ticketNum : 205
                     */

                    private double price;
                    private String ticketName;
                    private String ticketNum;

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public String getTicketName() {
                        return ticketName;
                    }

                    public void setTicketName(String ticketName) {
                        this.ticketName = ticketName;
                    }

                    public String getTicketNum() {
                        return ticketNum;
                    }

                    public void setTicketNum(String ticketNum) {
                        this.ticketNum = ticketNum;
                    }
                }

                public static class SoftsleeperdownBean {
                    /**
                     * price : 427.5
                     * ticketName : 软卧
                     * ticketNum : 9
                     */

                    private double price;
                    private String ticketName;
                    private String ticketNum;

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public String getTicketName() {
                        return ticketName;
                    }

                    public void setTicketName(String ticketName) {
                        this.ticketName = ticketName;
                    }

                    public String getTicketNum() {
                        return ticketNum;
                    }

                    public void setTicketNum(String ticketNum) {
                        this.ticketNum = ticketNum;
                    }
                }

                public static class BusinessseatBean {
                    /**
                     * price : 427.5
                     * ticketName : 软卧
                     * ticketNum : 9
                     */

                    private double price;
                    private String ticketName;
                    private String ticketNum;

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public String getTicketName() {
                        return ticketName;
                    }

                    public void setTicketName(String ticketName) {
                        this.ticketName = ticketName;
                    }

                    public String getTicketNum() {
                        return ticketNum;
                    }

                    public void setTicketNum(String ticketNum) {
                        this.ticketNum = ticketNum;
                    }
                }

                public static class FirstseatBean {
                    /**
                     * price : 427.5
                     * ticketName : 软卧
                     * ticketNum : 9
                     */

                    private double price;
                    private String ticketName;
                    private String ticketNum;

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public String getTicketName() {
                        return ticketName;
                    }

                    public void setTicketName(String ticketName) {
                        this.ticketName = ticketName;
                    }

                    public String getTicketNum() {
                        return ticketNum;
                    }

                    public void setTicketNum(String ticketNum) {
                        this.ticketNum = ticketNum;
                    }
                }

                public static class Secondseat {
                    /**
                     * price : 427.5
                     * ticketName : 软卧
                     * ticketNum : 9
                     */

                    private double price;
                    private String ticketName;
                    private String ticketNum;

                    public double getPrice() {
                        return price;
                    }

                    public void setPrice(double price) {
                        this.price = price;
                    }

                    public String getTicketName() {
                        return ticketName;
                    }

                    public void setTicketName(String ticketName) {
                        this.ticketName = ticketName;
                    }

                    public String getTicketNum() {
                        return ticketNum;
                    }

                    public void setTicketNum(String ticketNum) {
                        this.ticketNum = ticketNum;
                    }
                }
            }
        }
    }
}
