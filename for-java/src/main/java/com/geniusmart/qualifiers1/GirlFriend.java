package com.geniusmart.qualifiers1;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class GirlFriend {

    private String mDecorate;
    private int mAge;

    public GirlFriend(String decorate) {
        mDecorate = decorate;
    }

    public GirlFriend(String decorate, int age) {
        mDecorate = decorate;
        mAge = age;
    }

    @Override
    public String toString() {
        if(mAge>0) {
            return mDecorate + ",芳龄" + mAge;
        }
        return mDecorate;
    }
}
