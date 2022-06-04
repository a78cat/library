package com.shrewd.pojo;

import com.alibaba.fastjson.JSONObject;

/***
 * 持久化User
 */
public class User {

    private int uId;        //用户id
    private String uName;   //用户姓名
    private String uPwd;    //用户密码
    private int uRole;      //用户身份

    private JSONObject jsonObject;

    public User() {
        jsonObject = new JSONObject();
    }

    public User(int uId, String uName, String uPwd, int uRole) {
        this.uId = uId;
        this.uName = uName;
        this.uPwd = uPwd;
        this.uRole = uRole;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public void setuRole(int uRole) {
        this.uRole = uRole;
    }

    public JSONObject getJsonObject() {
        jsonObject.put("uId", uId);
        jsonObject.put("uName", uName);
        jsonObject.put("uRole", uRole);
        return jsonObject;
    }

}
