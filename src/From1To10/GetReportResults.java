package From1To10;

import java.util.Arrays;
import java.util.HashMap;

public class GetReportResults {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int arr[] = solution(id_list, report, k);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String[] newReport = Arrays.stream(report).distinct().toArray(String[]::new);
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, Integer> count_value = new HashMap<>();

        for (String s : id_list) {
            count_value.put(s, 0);
        }

        for (String s : newReport) {
            String[] str = s.split(" ");
            if (map.containsKey(str[1])) {
                String x = map.get(str[1])+ " " + str[0];
                map.put(str[1],x);
            } else {
                map.put(str[1], str[0]);
            }
        }

        for(int i= 0; i<id_list.length;i++) {
            if(map.get(id_list[i])!=null) {
                String[] str = map.get(id_list[i]).split(" ");
                if(str.length>=k) {
                    for(int z = 0; z<str.length;z++)
                        count_value.put(str[z],count_value.get(str[z])+1);
                }
            }
        }

        for(int x = 0 ; x<id_list.length;x++) {
            answer[x] =count_value.get(id_list[x]);
        }

        return answer;
    }
}
