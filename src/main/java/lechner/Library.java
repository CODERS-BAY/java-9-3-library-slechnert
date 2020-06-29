package lechner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Library {

    private String libraryName;
    private ArrayList<Book> generalBookList = new ArrayList<Book>();
    private Map<Person, List<Book>> currentLoans = new HashMap<>();

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

    public void lendBook(Person person, Book book){
        if(generalBookList.contains(book)){

            if(person.getCredits() < 5){
            System.out.println("Insufficient funds, please buy some credits ( C = "+person.getCredits()+" )");
            } else{


            if(currentLoans.containsKey(person)){
                currentLoans.get(person).add(book);
            } else{
                ArrayList<Book> borrowedBooks = new ArrayList<>();
                borrowedBooks.add(book);
                currentLoans.put(person, borrowedBooks);
        }}}
            else {
                System.out.println("Sorry, but this book isn't part of the library!");
        }}

    public void returnBook(Person person, Book book, Integer daysBorrowed){
        int pricePerDay = 2;
        person.setCredits(person.getCredits() - daysBorrowed * pricePerDay);

        List<Book> currentlyBorrowedBooks = currentLoans.get(person);
        currentLoans.remove(book);

            if(person.getCredits() < 0){
                System.out.println("You owe us money, go equalize your debt immediately ( C = "+person.getCredits()+" )");
                System.out.println("(We still took the book from you)");
            } else{
                System.out.println("Successfully returned "+book.getTitle());
            }
        }

        public void printLoansForPerson(Person person){
            System.out.println("Person "+person+ "has borrowed:");
            if(currentLoans.containsKey(person)) {
                List<Book> booksByPerson = currentLoans.get(person);
                for(Book book : booksByPerson){
                    System.out.println(book);
                }
            }
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

    public void setGeneralBookList(ArrayList<Book> generalBookList) {
        this.generalBookList = generalBookList;
    }
}