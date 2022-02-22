package learning.friendship;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private Set<String> activeFriends;
    private Set<String> ignoredFriends;
    private String character;
    private String name;
    private int age;
    private int height;
    private double balance;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        activeFriends = new HashSet<>();
        ignoredFriends = new HashSet<>();
    }

    public Person(String name, int age, double balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
        activeFriends = new HashSet<>();
        ignoredFriends = new HashSet<>();
    }

    public String checkMood(String mood){
        if(balance <= 0){
            return "badMood";
        }
        return mood;
    }

    public Set<String> getActiveFriends() {
        return activeFriends;
    }

    public Set<String> getIgnoredFriends() {
        return ignoredFriends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "activeFriends=" + activeFriends +
                ", ignoredFriends=" + ignoredFriends +
                ", character='" + character + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", balance=" + balance +
                '}';
    }
}


