package data;

import assets.Stock;
import core.Instrument;
import core.Position;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarketDataTest {

    @Test
    void shouldReturnDummyMarketValue(){
        // Given a dummy MockMarketData object and an instrument object
        MockMarketData mockMarketData = new MockMarketData();
        Instrument apple = new Stock("AAPL");
        // When getLatestPrice is called on apple
        double latestPrice = mockMarketData.getLatestPrice(apple);
        // Then mockMarketData should return a dummy price of 10
        assertThat(latestPrice, is(20.0));
    }



}
