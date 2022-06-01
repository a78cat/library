package com.shrewd.pojo;

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

    public Record() {
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public Date getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Record{" +
                "rId=" + rId +
                ", uId=" + uId +
                ", bId=" + bId +
                ", borrowingDate=" + borrowingDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
