package com.zhangzhaoru.service;

import com.zhangzhaoru.pojo.Books;

import java.util.List;

/**
 * @BelongsProject: SSMPracticePrj
 * @BelongsPackage: com.zhangzhaoru.service
 * @Author: ZhangZhaoru
 * @Date: 2021/4/27 6:03 下午
 * @Description:
 */
public interface BookService {
    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBooks();
}
