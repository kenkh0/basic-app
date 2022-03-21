package com.itheima.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Account> bankAccList = new ArrayList<>();
        bankAccList.add(new Account("apple","1234",10000,1234,10000));
        bankAccList.add(new Account("ken","1112",100,1112,10));
        while (true) {
            System.out.println("1:Login Account");
            System.out.println("2:Register Account");
            System.out.println("Please select funtion");
            String choice =sc.next();
            Account a;

            switch (choice){
                case "1" :
                    //"1:Login Account
                  a= logIn(bankAccList,sc);
                   funtion(a,sc,bankAccList);
                    break;

                case "2" :
                //2:Register Account
                    register( bankAccList,sc);
                    break;
                case "3" :
                    //2:Register Account
                    break;
                default:break;

            }
        }


    }
    public static void funtion(Account a,Scanner sc,ArrayList<Account> bankAccList){
        while (true) {
            System.out.println("==========================================");
            System.out.println("1:Inquire");
            System.out.println("2:deposit");
            System.out.println("3:withdraw money");
            System.out.println("4:transfer money");
            System.out.println("5:change Password");
            System.out.println("6:Logout");
            System.out.println("7:Cancel account");
            System.out.println("Please select funtion");
            String choice =sc.next();

            switch (choice){
                case "1" :
                    //1:Inquire
                    inquire(a);
                    break;

                case "2" :
                    //2:deposit"
                    deposit(a,sc);
                    break;
                case "3" :
                    //3:withdraw money
                    drawMoney(a,sc);
                    break;

                case "4" :
                    //4:transfer money
                    transferMoney(a,sc,bankAccList);
                    break;
                case "5" :
                    //5:change Password
                    changePw(a,sc);
                    break;
                case "6" :
                    //6:Logout
                    break;
                case "7" :
                    //7:Cancel account
                    break;

                default:break;

            }
        }
    }
    public static void changePw(Account a,Scanner sc){
        while (true) {
            System.out.println("please inoput now password");
            String password=sc.next();
            if (password.equals(a.getBankPassword())) {
                System.out.println("please input new password");
              String fPassword=sc.next();
                System.out.println("confirm again");
                String sPassword=sc.next();
                if (fPassword.equals(sPassword)){
                    a.setBankPassword(fPassword);
                    System.out.println("password has chang");
                    break;
                }
                System.out.println("fist password and screcnd not correction");
                continue;

            }
            System.out.println("password inccoret");
        }


    }
    public static void transferMoney(Account a,Scanner sc,ArrayList<Account> bankAccList){
        if(a.getBankAccBalance()<0){
            System.out.println("you don't have money");
        }else if(bankAccList.size()==0){
            System.out.println("in system you don't have another ACC please register another Ac ");

        }else {


                System.out.println("please input Another card number");
                int otherCardNumber=sc.nextInt();
                for (int i = 0; i < bankAccList.size(); i++) {
                    Account b =bankAccList.get(i);
                    if(otherCardNumber==b.getBankAccNumber()){
                        String otherName=b.getBankName();
                        String otherName2 =otherName.replace(otherName.substring(0,1),"*");
                        System.out.println("please confime the frist ahaple of "+otherName2);
                        String fristAhple=sc.next();
                        if (fristAhple.equals(otherName.substring(0,1))){
                            System.out.println("please input the amount  now you have "+a.getBankAccBalance());
                            int drawMoney = sc.nextInt();
                            if(drawMoney>a.getBankCashLimit()){
                                System.out.println("Over the limit you have "+a.getBankCashLimit()+" now");
                                break;
                            }else if(drawMoney< a.getBankAccBalance()){
                                int blance =b.getBankAccBalance();
                                blance+=drawMoney;
                                int ablance=a.getBankAccBalance();
                                 ablance-=drawMoney;
                                a.setBankAccBalance(ablance);
                                b.setBankAccBalance(blance);
                                System.out.println("ok! you have  "+a.getBankAccBalance()+"now");
                                break;
                            }else {
                                System.out.println("you don't have enought money ");
                                break;
                            }
                        } else {
                            System.out.println("incorrect name ");
                            break;
                        }


                    }
                    System.out.println("dont have this number "+otherCardNumber);
                }



        }

    }
    public static void drawMoney(Account a,Scanner sc){
        System.out.println("=============Draw Money funtion ============");
        while (true) {
            System.out.println("please input Draw money amount");
            int drawMoney=sc.nextInt();
            if(drawMoney>a.getBankCashLimit()){
                System.out.println("Over the limit you have "+a.getBankCashLimit()+" now");
            }else if(drawMoney< a.getBankAccBalance()){
                int blance =a.getBankAccBalance();
                        blance-=drawMoney;
                a.setBankAccBalance(blance);
                System.out.println("you have "+a.getBankAccBalance()+"new");
                break;
            }else {
                System.out.println("not enught money now have $"+a.getBankAccBalance());
            }

        }


    }
    public static void inquire(Account a){
        System.out.println("=============info as below============");
        System.out.println("card number :"+a.getBankAccNumber());
        System.out.println("name :"+a.getBankName());
        System.out.println("Balance :"+a.getBankAccBalance());
        System.out.println("Cash Limit per day :"+a.getBankCashLimit());

    }
    public static void deposit(Account a,Scanner sc){
        System.out.println("=============Deposit funtion ============");

        System.out.println("how much you will deposit to Acc");
        int depositMoney=sc.nextInt();
        if (depositMoney>0){
            int balance=a.getBankAccBalance();
            balance+=depositMoney;
            a.setBankAccBalance(balance);;
        }
    }
    public static Account logIn(ArrayList<Account> bankAccList,Scanner sc){


            System.out.println("Please input card id");
            int bankAccNumber =sc.nextInt();
            System.out.println("Please input password");
            String password =sc.next();
            for (int i = 0; i < bankAccList.size(); i++) {
                Account account= bankAccList.get(i);
                int AccID =account.getBankAccNumber();
                String checkPassword= account.getBankPassword();
                if(bankAccNumber==AccID){
                    while (true) {
                        if(password.equals(checkPassword)) {
                            System.out.println("Login successful Welcome Mr/Miss " + account.getBankName());
                            return account;

                        }else {
                            System.out.println("password not correct");
                            System.out.println("Please input password");
                             password =sc.next();

                        }
                    }
                }

            }return null;



    }
    public static void register(ArrayList<Account> bankAccList,Scanner sc){
        Random re=new Random();
        System.out.println("Please input Account name");
        String accName=sc.next();
        while (true) {
            System.out.println("Please input password");
            String fristPasswod = sc.next();
            System.out.println("Please input again to confirm password");
            String secendPasswod = sc.next();
            if (fristPasswod.equals(secendPasswod)) {
                System.out.println("please setup Bank Cash Limit");
                int bankLimit = sc.nextInt();
                int bankAccNumber = re.nextInt(99999999);
//                int bankAccNumber = 333;
//                while (true){
//                    int checkCardId;
//                    for (int i = 0; i < bankAccList.size(); i++) {
//                        Account account =bankAccList.get(i);
//                        checkCardId=account.getBankAccNumber();
//                        while (true) {
//                            if (bankAccNumber == checkCardId) {
//                                bankAccNumber = re.nextInt(99999999);
//                                break;
//                            }
//                        }
//                    }

                bankAccList.add(new Account(accName,fristPasswod,bankLimit,bankAccNumber,0));
                System.out.println("Mr/Miss "+accName+" register successful , you cardNumber is "+bankAccNumber);
                break;
                }
            }

        }



}
