package com.mvp.demo.fyl.luodao.manager;

import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2018/7/14.
 */

public class UrlManager {
    public static UrlManager instance;
    private Properties properties;
    public static UrlManager getinstance() {
        if (instance == null) {
            synchronized (UrlManager.class) {
                if (instance == null) {
                    instance = new UrlManager();
                }
            }
        }
        return instance;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(String urlType) {
        InputStream in;
        Properties props = new Properties();
        try {
            switch (urlType) {
                case ConstantEnvironment.PRODUCTION:
                    // 通过class获取setting.properties的FileInputStream
                    in = UrlManager.class.getResourceAsStream("/assets/production.properties");
                    break;
                case ConstantEnvironment.DEVELOPMENT:
                    in = UrlManager.class.getResourceAsStream("/assets/development.properties");
                    break;
                default:
                    in = UrlManager.class.getResourceAsStream("/assets/production.properties");
                    break;
            }
            props.load(in);
        } catch (IOException e) {
            Log.e("获取URL配置文件:", e.getLocalizedMessage());
        }
       this.properties=props;
    }
}
