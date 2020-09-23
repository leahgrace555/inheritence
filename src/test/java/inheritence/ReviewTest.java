package inheritence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {

    @Test
    public void testReviewConstructor() {
        Review test = new Review("this place is fine", "me",3);

        //code review
        Review chipotle = new Review("good", "me", 5);
       // chipotle.restaurantIAmAbout = chipotle;

        System.out.print(test.toString());
        assertEquals("Review{body='this place is fine', author='me', stars=3}",test.toString());
    }
}
