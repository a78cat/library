package com.shrewd.pojo;

import com.alibaba.fastjson.JSONObject;

/***
 * 持久化Book
 */
public class Book {

    private int bId;        //书籍编号
    private String bName;   //书籍名称
    private int bState;     //书籍状态

    private JSONObject jsonObject;

    public Book() {
        jsonObject = new JSONObject();
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbState(int bState) {
        this.bState = bState;
    }

    public JSONObject getJsonObject() {
        jsonObject.put("bId", bId);
        jsonObject.put("bName", bName);
        jsonObject.put("bState", bState);
        return jsonObject;
    }
}
