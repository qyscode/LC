
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> exploredMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            exploredMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (exploredMap.containsKey(complement)) {
                if (exploredMap.get(complement) != i) {
                    return new int[] {i, exploredMap.get(complement)};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}