package inheritence;

public class Review extends Restaurant {
    private String body;
    private String author;
    private int stars;

    public Review (String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}
