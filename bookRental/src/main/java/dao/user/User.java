package dao.user;

import dao.book.Book;

import java.util.List;

public class User {

    private int id;
    private String username;
    private boolean status;
    private List<Book> bookList;


    public User(int id, String username, boolean status, List<Book> bookList) {
        this(id, username, status);
        this.bookList = bookList;
    }

    public User(int id, String username, boolean status) {
        this.id = id;
        this.username = username;
        this.status = status;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", status=" + status +
                ", bookList=" + bookList +
                '}';
    }
}
