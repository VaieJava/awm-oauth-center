package com.outdd.oauth;


public class Dao<D> {

    D save(D instance) {
        System.out.println("存储了"+instance.toString());
        return instance;
    }
}
