package com.ye.pojo;

import javax.persistence.*;

/**
 * Demo class
 *
 * @author 张烨
 * @date 2020/6/4 18:04
 */
@Entity
@Table(name = "tab_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(Long id,String name, int age) {
        this.id=id;
        this.name = name;
        this.age = age;
    }
}
