package From1To10;

import java.util.ArrayList;
import java.util.Arrays;

public class MockExam {
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution(answers)));
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] an1 = {1, 2, 3, 4, 5};
        int[] an2 = {2,1,2,3,2,4,2,5};
        int[] an3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1=0,count2=0,count3=0;
        if(answers==null || answers.length==0) return new int[]{1,2,3};
        for(int i=0 ;i<answers.length;++i){
            if(an1[i%5] == answers[i]){ ++count1;  }
            if(an2[i%8]==answers[i]){  ++count2;  }
            if(an3[i%10]==answers[i]){++count3;
            }
        }

        int max = Math.max(Math.max(count1,count2), count3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(count1==max)list.add(1);
        if(count2==max)list.add(2);
        if(count3==max)list.add(3);
        if(list.isEmpty()) return new int[]{1,2,3};

        answer = new int[list.size()];
        int index = 0;
        for(int value : list){answer[index++]=value;}

        return answer;
    }
}
