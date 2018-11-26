package com.mvp.demo.fyl.luodao.utils;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 使用Gson解析Json数据
 * add by fan on 2017/3/30
 */
public class JsonUtils {

    public static <T> T jsonObject2Bean(String jsonString, Class<T> cls) {
        try {
            Gson gson = new Gson();
            return gson.fromJson(jsonString, cls);
        } catch (Exception e) {
            Log.i("json", "Json解析为Bean时异常！");
            e.printStackTrace();
            return null;
        }
    }

    public static <T> List<T> jsonArray2list(String jsonString, Class<T> cls) {
        List<T> list = new ArrayList<>();
        try {
            Gson gson = new Gson();
            JsonParser parser = new JsonParser();//创建一个JsonParser
            //通过JsonParser对象可以把json格式的字符串解析成一个JsonElement对象
            JsonElement element = parser.parse(jsonString);
            //把JsonElement对象转换成JsonObject
            JsonArray jsonArray;
            if (element.isJsonArray()) {
                jsonArray = element.getAsJsonArray();
                Iterator<JsonElement> it = jsonArray.iterator();
                JsonElement jsonElement;
                while (it.hasNext()) {
                    jsonElement = it.next();
                    jsonString = jsonElement.toString();
                    list.add(gson.fromJson(jsonString, cls));
                }
            }
            return list;
        } catch (Exception e) {
            Log.i("json", "Json解析为List时异常！");
            e.printStackTrace();
            return null;
        }
    }

    public static String object2json(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

    public static String createJsonString(String key, Object value) {

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(key, value);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }
}
