package com.mvp.demo.fyl.luodao.exception;

import android.net.ParseException;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;

import org.json.JSONException;

import java.io.IOException;
import java.net.ConnectException;

import okhttp3.ResponseBody;
import retrofit2.adapter.rxjava.HttpException;

/**
 * Created by Administrator on 2018/7/15.
 */

public class ExceptionHandle {
    /**
     * 1xx：请求收到，继续处理
     100——客户必须继续发出请求
     101——客户要求服务器根据请求转换HTTP协议版本

     2xx：操作成功收到，分析、接受
     200——交易成功
     201——提示知道新文件的URL
     202——接受和处理、但处理未完成
     203——返回信息不确定或不完整
     204——请求收到，但返回信息为空
     205——服务器完成了请求，用户代理必须复位当前已经浏览过的文件
     206——服务器已经完成了部分用户的GET请求

     3xx：完成此请求必须进一步处理
     300——请求的资源可在多处得到
     301——删除请求数据
     302——在其他地址发现了请求数据
     303——建议客户访问其他URL或访问方式
     304——客户端已经执行了GET，但文件未变化
     305——请求的资源必须从服务器指定的地址得到
     306——前一版本HTTP中使用的代码，现行版本中不再使用
     307——申明请求的资源临时性删除

     4xx：请求包含一个错误语法或不能完成
     400——错误请求，如语法错误
     401——请求授权失败
     402——保留有效ChargeTo头响应
     403——请求不允许
     404——没有发现文件、查询或URl
     405——用户在Request-Line字段定义的方法不允许
     406——根据用户发送的Accept拖，请求资源不可访问
     407——类似401，用户必须首先在代理服务器上得到授权
     408——客户端没有在用户指定的饿时间内完成请求
     409——对当前资源状态，请求不能完成
     410——服务器上不再有此资源且无进一步的参考地址
     411——服务器拒绝用户定义的Content-Length属性请求
     412——一个或多个请求头字段在当前请求中错误
     413——请求的资源大于服务器允许的大小
     414——请求的资源URL长于服务器允许的长度
     415——请求资源不支持请求项目格式
     416——请求中包含Range请求头字段，在当前请求资源范围内没有range指示值，请求也不包含If-Range请求头字段
     417——服务器不满足请求Expect头字段指定的期望值，如果是代理服务器，可能是下一级服务器不能满足请求

     5xx：服务器执行一个完全有效请求失败
     500——服务器产生内部错误
     501——服务器不支持请求的函数
     502——服务器暂时不可用，有时是为了防止发生系统过载
     503——服务器过载或暂停维修
     504——关口过载，服务器使用另一个关口或服务来响应用户，等待时间设定值较长
     505——服务器不支持或拒绝支请求头中指定的HTTP版本
     */
    private static final int BAD_REQUEST = 400;
    private static final int UNAUTHORIZED = 401;
    private static final int RETENTION_EFFECTIVE_CHARGETO_ESPONSE = 402;
    private static final int FORBIDDEN = 403;
    private static final int NOT_FOUND = 404;
    private static final int  DEFINED_REQUESTLINE_METHOD_NONALLOW = 405;
    private static final int REQUEST_TIMEOUT = 408;
    private static final int INTERNAL_SERVER_ERROR = 500;
    private static final int FUNCTION_NONSUPPORT_ERROR = 501;
    private static final int BAD_GATEWAY = 502;
    private static final int SERVICE_UNAVAILABLE = 503;
    private static final int GATEWAY_TIMEOUT = 504;
    private static final int HTTPVERSION_NONSUPPORT_ERROR = 505;
    private static final int FAIL_QUEST = 406;//无法使用请求的内容特性来响应请求的网页
    private static ResponseBody body;

    public static ResponeThrowable handleException(Throwable e) {
        ResponeThrowable ex;
        if (e instanceof HttpException) {
            HttpException httpException = (HttpException) e;
            ex = new ResponeThrowable(e, ERROR.HTTP_ERROR);
            switch (httpException.code()) {
                case BAD_REQUEST:
                    ex.message="请求报文语法错误或参数错误";
                    break;
                case UNAUTHORIZED:
                   ex.message="需要通过HTTP认证，或认证失败";
                    break;
                case RETENTION_EFFECTIVE_CHARGETO_ESPONSE:
                   ex.message="保留有效ChargeTo头响应";
                    break;
                case FORBIDDEN:
                    ex.message = "请求资源被拒绝";
                    break;
                case NOT_FOUND:
                    ex.message = "无法找到请求资源";
                    break;
                case DEFINED_REQUESTLINE_METHOD_NONALLOW:
                    ex.message = "用户在Request-Line字段定义的方法不允许";
                    break;
                case REQUEST_TIMEOUT:
                    ex.message = "请求超时";
                    break;
                case GATEWAY_TIMEOUT:
                    //关口过载，服务器使用另一个关口或服务来响应用户，等待时间设定值较长
                    ex.message="关口过载，服务器使用另一个关口或服务来响应用户，等待时间设定值较长";
                    break;
                case HTTPVERSION_NONSUPPORT_ERROR:
                    //关口过载，服务器使用另一个关口或服务来响应用户，等待时间设定值较长
                    ex.message="服务器不支持或拒绝支请求头中指定的HTTP版本";
                    break;
                case INTERNAL_SERVER_ERROR:
                    ex.message = "服务器故障或";
                    break;
                case FUNCTION_NONSUPPORT_ERROR:
                    ex.message = "服务器不支持请求的函数";
                    break;
                case BAD_GATEWAY:
                    //服务器暂时不可用，有时是为了防止发生系统过载
                    ex.message="服务器暂时不可用";
                    break;
                case SERVICE_UNAVAILABLE:
                    ex.message="服务器超负载或停机维护";
                    break;
                case FAIL_QUEST:
                    body = ((HttpException) e).response().errorBody();
                    try {
                        String message = body.string();
                        Gson gson = new Gson();
                        ErrorBody globalException = gson.fromJson(message, ErrorBody.class);
                        if (globalException.getResMsg() != null) {
                            ex.message = globalException.getResMsg();
                        } else {
                            ex.message = "";
                        }
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;
                default:
                    ex.message = "网络错误";
                    break;
            }
            return ex;
        } else if (e instanceof ServerException) {
            ServerException resultException = (ServerException) e;
            ex = new ResponeThrowable(resultException, resultException.code);
            ex.message = resultException.message;
            return ex;
        } else if (e instanceof JsonParseException
                || e instanceof JSONException
                || e instanceof ParseException) {
            ex = new ResponeThrowable(e, ERROR.PARSE_ERROR);
            ex.message = "解析错误";
            return ex;
        } else if (e instanceof ConnectException) {
            ex = new ResponeThrowable(e, ERROR.NETWORD_ERROR);
            ex.message = "连接失败";
            return ex;
        } else if (e instanceof javax.net.ssl.SSLHandshakeException) {
            ex = new ResponeThrowable(e, ERROR.SSL_ERROR);
            ex.message = "证书验证失败";
            return ex;
        } else if (e instanceof java.net.SocketTimeoutException) {
            ex = new ResponeThrowable(e, ERROR.TIMEOUT_ERROR);
            //ex.message = "连接超时";
            ex.message = "连接超时，请稍后再试！";
            return ex;
        } else if (e instanceof java.net.UnknownHostException) {
            ex = new ResponeThrowable(e, ERROR.TIMEOUT_ERROR);
            ex.message = "网络中断，请检查网络状态！";
            return ex;
        } else if (e instanceof javax.net.ssl.SSLException) {
            ex = new ResponeThrowable(e, ERROR.TIMEOUT_ERROR);
            ex.message = "网络中断，请检查网络状态！";
            return ex;
        } else if (e instanceof java.io.EOFException) {
            ex = new ResponeThrowable(e, ERROR.PARSE_EMPTY_ERROR);
            ex.message = "1007";
            return ex;
        } else if (e instanceof java.lang.NullPointerException) {
            ex = new ResponeThrowable(e, ERROR.PARSE_EMPTY_ERROR);
            ex.message = "数据为空，显示失败";
            return ex;
        }else {
            ex = new ResponeThrowable((HttpException)e, ERROR.UNKNOWN);
            ex.message = "未知错误";
            return ex;
        }
    }


    public static ResponeThrowable handleErrorMsg(Object object){
        ResponeThrowable ex;
        Gson gson = new Gson();
        String errorMsg = gson.toJson(object);
        ErrorBody exception = gson.fromJson(errorMsg, ErrorBody.class);
        ex=new ResponeThrowable(exception.getResMsg());
        ex.message=exception.getResMsg();
        return ex;
    }


    /**
     * 约定异常
     */
    public class ERROR {
        /**
         * 未知错误
         */
        public static final int UNKNOWN = 1000;
        /**
         * 解析错误
         */
        public static final int PARSE_ERROR = 1001;
        /**
         * 解析no content错误
         */
        public static final int PARSE_EMPTY_ERROR = 1007;
        /**
         * 网络错误
         */
        public static final int NETWORD_ERROR = 1002;
        /**
         * 协议出错
         */
        public static final int HTTP_ERROR = 1003;

        /**
         * 证书出错
         */
        public static final int SSL_ERROR = 1005;

        /**
         * 连接超时
         */
        public static final int TIMEOUT_ERROR = 1006;

        public static final int LOGIN_ERROR = -1000;
        public static final int DATA_EMPTY = -2000;


    }

    public static class ResponeThrowable extends Exception {
        public int code;
        public String message;

        public ResponeThrowable(Throwable throwable, int code) {
            super(throwable);
            this.code = code;
        }

        public ResponeThrowable(String message, int code) {
            this.code = code;
            this.message = message;
        }

        public ResponeThrowable(String message) {
            this.message = message;
        }
    }

    public class ServerException extends RuntimeException {
        public int code;
        public String message;

        public ServerException(int code, String message) {
            this.code = code;
            this.message = message;
        }
    }
}
