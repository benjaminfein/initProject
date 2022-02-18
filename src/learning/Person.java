package learning;

public class Person {
    private String character;
    private String name;
    private int age;
    private int height;
    private double balance;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String checkMood(String mood){
        if(balance <= 0){
            return "badMood";
        }
        return mood;
    }
}


