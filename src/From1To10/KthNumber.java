package From1To10;

import java.util.Arrays;

public class KthNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));

    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];

        for(int i =0 ; i< commands.length;i++){
            answer[i] = arrayCut(array,commands[i]);
        }
        return answer;
    }

    private static int arrayCut(int[] array, int[] command) {
        int[] newArray = new int[command[1]-command[0]+1];
        int count =0;
        for (int i =0;i<array.length;i++){
            if(i>=command[0]-1&&i<=command[1]-1){
                newArray[count] = array[i];
                count++;
            }
        }
        Arrays.sort(newArray);
        return newArray[command[2]-1];
    }
}
