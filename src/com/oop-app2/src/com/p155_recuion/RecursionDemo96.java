package com.p155_recuion;

public class RecursionDemo96 {
    public static int  totalNumber;
    public static int  lastBottleNumber;
    public static int  lastCoverNumber;
//    public static int  allMoney;


    public static void main(String[] args) {

        buy(10);
        System.out.println(totalNumber);
        System.out.println(lastBottleNumber);
        System.out.println(lastCoverNumber);
    }

    private static void buy(int money) {
        int buyNumber = money/2; //5
        totalNumber+=buyNumber;

        int bottleNumber = lastBottleNumber+buyNumber;
        int coverNumber =lastCoverNumber+buyNumber;
        int  allMoney=0;
        if (bottleNumber>=2){
             allMoney += (buyNumber/2)*2;
        }
        lastBottleNumber=(buyNumber%2);

        if (coverNumber>=4){
            allMoney += (coverNumber/4)*2;
        }
        lastCoverNumber=(coverNumber%4);

        if(allMoney>=2){
            buy(allMoney);
        }

    }
}
