import java.util.ArrayList;
import java.util.Arrays;

public class TargetedPairs {

    public static ArrayList<Pair> TargetedPairs(int[] nums, int target){
        Arrays.sort(nums);
        ArrayList<Pair> pairs = new ArrayList<>();

        int i = 0;
        int j = nums.length - 1;
        while(i < j) {
            if(nums[i] + nums[j] > target ){
                j--;
            }
            else if(nums[i] + nums[j] < target) {
                i++;
            }
            else if(nums[i] + nums[j] == target){
                int n = j - i;
                if(nums[i] == nums[j]) {
                    int sum = n * (n + 1) / 2;
                    for (int k = 0; k < sum; k++) {
                        pairs.add(new Pair(nums[i], nums[j]));
                    }
                }else{
                    pairs.add(new Pair(nums[i], nums[j]));
                }
                i++;
            }

        }

        //check the away for pairs to add to target
        return pairs;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 1, 3, 3, 9};
        int target = 6;
        ArrayList<Pair> pairs = TargetedPairs(nums, target);
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(pairs.get(i).printPairs());
        }
    }
}
