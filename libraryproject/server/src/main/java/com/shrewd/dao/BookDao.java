package com.shrewd.dao;

import com.shrewd.pojo.Book;
import com.shrewd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class BookDao {

    final static String MAPPER_PATH = "com.shrewd.mapper.BookMapper.";

    /***
     * 查找书籍
     * @param bId
     * @return
     */
    public Book findBook_bid(int bId) {
        SqlSession session = MybatisUtils.getSession();
        Book book = session.selectOne(MAPPER_PATH + "findBookByBId", bId);
        session.close();
        if (book != null) {
            return book;
        }
        return null;
    }
}
