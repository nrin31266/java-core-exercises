import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        if (target <= nums[0]) {
            return 0;
        }
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] < target && nums[i+1] > target) {
                return i;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
}