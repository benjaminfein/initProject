package learning.friendship;

public class FriendshipService {
    public void addNewFriend(String name, Person person) {
        person.getActiveFriends().add(name);
    }

    public void removeFriend(String name, Person person) {
        person.getActiveFriends().remove(name);
    }

    public void muteFriend(String name, Person person) {
        person.getIgnoredFriends().add(name);
        removeFriend(name, person);
    }
}
