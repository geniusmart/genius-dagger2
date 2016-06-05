package com.geniusmart.qualifiers2;

import com.geniusmart.qualifiers2.define.One;
import com.geniusmart.qualifiers2.define.Two;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {

    //如果没有限定符，是无法注入的
    @Inject
    @One
    List<String> arraylist;
    @Inject
    @Two
    List<String> linkedList;

    @Inject
    public Client(){

    }

    public void print() {
        System.out.println(arraylist instanceof ArrayList);
        System.out.println(linkedList instanceof LinkedList);
    }

    public static void main(String[] args) {
        ClientComponent component = DaggerClientComponent.builder().build();
        Client client = component.inject();
        client.print();
    }
}
