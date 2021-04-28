package com.zhangzhaoru.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: SSMPracticePrj
 * @BelongsPackage: com.zhangzhaoru.pojo
 * @Author: ZhangZhaoru
 * @Date: 2021/4/27 5:27 下午
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
