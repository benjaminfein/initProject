package learning;

import learning.friendship.FriendshipService;
import learning.friendship.Person;
import learning.friendship.ScheduleManager;
import learning.friendship.ScheduleManagerImpl;
import learning.inheritance.Developer;
import learning.inheritance.Manager;
import learning.inheritance.Tester;

public class Main {
//    public static int[] insertionSort(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            int current = array[i];
//            int j = i - 1;
//            while(j >= 0 && current < array[j]) {
//                array[j+1] = array[j];
//                j--;
//            }
//            // в этой точке мы вышли, так что j так же -1
//            // или в первом элементе, где текущий >= a[j]
//            array[j+1] = current;
//        }
//        return array;
//    }
//
    public static void main(String[] args) {
        Person truePerson = new Person("Olha", 38, 12000);
        Person badPerson = new Person("Mazai", 19, -10);
        Person splinter = new Person("Marina", 29, 0);

        FriendshipService service = new FriendshipService();
        service.addNewFriend("Kateryna", splinter);
        service.muteFriend("Kateryna", splinter);
        System.out.println(splinter);

        ScheduleManager scheduleManager = new ScheduleManagerImpl();
        String deal = "Learn Collections";
        String deal2 = "Learn modification";
        scheduleManager.addDeal(deal);
        scheduleManager.addDeal(deal2);
        System.out.println(scheduleManager.getDeal(deal));
        scheduleManager.removeDeal(deal);
        System.out.println(scheduleManager.getAllDeals());
    }

//    public static void main(String[] args) {
//        Developer mark = new Developer("Mark", 2, "2", 20000);
//        Manager sofi = new Manager("Sofi", 1, "4", 6000);
//        Tester ben = new Tester("Ben", 0, "0", 1000);
//    }



}
