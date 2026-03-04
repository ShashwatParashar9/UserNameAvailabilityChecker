import java.util.*;

public class Main {

    static class UsernameChecker {

        HashMap<String,Integer> users = new HashMap<>();
        HashMap<String,Integer> attempts = new HashMap<>();

        // UC1
        public boolean checkAvailability(String username){
            attempts.put(username, attempts.getOrDefault(username,0)+1);
            return !users.containsKey(username);
        }

        // UC2
        public List<String> suggestAlternatives(String username){

            List<String> suggestions = new ArrayList<>();

            suggestions.add(username + "1");
            suggestions.add(username + "2");
            suggestions.add(username + "3");

            return suggestions;
        }

        // UC3
        public String getMostAttempted(){

            String maxUser="";
            int max=0;

            for(String user : attempts.keySet()){

                if(attempts.get(user) > max){
                    max = attempts.get(user);
                    maxUser = user;
                }
            }

            return maxUser;
        }

    }

    public static void main(String[] args) {

        UsernameChecker system = new UsernameChecker();

        System.out.println("Username Checker Started");

        System.out.println(system.checkAvailability("john"));

        System.out.println(system.suggestAlternatives("john"));

        System.out.println(system.getMostAttempted());

    }
}