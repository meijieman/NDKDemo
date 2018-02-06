package com.hongfans.ndkdemo;

/**
 * TODO
 * Created by MEI on 2018/2/6.
 */

public class JNIUtil {

    static {
        //名字注意，需要 build.gradle ndk 节点下面的名字一样
        System.loadLibrary("JNISample");
    }

    public native String getWorld();

    public static native String getHello();
}
