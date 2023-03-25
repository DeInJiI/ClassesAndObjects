package com.methodsandobjects;

public class Main {
    public static void main(String[] args) {

        Transport bmw = new Transport();
        bmw.setValues(250, 3000, "Blue", new byte[]{0, 0, 0});
        String res = bmw.getValues();
        System.out.println(res);
    }
}