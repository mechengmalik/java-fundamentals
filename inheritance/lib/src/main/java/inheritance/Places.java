package inheritance;


abstract class  Places {
    private String name;
    private String price;

    public Places(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }




    public abstract void addReview(String body, String author, int numOfStars);
}
