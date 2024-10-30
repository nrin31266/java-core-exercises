import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 3, 3, 3};
        System.out.println(singleNumber(nums));
    }
}