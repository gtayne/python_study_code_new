package com.company.pojo9;

import java.io.Serializable;

public class Cat implements Serializable {
    private static final long serialVersionUID = 6444393771946572941L;  //类实现序列化，能转换为字节流
    private String name;
    private int age;
    private int length;

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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", length=" + length +
                '}';
    }
}
