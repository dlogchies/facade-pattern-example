package com.logchiesfacade;

import java.util.Objects;

/**
 * Created by Dickie.logchies on 2017/06/04.
 */

/*
Trader Facade to get values for current markets.
Client is aware of trades, but not aware of which trades exist.
The Trader Facade determines which trades will be made available to which client.
 */
class Trader {
    private Bitcoin bitcoinTrades = new Bitcoin();

    private Forex forexTrades = new Forex();

    void getTrades(String originatingCurrency) {

        if (Objects.equals(originatingCurrency, "USD")) {
            double bitcoinValue = bitcoinTrades.getUsdBitcoinValue();
            double yenValue = forexTrades.getYenToUsd();

            System.out.println("Current USD Value for bitcoin: " + bitcoinValue + ", current USD to CNY value: " + yenValue);
        }
        else if (Objects.equals(originatingCurrency, "ZAR")) {
            double bitcoinValue = bitcoinTrades.getZarBitcoinValue();
            double usdValue = forexTrades.getZarToUsd();

            System.out.println("Current ZAR Value for bitcoin: " + bitcoinValue + ", current ZAR to USD value: " + usdValue);
        }
        else {
            System.out.println("Invalid currency specified");
        }
    }
}
