package learning.friendship;

import java.util.*;

public class Person implements Comparable<Person>{
    private Set<String> activeFriends;
    private Set<String> ignoredFriends;
    public  List<String> deals;
    private String character;
    private String name;
    private int age;
    private int height;
    private double balance;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        activeFriends = new HashSet<>();
        ignoredFriends = new HashSet<>();
        deals = new ArrayList<>();
    }

    public Person(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        activeFriends = new HashSet<>();
        ignoredFriends = new HashSet<>();
        deals = new ArrayList<>();
    }

    public String checkMood(String mood) {
        if (balance <= 0) {
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

    public List<String> getDeals() {
        return deals;
    }

    @Override
    public String toString() {
        return "Person{" +
                "activeFriends=" + activeFriends +
                ", ignoredFriends=" + ignoredFriends +
                ", deals=" + deals +
                ", character='" + character + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(Person anotherPerson) {
        return this.name.compareTo(anotherPerson.name);
    }
}


