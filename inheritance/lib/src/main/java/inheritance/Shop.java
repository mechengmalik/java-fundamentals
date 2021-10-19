package inheritance;

import java.util.ArrayList;

public class Shop implements Reviewable{
    private String name;
    private String description;
    private String dollarSigns;
    private ArrayList<Review> reviewList = new ArrayList<>();
    private double sumOfStars;

    public Shop(String name, String description, String dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDollarSigns() {
        return dollarSigns;
    }

    public void setDollarSigns(String dollarSigns) {
        this.dollarSigns = dollarSigns;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollarSigns='" + dollarSigns + '\'' +
                '}';
    }

    public double addReview(String body,String author,int numOfStars) {
        Review review = new Review(body,author,numOfStars);
        for (int i = 0; i <reviewList.size() ; i++) {
            if (reviewList.get(i).getAuthor().equals(review.getAuthor())) {

            }

        }
        reviewList.add(review);
        this.sumOfStars= ((this.sumOfStars+review.getNumOfStars())/2);
        System.out.println(review.test());

    }
}
