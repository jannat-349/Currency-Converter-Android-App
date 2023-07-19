package com.example.currencyconverter;

public class ConvertCurrency {
    public static double bdtUSD(double amount) {
        double usdAmount = amount / 107;
        return usdAmount;
    }

    public static double usdBDT(double amount) {
        double bdtAmount = amount * 107;
        return bdtAmount;
    }

    public static double inrUSD(double amount) {
        double usdAmount = amount / 82;
        return usdAmount;
    }
}
