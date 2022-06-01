package com.shrewd.dao;

import com.shrewd.pojo.Book;
import com.shrewd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class BookDao {

    final static String MAPPER_PATH = "com.shrewd.mapper.BookMapper.";

    /**
     * 通过bId查找书籍
     * @param bId
     * @return
     */
    public Book findBookByBId(int bId) {
        SqlSession session = MybatisUtils.getSession();
        Book book = session.selectOne(MAPPER_PATH + "findBookByBId", bId);
        session.close();
        if (book != null) {
            return book;
        }
        return null;
    }

    /**
     * 通过bName查找书籍
     * @param bName
     * @return
     */
    public Book findBookByBName(String bName) {
        SqlSession session = MybatisUtils.getSession();
        Book book = session.selectOne(MAPPER_PATH + "findBookByBName", bName);
        session.close();
        if (book != null) {
            return book;
        }
        return null;
    }

    /**
     * 通过state查书
     * @param bState
     * @return
     */
    public Book findBookByBState(String bState) {
        return null;
    }
}
