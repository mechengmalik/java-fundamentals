package inheritance;

import java.util.ArrayList;

public class Restaurant implements Reviewable {
    private String name;
    private double sumOfStars;
    private String price;
    private ArrayList<Review> reviewList = new ArrayList<>();



    public Restaurant(String name, double sumOfStars, String price) {
        this.name = name;
        this.sumOfStars = sumOfStars;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSumOfStars() {
        return sumOfStars;
    }

    public void setSumOfStars(double sumOfStars) {
        this.sumOfStars = sumOfStars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }

    public ArrayList<Review> getReviewList() {

        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public String toString(){
        String rating = "Restaurant name is " + this.name + " rating in stars is : " + this.sumOfStars+"*" + " price category: " + this.price+ "$";

        return rating;
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
        return sumOfStars;

    }
}
