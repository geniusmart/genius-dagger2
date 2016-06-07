package com.geniusmart.sub;

import dagger.Component;

/**
 * Created by geniusmart on 2016/6/6.
 */
public class ComponentDependency {
    @Component(modules = ModuleA.class)
    public interface ComponentA {
        SomeClassA1 someClassA1();
    }

    @Component(modules = ModuleB.class, dependencies = ComponentA.class)
    public interface ComponentB {
        //使用依赖方式时ComponentA必须暴露SomeClassA1，为subComponent则无需
        SomeClassB1 someClassB1();
    }

    public static void main(String[] args) {
        ModuleA moduleA = new ModuleA();
        ComponentA componentA = DaggerComponentDependency_ComponentA.builder()
                .moduleA(moduleA)
                .build();

        ModuleB moduleB = new ModuleB();
        ComponentB componentB = DaggerComponentDependency_ComponentB.builder()
                .moduleB(moduleB)
                .componentA(componentA)
                .build();
    }
}
