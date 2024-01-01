import java.util.HashMap;
import java.util.Map;

public class ArrayPairSumDivisibility {
    public static void main(String[] args) {
        int[] nums = {9,5,7,3};
        System.out.println(canPair(nums,6));

    }
    static boolean canPair(int[] nums, int k) {
        if (nums.length % 2 != 0){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int remainder = num % k;
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int remainder = entry.getKey();
            int count = entry.getValue();

            if (remainder == 0){
                if (count % 2 != 0){
                    return false;
                }
            } else if (k % 2 == 0 && remainder == k/2 ) {
                if (count % 2 != 0){
                    return false;
                }
            }
            else {
                int rem = (k - remainder)%k;
                if (!map.containsKey(rem) || map.get(rem) != count ){
                    return false;
                }
            }
        }

        return true;
    }
    static boolean canPair1(int[] nums, int k) {
        if (nums.length % 2 != 0){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i] % k;
            int needed = (k - current) % k;

            if (map.containsKey(needed)){
                map.put(needed, map.get(needed) - 1);

                if (map.get(needed) == 0){
                    map.remove(needed);
                }
            }
            else {
                map.put(current, map.getOrDefault(current,0)+1);
            }
        }
        return map.size() == 0;
    }
}
