package com.geniusmart.module1;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class GirlFriend {

    private String mDecorate;

    @Inject
    public GirlFriend(String decorate) {
        mDecorate = decorate;
    }

    public void laugh() {
        System.out.println(mDecorate + "--laughing girl");
    }
}
