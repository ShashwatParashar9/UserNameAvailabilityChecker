import java.util.*;

public class Main {

    static class UsernameChecker {

        HashMap<String,Integer> users = new HashMap<>();
        HashMap<String,Integer> attempts = new HashMap<>();

        public boolean checkAvailability(String username){
            return !users.containsKey(username);
        }

    }

    public static void main(String[] args) {

        UsernameChecker system = new UsernameChecker();
        System.out.println("Username Checker Started");
        System.out.println(system.checkAvailability("john"));

    }
}
