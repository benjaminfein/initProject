package learning.basic;

import com.sun.source.tree.Tree;
import learning.friendship.Person;
import learning.friendship.SuperPerson;

import java.util.*;

public class Sandbox {

    public static void main(String[] args) {

        TreeSet name = new TreeSet();
        TreeSet surname = new TreeSet();
        name.add(123512415);
        name.add(367436345);
        name.add(765674567);
        name.add(56785678);
        surname.addAll(name);
        System.out.println(name);
        System.out.println(surname);
        name.remove(765674567);
        surname.remove(56785678);
        System.out.println(name);
        System.out.println(surname);
        name.clear();
        System.out.println(name);

    }
}