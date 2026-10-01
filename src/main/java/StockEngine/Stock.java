package StockEngine;

import Framework.Instrument;

public class Stock implements Instrument {
    private final String ticker;

    public Stock(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public String getTicker() {
        return ticker;
    }
}
