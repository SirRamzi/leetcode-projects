import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(Solution.singleNumber(nums));
    }
}

class Solution {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static int singleNumberFast(int[] nums) {
        int result = 0;
        for (int num : nums)
            result ^= num;
        return result;
    }
}