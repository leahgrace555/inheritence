package inheritence;

public class Shop extends Restaurant{
    public String description;

    public Shop(String name, int rating, String priceCategory, String description) {
        super(name, rating, priceCategory);
        this.description = description;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + this.getName() + '\'' +
                ", description='" + description + '\'' +
                ", priceRange='" + this.getPriceCategory() + '\'' +
                '}';
    }
}
