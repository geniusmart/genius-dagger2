package com.geniusmart.module1;

import dagger.Component;

/**
 * Created by geniusmart on 2016/5/30.
 */
@Component(modules = {ThirdModule.class})
public interface BoyComponent {
    Boy inject();
}
