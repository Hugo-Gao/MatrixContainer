package com.gyf.hotswap.test;

import com.gyf.hotswap.annotation.HotSwap;

/**
 * @author yunfan.gyf
 **/
@HotSwap
public class Sweet {
    public void sweet() {
        System.out.println("I'm sweet version 3, loaded by "+this.getClass().getClassLoader());
    }


    public static void main(String[] args) {

    }
}
