package classwork.libraray;

public class Book {
    private String title;
    private String authorname;
    private double price;
    private int count;

    public Book(String title, String authorname, double price, int count) {
        this.title = title;
        this.authorname = authorname;
        this.price = price;
        this.count = count;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
