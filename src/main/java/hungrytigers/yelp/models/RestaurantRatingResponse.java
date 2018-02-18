package hungrytigers.yelp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestaurantRatingResponse {

    private String restaurantId;
    private String restaurantName;
    private String rating;
    private String reviews[];

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String[] getReviews() {
        return reviews;
    }

    public void setReviews(String[] reviews) {
        this.reviews = reviews;
    }
}
