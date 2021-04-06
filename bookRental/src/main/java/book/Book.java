package book;

public class Book {
    private int id;
    private String title;
    private String author;
    private String type;
    private boolean isRented;

    public Book(int id, String title, String author, String type, boolean isRented) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.type = type;
        this.isRented = isRented;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
