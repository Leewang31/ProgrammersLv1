package From1To10;

public class Watermelon {
    public static void main(String[] args) {
        int n =3;
        System.out.println(solution(n));
    }

    public static String solution(int n) {
        String answer ="";
        String watermelon = "수박";
        for (int i = 0; i < n / 2; i++) {
            answer +=watermelon;
        }
        if (n%2 ==1){
            answer +="수";
        }
        return answer;
    }
}
