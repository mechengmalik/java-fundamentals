package inheritance;

public class Review {
    private String body;
    private String author;
    private int sumOfStars;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfStars() {
        return sumOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.sumOfStars = sumOfStars;
    }

    public Review(String body, String author, int numOfStars) {
        this.body = body;
        this.author = author;
        this.sumOfStars = sumOfStars;
    }

    public String toString(){
        String note = "rating : "+this.body+ " Clint name: " +this.author + " rating with stars is : " + this.sumOfStars;
        return  note;

    }
    public String test(){
        String note = "this statement is from review class";
        return  note;

    }
}
