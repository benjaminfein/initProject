package learning;

import java.sql.SQLOutput;
import java.util.Map;

public class FriendshipService {
    private Map<String, Integer> nameToId = Map.of("Kateryna", 1,"Olha", 2);

    public void checkFriendByName(Person person, String name){
        if (nameToId.containsKey(name)){
            person.getFriendsIDs().add(nameToId.get(name));
            System.out.println(person.getFriendsIDs());
        } else {
            System.out.println("No such name : " + name);
        }

    }
}
