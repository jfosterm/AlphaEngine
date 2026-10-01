package data;

import core.Instrument;

public interface MarketDataProvider {

    double getLatestPrice(Instrument instrument);
}
