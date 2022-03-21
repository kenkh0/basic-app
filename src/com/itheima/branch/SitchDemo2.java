package com.itheima.branch;

public class SitchDemo2 {
    public static void main(String[] args) {
        String weekday="mon";
        int price=1000;
        switch (weekday){
            case "mon":
                System.out.println("mon");
                System.out.println(price-99);
                price-=99;
               break;
            case "thu":
                System.out.println("thu");
                break;
            case  "wed":
                System.out.println("wed");
                break;
            case "the":
                System.out.println("the");
                break;
            case"fir":
                System.out.println("fir");
                break;
            case "sat":
                System.out.println("sat");
                break;
            case "sun":
                System.out.println("sun");
                break;
            default:
                System.out.println("error");
        }

        System.out.println("end");
        System.out.println(price);
        String lv="1";
        double price1=10000;
        double rs=0;
        if (lv=="1"){
            System.out.println("ok");
            rs =price1*0.9;
        }
        System.out.println(rs);
    }
}
