package com.geniusmart.qualifiers2;

import com.geniusmart.qualifiers2.define.One;
import com.geniusmart.qualifiers2.define.Two;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by geniusmart on 2016/6/6.
 */
@Module
public class ClientModule {

    @Provides
    @One
    public List<String> provideArrayList(){
        return new ArrayList<>();
    }

    @Provides
    @Two
    public List<String> provideLinkedList(){
        return new LinkedList<>();
    }
}
