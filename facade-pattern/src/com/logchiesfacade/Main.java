package com.logchiesfacade;

public class Main {

    public static void main(String[] args) {
        Trader marketTrader = new Trader();

        marketTrader.getTrades("USD");
        marketTrader.getTrades("ZAR");

        System.out.println("Finished processing trades.");
    }
}
