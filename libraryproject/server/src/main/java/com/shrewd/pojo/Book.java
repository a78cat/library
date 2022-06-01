package com.shrewd.pojo;

/***
 * 持久化Book
 */
public class Book {

    private int bId;        //书编号
    private String bName;   //书名称
    private String bType;   //书类型
    private int bState;     //书状态

    public Book() {
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public int getbState() {
        return bState;
    }

    public void setbState(int bState) {
        this.bState = bState;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", bType='" + bType + '\'' +
                ", bState=" + bState +
                '}';
    }
}
