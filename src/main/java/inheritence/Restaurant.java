package inheritence;

//exttend restaurant to shop
//add super to shop for the restaraunt specific things
// add

import java.util.ArrayList;

public class Restaurant {

    private String name;
    private int rating;
    private String priceCategory;

    //code reveiw: can store reviews as an array list here
    //can create a variable counter to store the number of reviews and total stars to create the average
    // could create a hashmap with a restaurant as the
    //could store the restaurants as a linked list

    public Restaurant(String name, int rating, String priceCategory) {
        this.name = name;
        this.rating = rating;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return this.name;
    }

    public String getPriceCategory() {return this.priceCategory;}

    public int getRating() {
        return rating;
    }

    ArrayList<Review> restaurantReviews = new ArrayList<>();



    public void addReview (Review reviewToAdd) {
        restaurantReviews.add(reviewToAdd);
        updateStarRating();
    }

    public void updateStarRating() {
        int rating = 0;
        for(int i = 0 ; i < restaurantReviews.size(); i++) {
            rating += restaurantReviews.get(i).getStars();
        }
        int updatedRating = rating / restaurantReviews.size();
        this.rating = updatedRating;
    }


//    public void addReview( String body, String author) {
//        Review newReview = new Review(body,author,rating);
//        newReview.restaurantIAmAbout = chipotle;
//        chipotle.feedback.add(newReview);
//        //i think the "feedback" is an array list I do not have made
//    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", priceCategory='" + priceCategory + '\'' +
                '}';
    }
}
