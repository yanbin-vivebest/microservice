package com.producer.producer.dto;

import org.springframework.data.annotation.Id;

import java.io.Serializable;


public class CustInfo implements Serializable {

    private static final long serialVersionUID = -1L;

    @Id
    private Long id;
    private String username;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public CustInfo(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }


}
