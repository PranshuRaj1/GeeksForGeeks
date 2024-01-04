import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccurOne {
    public static void main(String[] args) {
        int[] arr = {1,10,1,1};
        System.out.println(singleElement1(arr, arr.length));

    }

    static int singleElement(int[] arr , int N) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> entry :
                map.entrySet()) {
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
    static int singleElement1(int[] arr , int N) {
        // code here
        Arrays.sort(arr);


        for (int i = 1; i < N-1; i++) {
            if (arr[i - 1]== arr[i] && arr[i] == arr[i+1]){

            }
            else {
                if (arr[i - 1] == arr[i]){
                    return arr[i+1];
                } else if (arr[i] == arr[i+1]) {
                    return arr[i-1];
                }
            }

        }
        return -1;
    }
}

