package inheritence;

public class Restaurant {

    private String name;
    private int rating;
    private String priceCategory;

    public Restaurant(String name, int rating, String priceCategory) {
        this.name = name;
        this.rating = rating;
        this.priceCategory = priceCategory;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", priceCategory='" + priceCategory + '\'' +
                '}';
    }
}
