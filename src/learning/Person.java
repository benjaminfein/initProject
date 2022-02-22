package learning;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<Integer> friendsIDs;
    private String character;
    private String name;
    private int age;
    private int height;
    private double balance;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        friendsIDs = new ArrayList<>();
    }

    public Person(String name, int age, double balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
        friendsIDs = new ArrayList<>();
    }

    public String checkMood(String mood){
        if(balance <= 0){
            return "badMood";
        }
        return mood;
    }

    public void setFriendsIDs(List<Integer> friendsIDs) {
        this.friendsIDs = friendsIDs;
    }

    public List<Integer> getFriendsIDs() {
        return friendsIDs;
    }
}


