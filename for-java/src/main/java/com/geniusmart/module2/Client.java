package com.geniusmart.module2;

/**
 * Created by geniusmart on 2016/5/30.
 */
public class Client {

    public static void main(String[] args){

        //通过上下文环境取得该值，如从数据中获取或者业务处理后获取
        String decorate = "青春靓丽";
        GirlFriendModule girlFriendModule = new GirlFriendModule(decorate);
        //设置Module对象
        BoyComponent build = DaggerBoyComponent.builder()
                .girlFriendModule(girlFriendModule).build();
        Boy boy = build.inject();
        boy.daydayup();
        boy.today();
    }
}
