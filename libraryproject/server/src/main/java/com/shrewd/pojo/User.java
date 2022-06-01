package com.shrewd.pojo;

/***
 * 持久化User
 */
public class User {

    private int uId;        //用户id
    private String uName;   //用户姓名
    private String uPwd;    //用户密码
    private int uRole;      //用户身份

    public User() {
    }

    public User(int uId, String uName, String uPwd, int uRole) {
        this.uId = uId;
        this.uName = uName;
        this.uPwd = uPwd;
        this.uRole = uRole;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public int getuRole() {
        return uRole;
    }

    public void setuRole(int uRole) {
        this.uRole = uRole;
    }

    @Override
    public String toString() {
        return "" + uId + ',' + uName + ',' + uRole;
    }
}
