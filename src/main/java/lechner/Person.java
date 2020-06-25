package lechner;
import java.util.ArrayList;

public class Person {
    private  Integer id;
    private  Integer credits;
    private  ArrayList<Book> personalLendingList = new ArrayList<>();

    public Person(Integer id, Integer credits) {
        this.id = id;
        this.credits = credits;
    }


    public void buyCredits(Integer creditToAdd){
        credits = credits + creditToAdd;
        System.out.println(creditToAdd + "has been added!");
        System.out.println("Total Credit is now:" + credits);
    }

    public void lendBook(Book b){
        if(credits >= 5){
            personalLendingList.add(b);
            System.out.println("Successfully borrowed " + b.getTitle());
        } else{
            System.out.println("Insufficient funds, please buy some credits ( C = "+credits+" )");
        }
    }

    public void returnBook(Book b, Integer daysBorrowed){
        personalLendingList.remove(b);
        credits -= daysBorrowed*2;
        if(credits < 0){
            System.out.println("You owe us money, go equalize your debt immediately ( C = "+credits+" )");
            System.out.println("(We still took the book from you)");
        } else{
            System.out.println("Successfully returned "+b.getTitle());
        }
    }


    //Getter & Setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public ArrayList<Book> getPersonalLendingList() {
        return personalLendingList;
    }

    public void setPersonalLendingList(ArrayList<Book> personalLendingList) {
        this.personalLendingList = personalLendingList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", credits=" + credits +
                '}';
    }
}