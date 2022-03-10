package learning.basic;

import learning.Refugee;
import learning.friendship.Person;

import java.util.ArrayList;
import java.util.List;

public class Sandbox {

    static String k = "Agent-K";
    public static class TestClass {

        public void test1() {
            System.out.println("inner static class invocation");
        }

    }

    public static void mystery() {
        System.out.println("static");
    }

    public static void main(String[] args) {

        Refugee<String> katya = new Refugee<>("Katya");
        Refugee<Person> egor = new Refugee<>("Egor");
        System.out.println(Refugee.count);
        System.out.println(katya.processData("asdgadh"));
        Person person = new Person("afas", 123);
        System.out.println(egor.processData(person));

    }

    public void box() {
        System.out.println("non-static");
        System.out.println(k);
    }
}