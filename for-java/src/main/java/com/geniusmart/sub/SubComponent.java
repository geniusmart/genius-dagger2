package com.geniusmart.sub;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by geniusmart on 2016/6/6.
 */
public class SubComponent {
    @Component(modules = {ModuleA.class})
    public interface ComponentA {
        //SomeClassA1 someClassA1();
        ComponentB componentB(ModuleB moduleB);
    }

    @Subcomponent(modules = ModuleB.class)
    public interface ComponentB {
        SomeClassB1 someClassB1();
    }

    public static void main(String[] args) {
        ModuleA moduleA = new ModuleA();
        ModuleB moduleB = new ModuleB();
        ComponentA componentA = DaggerSubComponent_ComponentA.builder()
                .moduleA(moduleA)
                .build();

        //SomeClassA1 someClassA1 = componentA.someClassA1();
        //System.out.println(someClassA1);

        ComponentB componentB = componentA.componentB(moduleB);
        componentB.someClassB1().print();
    }
}
