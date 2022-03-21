package com.itheima.scanner;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("input your age.");
        int age = sc.nextInt();
        System.out.println("your age is "+age);

        System.out.println("input your name.");
        String name = sc.next();
        System.out.println("your name is "+age);

    }
}
