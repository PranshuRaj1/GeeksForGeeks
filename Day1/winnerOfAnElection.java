import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class winnerOfAnElection {
    public static void main(String[] args) {

        String[] arr = {"john", "johnny", "jackie","a", "johnny", "john", "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny", "john"};
        System.out.println(Arrays.toString(winner(arr, arr.length)));
    }
    static String[] winner(String arr[], int n)
    {
        Map<String,Integer> map = new HashMap<>();

        for (String name : arr) {
            map.put(name,map.getOrDefault(name,0)+1);

        }
        System.out.println(map);
        int max = 0;
        String winner = "";

        for (Map.Entry<String,Integer> entry : map.entrySet()
             ) {
            String candidate = entry.getKey();
            int votecount = entry.getValue();

            if (votecount > max || (votecount == max && candidate.compareTo(winner) < 0)){
                winner = candidate;
                max = votecount;
            }
        }
        String[] result = {winner, String.valueOf(max)};

        return result;
    }
}
