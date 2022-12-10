package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly rw=new RWOnly();

//        rw.name="djs";      // 'name' has private access in 'com.driver.RWOnly'

        rw.setName("HP");
        System.out.println(rw.getName());
    }
}