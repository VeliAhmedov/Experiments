package exercise;

import java.util.ArrayList;

public class Library {
    private String name;
    private String address;
    private ArrayList<Book> books;
    // Constructor
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>(); // Initialize the list
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }
    public void displayBooks() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("- " + book);
            }
        }
    }
}
