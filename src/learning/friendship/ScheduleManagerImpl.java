package learning.friendship;

import java.util.ArrayList;
import java.util.List;

public class ScheduleManagerImpl implements ScheduleManager {
    private List<String> deals = new ArrayList<>();

    @Override
    public void addDeal(String deal) {
        deals.add(deal);
    }

    @Override
    public void removeDeal(String deal) {
        deals.remove(deal);
    }

    @Override
    public String getDeal(String deal) {
        int index = deals.indexOf(deal);
        return deals.get(index);
    }

    @Override
    public List<String> getAllDeals() {
        return deals;
    }
}
