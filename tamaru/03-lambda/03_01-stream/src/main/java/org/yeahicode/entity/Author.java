package org.yeahicode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode//用于后期的去重使用
public class Author implements Comparable {
    //id
    private Long id;
    //姓名
    private String name;
    //年龄
    private Integer age;
    //简介
    private String intro;
    //作品
    private List<Book> books;

    @Override
    public int compareTo(Object o) {
        int age = 0;
        if(o instanceof Author){
            Author author = (Author)o;
            age = author.getAge();
        }
        return age -this.age;
    }
}
