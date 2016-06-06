package com.geniusmart.scope1;

import dagger.Component;

/**
 * Created by geniusmart on 2016/5/31.
 */
@Component
public interface MainConponent {

    GirlFriend injectGF();

    Boy injectBoy();
}
