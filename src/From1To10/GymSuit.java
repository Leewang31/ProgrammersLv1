package From1To10;

import java.util.HashMap;

public class GymSuit {
    public static void main(String[] args) {
        int n = 6;
        int[] lost = {1, 4, 6};
        int[] reserve = {2, 3, 5};
        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        for (int i : lost) {
            map.put(i, map.get(i) - 1);
        }

        for (int i : reserve) {
            map.put(i, map.get(i) + 1);
        }

        System.out.println(map);

        return Math.max(Check(map, n),Check1(map,n));
    }

    private static int Check(HashMap<Integer, Integer> map, int n) {
        int result = 0;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 1; i <= map.size(); i++) {
            map1.put(i,map.get(i));
        }
        for (int i = 1; i < n; i++) {
            if (map1.get(i) > 1 && map1.get(i + 1) == 0) {
                map1.put(i, map1.get(i) - 1);
                map1.put(i + 1, map1.get(i + 1) + 1);
            }
        }
        for (int i = 1; i < n; i++) {
            if (map1.get(i + 1) > 1 && map1.get(i) == 0) {
                map1.put(i, map1.get(i) + 1);
                map1.put(i + 1, map1.get(i + 1) - 1);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (map1.get(i) > 0) {
                result++;
            }
        }
        return result;
    }

    private static int Check1(HashMap<Integer, Integer> map, int n) {
        int result = 0;
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 1; i <= map.size(); i++) {
            map2.put(i,map.get(i));
        }
        for (int i = n; i > 1; i--) {
            if (map2.get(i) > 1 && map2.get(i - 1) == 0) {
                map2.put(i, map2.get(i) - 1);
                map2.put(i - 1, map2.get(i - 1) + 1);
            }
        }
        for (int i = n; i > 1; i--) {
            if (map2.get(i-1) > 1 && map2.get(i) == 0) {
                map2.put(i, map2.get(i) + 1);
                map2.put(i - 1, map2.get(i - 1) - 1);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (map2.get(i) > 0) {
                result++;
            }
        }
        return result;
    }
}
