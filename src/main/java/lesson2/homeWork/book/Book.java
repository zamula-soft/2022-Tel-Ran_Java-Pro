package lesson2.homeWork.book;

public class Book {
    private Author author;
    private String title;
    private double price;

    public Book(Author author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Book [Title = %s, Author = %s, price = %f5.2]", title, author, price);
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
