package learning;

public class Refugee<T> {
    String name;
    public static int count;

    public Refugee(String name) {
        this.name = name;
        Refugee.count++;
    }

    public T processData(T value) {

        if (value instanceof String) {
            System.out.println("i'm string");
        } else if (value instanceof Integer) {
            System.out.println("i'm integer");
        }
            return value;

    }
}
