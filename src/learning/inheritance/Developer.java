package learning.inheritance;

public class Developer extends Employee {

    public Developer(String name, int experience, String speedDev, int salary) {
            super(name, experience, speedDev, salary);
    }

    public String work(int experience, int salary){
        if (experience <= 0) {
            return "Salary = " + salary;
        }
        return String.valueOf(experience);
    }

    public String research(String speedDev, int salary, int experience){
        if (speedDev == "2") {
            return "Salary = " + salary;
        }
        return String.valueOf(experience) + " is too low experience to do this work as fast as you want";
    }
}

