package core;

import assets.Stock;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class PositionTest {

    @Test
    void positionShouldContainGivenStock(){
        // Given a stock APPL
        Instrument apple = new Stock("AAPL");
        // When a position object is created
        Position applPosition = new Position(apple, 10, 20);
        // Then getInstrument should return apple Stock
        assertThat(applPosition.getInstrument(), is(apple));
    }


}
