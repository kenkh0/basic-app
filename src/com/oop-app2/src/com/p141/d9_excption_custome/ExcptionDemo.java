package com.p141.d9_excption_custome;

public class ExcptionDemo {
    public static void main(String[] args) throws ItheimaAgeiLLeagelException {
        try {
            checkAge(1111);
        } catch (ItheimaAgeiLLeagelException e) {
            e.printStackTrace();
        }

    }

    public static void checkAge(int  age) throws ItheimaAgeiLLeagelException {
        if (age <0|| age>200){
            throw new ItheimaAgeiLLeagelException(age +"is illeagel");
        }else {
            System.out.println("age ok");
        }


    }
}
