package lechner;
import java.util.ArrayList;

public class Person {
    private  Integer id;
    private  Integer credits;

    public Person(Integer id, Integer credits) {
        this.id = id;
        this.credits = credits;


    }
    public void buyCredits(Integer creditToAdd){
        credits = credits + creditToAdd;
        System.out.println(creditToAdd + "has been added!");
        System.out.println("Total Credit is now:" + credits);
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


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", credits=" + credits +
                '}';
    }
}