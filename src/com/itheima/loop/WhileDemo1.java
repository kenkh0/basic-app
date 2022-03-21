package com.itheima.loop;

public class WhileDemo1 {
    public static void main(String[] args) {
        double peakHeight =8848860;
        double paperThickness=0.1;

        int count=0;

        while (paperThickness<peakHeight) {
            paperThickness += paperThickness;
            count++; 
        }
        System.out.println(count);
        }
}
