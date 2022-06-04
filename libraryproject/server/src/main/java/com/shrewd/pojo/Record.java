package com.shrewd.pojo;

import com.alibaba.fastjson.JSONObject;

import java.util.Date;

/***
 * 持久化Record
 */
public class Record {

    private int rId;            //记录编号
    private int uId;            //用户id
    private int bId;            //书籍编号
    private Date borrowingDate; //借书时间
    private Date returnDate;    //还书时间

    private JSONObject jsonObject;

    public Record() {
        jsonObject = new JSONObject();
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public JSONObject getJsonObject() {
        jsonObject.put("rId", rId);
        jsonObject.put("borrowingDate", borrowingDate);
        jsonObject.put("returnDate", returnDate);
        return jsonObject;
    }
}
