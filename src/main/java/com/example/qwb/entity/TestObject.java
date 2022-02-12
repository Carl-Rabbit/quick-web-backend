package com.example.qwb.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestObject {
    private Integer id;

    private String str;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str == null ? null : str.trim();
    }
}