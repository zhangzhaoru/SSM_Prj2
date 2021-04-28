package com.zhangzhaoru.service;

import com.zhangzhaoru.dao.BookMapper;
import com.zhangzhaoru.pojo.Books;

import java.util.List;

/**
 * @BelongsProject: SSMPracticePrj
 * @BelongsPackage: com.zhangzhaoru.service
 * @Author: ZhangZhaoru
 * @Date: 2021/4/27 6:06 下午
 * @Description:
 */
public class BookServiceImpl implements BookService {
    //1     需要业务层调用Dao层，所以将Dao层接口作为私有属性
//    2 扩展事物需要Spring 切面控制扩展
    private BookMapper bookMapper;

    //    优先使用Setter方法而不使用有参构造
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBook();
    }
}
