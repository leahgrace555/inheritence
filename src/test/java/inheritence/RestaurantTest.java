package inheritence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {

    @Test
    public void testRestaurantConstructor() {
        Restaurant test = new Restaurant("food place", 5, "$$$$");

        assertEquals("Restaurant" + "{name='food place', rating=5, priceCategory='$$$$'}", test.toString());
    }
}
