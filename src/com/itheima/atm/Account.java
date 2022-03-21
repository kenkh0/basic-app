package com.itheima.atm;

public class Account {
    private String bankName ;
    private String bankPassword ;
    private int bankCashLimit ;
    private int bankAccNumber ;
    private int bankAccBalance;
    public Account() {
    }



    public Account(String bankName, String bankPassword, int bankCashLimit, int bankAccNumber, int bankAccBalance) {
        this.bankName = bankName;
        this.bankPassword = bankPassword;
        this.bankCashLimit = bankCashLimit;
        this.bankAccNumber = bankAccNumber;
        this.bankAccBalance = bankAccBalance;
    }

    public void setBankAccBalance(int bankAccBalance) {
        this.bankAccBalance = bankAccBalance;
    }

    public int getBankAccBalance() {
        return bankAccBalance;
    }
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankPassword() {
        return bankPassword;
    }

    public void setBankPassword(String bankPassword) {
        this.bankPassword = bankPassword;
    }

    public int getBankCashLimit() {
        return bankCashLimit;
    }

    public void setBankCashLimit(int bankCashLimit) {
        this.bankCashLimit = bankCashLimit;
    }

    public int getBankAccNumber() {
        return bankAccNumber;
    }

    public void setBankAccNumber(int bankAccNumber) {

        this.bankAccNumber = bankAccNumber;
    }
}
