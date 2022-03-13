package com.company;

import java.util.StringJoiner;

public class Box <T>{
    T a;

    public Box() {
    }

    public Box(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static <T>Object genericsMethod(T a) {
        return genericsMethod(a);
    }


    @Override
    public String toString() {
        return "Box{" +
                ": " + a + "}";
    }
}
