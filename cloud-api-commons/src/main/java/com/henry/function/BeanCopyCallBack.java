package com.henry.function;

@FunctionalInterface
public interface BeanCopyCallBack<S, T> {
    void callBack(S t, T s);
}