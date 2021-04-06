package repository;

import book.Book;

import java.util.List;

public class BookRepo {
    private List<Book> bookRepo;

    public List<Book> getBookRepo() {
        return bookRepo;
    }

    public void setBookRepo(List<Book> bookRepo) {
        this.bookRepo = bookRepo;
    }
}
