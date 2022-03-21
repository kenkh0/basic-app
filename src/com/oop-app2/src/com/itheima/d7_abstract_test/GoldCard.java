package com.itheima.d7_abstract_test;

public class GoldCard extends Card {

    @Override
    public void pay(double money) {
        double rs =money*0.8;
        double lastMoney=getMoney()-rs;
        System.out.println(getName()+"now balance" +getMoney()+"you pay "+rs+"now have "+lastMoney+"the price is "+money);
        setMoney(lastMoney);

    }

}
