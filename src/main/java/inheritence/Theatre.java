package inheritence;

public class Theatre extends Restaurant {
    public String movie;

    public Theatre(String name, int rating, String priceCategory, String movie) {
        super(name, rating, priceCategory);
        this.movie = movie;

    }
}
