import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user = new User(10, "meder", "tynychbekov", "meder@gmail.com");
        User user1 = new User(23, "asan", "tairov", "asan@gmail.com");
        User user2 = new User(3, "uson", "kamylov", "uson@gmail.com");
        User user3 = new User(4, "Bakyt", "Latibov", "bakyt@gmail.com");

        List<User> users = new ArrayList<>(Arrays.asList(user, user1, user2, user3));

        users.forEach(System.out::println);

        System.out.println("------------------------------");

        Collections.sort(users,user.compareByid);

        users.forEach(System.out::println);
    }




}