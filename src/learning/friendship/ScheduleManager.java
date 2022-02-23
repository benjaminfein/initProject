package learning.friendship;

import java.util.ArrayList;

public interface ScheduleManager {
    void addDeal(String deal);
    void removeDeal(String deal);
    String getDeal(String deal);
    ArrayList<String> getAllDeals();
}
