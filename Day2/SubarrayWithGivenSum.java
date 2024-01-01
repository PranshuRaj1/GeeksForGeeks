import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        System.out.println(subarraySum(arr,5,12));

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> list =new ArrayList<>();
        int start = 0;
        int end = 0;
        int sum = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if (sum >=s){
                end = i;
                while (s < sum && start < end){
                    sum = sum - arr[start++];
                }
            }
            if (sum == s){
                list.add(start+1);
                list.add(end + 1);
                found = true;
                break;

            }
        }
        if (!found){
            list.add(-1);
        }


        return list;
    }
}
