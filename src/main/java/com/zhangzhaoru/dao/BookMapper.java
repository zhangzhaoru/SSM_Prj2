package com.zhangzhaoru.dao;

import com.zhangzhaoru.pojo.Books;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @BelongsProject: SSMPracticePrj
 * @BelongsPackage: com.zhangzhaoru.dao
 * @Author: ZhangZhaoru
 * @Date: 2021/4/27 5:40 下午
 * @Description: 实现对实体类的增删查改的具体操作
 */
public interface BookMapper {
    int addBook(Books book);

//    用于传入参数名与实体类中属性名不一致的情况
    int deleteBookById(@Param("bookID") int id);

    int updateBook(Books book);

    Books queryBookById(@Param("bookID") int id);

    List<Books> queryAllBook();
}
