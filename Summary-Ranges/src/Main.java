import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<String> summaryRanges(int[] nums) {
        Arrays.sort(nums);
        //array sorted
        List<String> result = new ArrayList<>();
        int len = nums.length;
        for (int i= 0; i< len; i++){
            int start = i;
            String str = String.valueOf(nums[start]);
            while ( i< len -1 && nums[i+1]-nums[i]==1){
                i++;
            }
            if(i!=start){
                str +="->"+(nums[i]);
            }
            result.add(str);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,3,5,6,7};
        System.out.println(summaryRanges(nums));
    }
}