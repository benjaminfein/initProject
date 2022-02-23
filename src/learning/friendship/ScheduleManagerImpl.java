package learning.friendship;

import java.util.ArrayList;

public class ScheduleManagerImpl extends Person {
    public ScheduleManagerImpl(String name, int age) {
        super(name, age);
    }

    void addDeal(String deal, Person person) {
        person.getDeals().add(deal);
    }

    void removeDeal(String deal, Person person) {
        person.getDeals().remove(deal);
    }

    public ArrayList<String> getDeals() {
        return deals;
    }
}
