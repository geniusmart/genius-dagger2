package com.geniusmart.qualifiers2;

import dagger.Component;

/**
 * Created by geniusmart on 2016/6/6.
 */
@Component(modules = ClientModule.class)
public interface ClientComponent {

    Client inject();
}
