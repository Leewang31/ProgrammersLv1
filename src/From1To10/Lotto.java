package From1To10;

import java.util.ArrayList;
import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int rankingMax = 7;
        int rankingMin = 7;
        ArrayList<Integer> win_numList = new ArrayList<>();
        for (int i : win_nums) {
            win_numList.add(i);
        }
        for (int i : lottos) {
            if (i == 0) {
                rankingMax--;
                continue;
            }
            if (win_numList.contains(i)) {
                rankingMax--;
                rankingMin--;
            }
        }
        if (rankingMax == 7) {
            rankingMax = 6;
        }
        if (rankingMin == 7) {
            rankingMin = 6;
        }
        answer[0] = rankingMax;
        answer[1] = rankingMin;
        return answer;
    }
}
