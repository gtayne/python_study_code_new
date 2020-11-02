package com.company.pojo10;

public enum Month {
    LEFT(1,"left"),RIGHT(2,"right");
    private int code;
    private String name;

    Month(int code, String name) {
        this.code = code;
        this.name = name;
    }

}
