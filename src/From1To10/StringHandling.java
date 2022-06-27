package From1To10;

public class StringHandling {
    public static void main(String[] args) {
        String s = "1123";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        String[] stringArray = s.split("");
        if (stringArray.length == 4 || stringArray.length == 6) {
            for (String str : stringArray) {
                char ch = str.charAt(0);
                if ((int) ch < 48 || (int) ch > 57) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
