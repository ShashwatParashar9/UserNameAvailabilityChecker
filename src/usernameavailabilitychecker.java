import java.util.*;

public class Main {

    static class UsernameChecker {

        HashMap<String,Integer> users = new HashMap<>();
        HashMap<String,Integer> attempts = new HashMap<>();

        public boolean checkAvailability(String username){
            return !users.containsKey(username);
        }
        public List<String> suggestAlternatives(String username){

            List<String> suggestions = new ArrayList<>();

            suggestions.add(username + "1");
            suggestions.add(username + "2");
            suggestions.add(username + "3");

            return suggestions;
        }

    }

    public static void main(String[] args) {

        UsernameChecker system = new UsernameChecker();
        System.out.println("Username Checker Started");

    }
}