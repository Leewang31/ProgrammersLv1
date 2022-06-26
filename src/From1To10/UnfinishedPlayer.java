package From1To10;

import java.util.HashMap;

public class UnfinishedPlayer {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        for (String s : completion) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) - 1);
            }
        }
       
        for (String s : participant) {
            if (map.get(s).equals(1)) {
                answer = s;
            }
        }
        return answer;
    }
}
