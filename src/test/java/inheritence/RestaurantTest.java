package inheritence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {

    @Test
    public void testRestaurantConstructor() {
        Restaurant test = new Restaurant("food place", 5, "$$$$"); //declaring new variable restaurant of type Restaurant

        assertEquals("Restaurant" + "{name='food place', rating=5, priceCategory='$$$$'}", test.toString());
    }

    @Test public void testRestaurantRating() {
        Restaurant test = new Restaurant("food place", 5, "$$$$"); //declaring new variable restaurant of type Restaurant

        Review banana = new Review("this is a review", "i wrote this", 5);
        test.addReview(banana);
        assertEquals("this is the rating","i wrote this", test.restaurantReviews.get(0).getAuthor());
    }

    @Test public void testUpdateRating() {
        Restaurant test = new Restaurant("food place", 5, "$$$$"); //declaring new variable restaurant of type Restaurant

        Review banana = new Review("this is a review", "i wrote this", 5);
        Review banana2 = new Review("this is also a review", "i also wrote this", 3);
        test.addReview(banana);
        test.addReview(banana2);
        assertEquals("this is the expected rating", 4,test.getRating());
    }
}

//notes from code reviews

// add review:
