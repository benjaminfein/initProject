package learning.friendship;

import java.util.List;

public interface ScheduleManager {
    void addDeal(String deal);
    void removeDeal(String deal);
    String getDeal(String deal);
    List<String> getAllDeals();
}
