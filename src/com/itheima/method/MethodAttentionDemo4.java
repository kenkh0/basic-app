package com.itheima.method;

public class MethodAttentionDemo4 {


    public static void main(String[] args) {
        // System.out.println(sum(1, 2));

        //sum(10,20);

        System.out.println(add(10));
        sb(9);
        int [] scoress={10,222,2222,33333,4444,222,322223223,232321};
        System.out.println(scores(scoress));
    }

    public static int sum(int a, int b) {
        print();
        return a + b;

    }

    public static void print() {
        System.out.println("Hello World");
    }

    public static int add(int a) {
        int rs = 0;
        for (int i = 1; i <= a; i++) {
            rs += i;
        }
        return rs;
    }

    public static void sb(int a) {
        if (a % 2 == 1) {
            System.out.println(a + "is single number");
        } else {
            System.out.println(a + "is doble number");
        }

    }
    public static int scores(int[] scoress) {
        int max=scoress[0];
        for (int i = 1; i < scoress.length; i++) {

            if (scoress[i]>max ) {
                max = scoress[i ];
            }

        }
        return max;
    }
}




