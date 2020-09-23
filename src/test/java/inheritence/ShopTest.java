package inheritence;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShopTest {
    @Test public void testCreateShop () {
        Shop shop = new Shop("tests-r-us", 5,"$$$", "we sell shops");
        assertEquals("this is the shop name","tests-r-us",shop.getName());
    }
}
