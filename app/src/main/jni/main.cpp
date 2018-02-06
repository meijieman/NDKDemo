//
// Created by Administrator on 2018/2/6.
//


#include "com_hongfans_ndkdemo_JNIUtil.h"

JNIEXPORT jstring JNICALL Java_com_hongfans_ndkdemo_JNIUtil_getWorld(JNIEnv *env, jobject obj) {
    return env->NewStringUTF("this is from c++");
}

JNIEXPORT jstring JNICALL Java_com_hongfans_ndkdemo_JNIUtil_getHello(JNIEnv *env, jclass obj) {
    return env->NewStringUTF("static method from c++");
}