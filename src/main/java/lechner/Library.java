package lechner;

import java.util.ArrayList;


public class Library {

    private String libraryName;
    private ArrayList<Book> generalBookList = new ArrayList<Book>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book b) {
        generalBookList.add(b);
        System.out.println("Successfully added " + b.getTitle() + " to the library!");
    }

    public void removeBook(Book b) {
        generalBookList.remove(b);
        System.out.println("Successfully removed " + b.getTitle() + " from the library");
    }

    public void lendBook(Person p, Book b){
        if(generalBookList.contains(b)){
            p.lendBook(b);
        }
        else{
            System.out.println("Sorry, but this book isn't part of the library!");
        }
    }

    public void returnBook(Person p, Book b, Integer daysBorrowed){
        p.returnBook(b,daysBorrowed);
    }

//        Getter & Setter

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public ArrayList<Book> getGeneralBookList() {
        return generalBookList;
    }

}