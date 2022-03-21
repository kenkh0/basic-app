package com.itheima.oopDemo;

import com.itheima.param.MethodDemo1;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        Goods G1=new Goods();
        Goods[] shopCar = new Goods [100];//[null,null, ....]
        while (true) {
            System.out.println("please select below funtion");

            System.out.println("add");
            System.out.println("query");
            System.out.println("Update");
            System.out.println("pay");
            Scanner sc= new Scanner(System.in);
            System.out.println("Please in put you commend add query update pay");
            String command=sc.next();

            switch (command){
                case"add":
                     addGoods(shopCar,sc);
                    break;

                case"query":
                    queryGoods(shopCar,sc);
                    break;

                case"Update":
                    updateGoods(shopCar,sc);

                    break;

                case"pay":
                    payGoods(shopCar,sc);

                    break;

                default:
                    System.out.println("no funtion please input again");


            }
        }


    }

    public static void payGoods(Goods[] shopCar,Scanner sc) {
        System.out.println("----------------------");
        queryGoods(shopCar,sc);
        double finalPrice = 0;
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i]!=null) {

                finalPrice += (shopCar[i].price * shopCar[i].buyNumber);
            }else {break;}
        }
        System.out.println("Totle price:"+finalPrice);

    }

    public static void updateGoods(Goods[] shopCar,Scanner sc) {
        System.out.println("please input the item id you want to mondifly");
        int id =sc.nextInt();
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i]!=null) {
                if (shopCar[i].id == id) {
                    System.out.println("please input new buynumber");
                    int newBuyNumber = sc.nextInt();
                    shopCar[i].buyNumber = newBuyNumber;

                    queryGoods(shopCar, sc);
                    break;
                } else {

                }
            }

        } System.out.println("please input correct item id");


    }
//    public static Goods getGoodsById(Goods[] shopCar,int id){
//        for (int i = 0; i <shopCar.length; i++) {
//            Goods g = shopCar[i];
//
//        }
//
//    }

    public static void queryGoods(Goods[] shopCar,Scanner sc) {
        System.out.println("show the shopping cart item as below ");
        System.out.println("id \tname\t\tprice\t\t\tbuynumber");

        for (int i = 0; i < shopCar.length; i++) {
                Goods g =shopCar[i];
                if(g!=null){
                    System.out.println(g.id+"\t"+g.name+"\t\t"+g.price+"\t\t\t"+g.buyNumber);
                }else {
                    break;
                }

            
        }
            


    }

    public static void addGoods(Goods[] shopCar,Scanner sc) {
        System.out.println("Please input itemid");
        int id =sc.nextInt();
        System.out.println("please input item name");
        String name = sc.next();
        System.out.println("please inpput  the number of item");
        int buyNumber = sc.nextInt();
        System.out.println("please input price");
        double price =sc.nextDouble();
        Goods g = new Goods();
        g.id= id;
        g.name=name;
        g.price=price;
        g.buyNumber= buyNumber;

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i]==null) {
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("you item "+g.name+"ok");
    }


}
