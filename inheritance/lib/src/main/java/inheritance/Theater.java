package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Theater implements Reviewable {
    private String name;
    private double sumOfStars;
    ArrayList<String >movie=new ArrayList<>();
    Map<String,Review> reviewMovie=new HashMap<String, Review>();




    public Theater(String name) {
        this.name = name;

    }
    public void addMovie(String name){
        movie.add(name);
    }
    public void removeMovie(String name) {
        if (movie.contains(name)) {
            movie.remove(name);
        } else {
            System.out.println("Movie is not available");
        }
    }



    public String toString(){
        String str="";
        str = "Theater name:"+this.name+"\n";
        if(movie.size()>0) {
            for (String movie : movie) {
                str = str + movie + "\n";
            }
        }
        return str;

    }





    public double addReview(String body,String author,int numOfStars) {
        Review review = new Review(body,author,numOfStars);
        for (int i = 0; i <reviewMovie.size() ; i++) {
            if (reviewMovie.get(i).getAuthor().equals(review.getAuthor())) {

            }

        }
        reviewMovie.containsValue(review);
        this.sumOfStars= ((this.sumOfStars+review.getNumOfStars())/2);
        System.out.println(review.test());
        return sumOfStars;

    }

}
