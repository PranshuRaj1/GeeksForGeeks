import java.util.HashSet;
import java.util.Set;

public class SmallestWindow {
    public static void main(String[] args) {
        System.out.println(smallestSubstring("01212"));

    }
    static int smallestSubstring(String S) {
        // Code here
        int one = -1;
        int zero = -1;
        int two = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '1'){
                one = i;
            }
            if (S.charAt(i) == '0'){
                zero = i;

            }
            if (S.charAt(i) == '2'){
                two = i;
            }

            if (one == -1 || two == -1 || zero == -1){
                continue;
            }

            int max = Math.max(Math.max(one,two),zero);
            int min = Math.min(Math.min(one,two),zero);

            ans = Math.min(ans,max - min + 1);
        }


        return ans == Integer.MAX_VALUE?-1:ans;
    }
}
