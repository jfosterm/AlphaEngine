package assets;

import core.Instrument;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

class StockTest {

    @Test
    void stockReturnsCorrectTicker() {
        // Given a stock with ticker initalized to "APPL"
        Instrument apple = new Stock("AAPL");

        // When we call getTicker
        String ticker = apple.getTicker();

        // Then the ticker should return APPL
        assertThat(ticker, is("AAPL"));
    }
}