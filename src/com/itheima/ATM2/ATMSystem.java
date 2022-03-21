package com.itheima.ATM2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        // 1.for store Account object
        ArrayList<Account> accounts =new ArrayList<>();

        //2. prepare System main page register and Login
        Scanner sc = new Scanner(System.in);
       showMain(accounts,sc);

 
    }

    public static void showMain(ArrayList<Account>accounts,Scanner sc){

        while (true) {
            System.out.println("============Main Page==============");
            System.out.println("please select function:");
            System.out.println("1:Login");
            System.out.println("2:Register Bank Account");
            System.out.println("You Can input command");
            int command= sc.nextInt();

            switch (command){
                case 1:
                    //Login
                    login(accounts,sc);
                    break;
                case 2:
                    //Register
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("PLease input correct function");

            }
        }

    }

    /**
     * Complete user login
     * @param accounts
     */
    private static void login(ArrayList<Account> accounts,Scanner sc) {
       //
       if (accounts.size()==0){
           System.out.println("no acoount in the System please register frist.");
           return;
       }
        // Let the user enter the card number on the keyboard to query
        // the account object according to the card number
        while (true) {
            System.out.println("Please input the card number");
            String cardId =sc.next();
            Account acc=getAccountByCardId(cardId,accounts);
            //3.check card id exist
            if(acc!=null){
                while (true) {
                    //4. let user input password
                    System.out.println("please input password");
                    String password=sc.next();
                    //5 check password is correct
                    if (password.equals(acc.getPassWord())){
                    //password correct login success.
                        //Display the operation interface after system login
                        System.out.println("login success Mr/Miss "+acc.getUserName()+"card number is "+acc.getCardId());
                            showUserCommand(sc,acc,accounts);
                            return;//for logout Account
                    }else {
                        System.out.println("password not correct please confirm again");
                    }
                }

            }else {
                System.out.println("Card number does not exist");
            }
        }


    }

    private static void showUserCommand(Scanner sc ,Account acc ,ArrayList<Account>accounts) {
        while (true) {
        System.out.println("==========================================");
        System.out.println("1:Inquire");
        System.out.println("2:deposit");
        System.out.println("3:withdraw money");
        System.out.println("4:transfer money");
        System.out.println("5:change Password");
        System.out.println("6:Logout");
        System.out.println("7:Cancel account");

            System.out.println("Please select function");
            int command =sc.nextInt();

            switch (command){
                case 1 :
                    //1:Inquire
                    showAccount(acc);
                    break;

                case 2 :
                    //2:deposit"
                    depositMoney(acc,sc);

                case 3 :
                    //3:withdraw money
                    drawMoney(acc,sc);


                case 4 :
                    //4:transfer money
                    transferMoney(acc,sc,accounts);
                    break;
                case 5 :
                    //5:change Password
                    updatePassWord(acc,sc);
                    break;
                case 6 :
                    //6:Logout
                    System.out.println("logout !");
                    return;

                case 7:
                    //7:Cancel account
                    cancelAccount(acc,sc,accounts);
                    System.out.println("removed ACCount");
                   return;

                default:
                    System.out.println("command incorrect ");

            }
        }
    }

    private static void cancelAccount(Account acc, Scanner sc,ArrayList<Account>accounts) {
        while (true) {
            System.out.println("please input password to confirm cancel Account");
            String password =sc.next(); 
            if (acc.getPassWord().equals(password)){
                        accounts.remove(acc);
                       return;

            }else {
                System.out.println("password not correction");
            }
        }
    }

    private static void updatePassWord(Account acc, Scanner sc) {
        System.out.println("++++++++update PassWord +++++++");
        while (true) {
            System.out.println("please input password");
            String password =sc.next();
            if (password.equals(acc.getPassWord())){
                System.out.println("please input new password");
                String password1=sc.next();
                System.out.println("please confirm password again");
                String password2=sc.next();
                if(password1.equals(password2)){
                    acc.setPassWord(password1);
                    System.out.println("update Password success");
                    return;
                }else {
                    System.out.println("two password not the same");
                }
            }else {
                System.out.println("password not correction");
            }
        }
    }

    private static void transferMoney(Account acc, Scanner sc,ArrayList<Account> accounts) {
        System.out.println("=============Transfer Money=============");
        if (accounts.size()<2){
            System.out.println("in System only have 1 Account ");
            return;
        }
        if(acc.getMoney()==0){ System.out.println("not enough money to transfer ");
                return;
        }

        while (true) {
            System.out.println("please enter the card number of the other party's account ");
            String cardId=sc.next();
            Account account =getAccountByCardId(cardId,accounts);
            if(account!=null){
                // itself check
                if(account.getCardId().equals(acc.getCardId())){
                    System.out.println("you can't transfer money o yourself");
                }else {
                    // input first name
                    String name="*"+account.getUserName().substring(1);
                    System.out.println("please confirm frist *");
                    String preNmae=sc.next();

                    if(acc.getUserName().startsWith(preNmae)){
                        //transferMoney
                        System.out.println("please input the amount you want to transfer");
                        double money =sc.nextDouble();
                        if (money>acc.getMoney()){
                            System.out.println("not enough money you only have "+acc.getMoney());

                        }else {
                            acc.setMoney(acc.getMoney()-money);
                            account.setMoney(acc.getMoney()+money);
                            System.out.println("Transfer success ");
                            showAccount(acc);
                            return;
                        }
                    }else {
                        System.out.println("* not corecction");
                    }

                }


            }else {
                System.out.println("not exits");
            }
        }

    }


    /**
     * draw money
     * @param acc
     * @param sc
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("===========draw money=============");
        if(acc.getMoney()>=100){
            while (true) {
                System.out.println("Please enter the withdrawal amount");
                double money=sc.nextDouble();
                //2.determine the amount
                if(acc.getQuotaMoney()<money){
                    System.out.println("over the quota  you Quota is :"+acc.getQuotaMoney());
                }else {
                    //3. determine the amount of balance
                    if(acc.getMoney()>=money){
                        acc.setMoney(acc.getMoney()-money);
                        System.out.println("draw money $"+money+"success you have "+acc.getMoney()+"balance");
                        return;
                    }else {
                        System.out.println("not enough money");
                    }
                }
            }
        }else {
            System.out.println("not enough money");
        }
    }

    /**
     * Deposit Money
     * @param acc
     * @param sc
     */
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("==========Deposit Money===========");
        System.out.println("Please enter the deposit amount");
        double money=sc.nextDouble();
        acc.setMoney(acc.getMoney()+money);
        System.out.println("Deposit success");
        showAccount(acc);
    }

    private static void showAccount(Account acc) {
        System.out.println("============Current account details===========");
        System.out.println("card number: "+acc.getCardId());
        System.out.println("name : "+acc.getUserName());
        System.out.println("balance : "+acc.getMoney());
        System.out.println("quota : "+acc.getQuotaMoney());

    }

    /**
     * // for cusomter register bank account function
     * @param accounts //Account ArrayList
     * @param sc Scanner
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        //2.Scanner input name password and confirm password.
        System.out.println("==========Register page==========");
        System.out.println("Please input name");
        String name =sc.next();
        String password,okPassword;

        while (true) {
            System.out.println("Please input password");
             password =sc.next();
            System.out.println("Please confirm password");
             okPassword=sc.next();

            // Determine if the password entered twice is the same
            if (okPassword.equals(password)){
                break;
            }else {
                System.out.println("The two passwords must be the same~~~");
            }
        }
        System.out.println("please input the quota of drawout money");
        double quotaMoney=sc.nextDouble();
        //3. Generate the card number of the account ,card length is 8
        // And it cannot be duplicated with other account numbers
        String cardId =createCardId(accounts);

        //4.create Create an account object to encapsulate the account's message
        //public Account(String cardId, String userName, String passWord, double quotaMoney)
        Account account=new Account(cardId,name,password,quotaMoney);
        //5.add the account object to the collection
        accounts.add(account);
        System.out.println("Congratulations, you have successfully opened an account. Your card number is "+account.getCardId());
    }
    public static String createCardId(ArrayList<Account>accounts){
        while (true) {
            //Generate 8 random numbers represent the card number
            Random r= new Random();
            String cardId="";
            for (int i = 0; i <8; i++) {
                cardId+=r.nextInt(10);
            }
            //Determine whether the card number is repeated
            Account acc=getAccountByCardId(cardId,accounts);
            if(acc==null){
                //card id no repeated
                return cardId;
            }
        }


    }

    public static Account getAccountByCardId(String cardId , ArrayList<Account>accounts){
        //Query account objects by card number
        for (int i = 0; i <accounts.size(); i++) {
            Account acc=accounts.get(i);
            if (cardId.equals(acc.getCardId())){
                return acc;
            }
        }
        return null;//No such account
        //Note that the card number is not repeated
    }


}
