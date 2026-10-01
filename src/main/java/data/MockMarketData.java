package data;

import core.Instrument;

public class MockMarketData implements MarketDataProvider {
    @Override
    public double getLatestPrice(Instrument instrument) {
        return 20;
    }
}
