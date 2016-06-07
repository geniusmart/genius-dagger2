package com.geniusmart.sub;

/**
 * Created by geniusmart on 2016/6/6.
 */
public class SomeClassB1 {
    private SomeClassA1 someClassA1;

    public SomeClassB1(SomeClassA1 someClassA1) {
        this.someClassA1 = someClassA1;
    }

    public void print(){
        System.out.println(someClassA1);
    }
}
