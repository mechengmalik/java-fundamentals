package inheritance;

public class Review {
    String body;
    String author;
    int numOfStars;

    public Review(String body, String author, int numOfStars) {
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
    }

    public String toString(){
        String note = "rating : "+this.body+ " Clint name: " +this.author + " rating with stars is : " + this.numOfStars;
        return  note;

    }
    public String test(){
        String note = "this statement is from review class";
        return  note;

    }
}
