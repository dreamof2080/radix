package com.jeffrey.bytecomvert;

import java.io.Serializable;

/**
 * @author Jeffrey.Liu
 * @version V1.0
 * @Description
 * @date 2018-5-26 22:21
 */
public class Employee implements Serializable {
    private int age;
    private String name;
    private String job;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
