package solution;

import java.util.*;

public class Solution {
    public static int minExtraChar(String s, String[] dictionary) {
        // Chuyển từ điển sang HashSet để tìm nhanh hơn
        Set<String> dictSet = new HashSet<>(Arrays.asList(dictionary));
        int n = s.length();
        // Tạo mảng dp, dp[i] là số ký tự thừa ít nhất khi xét từ vị trí i
        int[] dp = new int[n + 1];

        // Khởi tạo dp[n] = 0 vì không còn ký tự nào thừa sau khi hết chuỗi
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n] = 0;

        // Duyệt ngược từ cuối chuỗi về đầu
        for (int i = n - 1; i >= 0; i--) {
            // Giả định tất cả các ký tự từ i là thừa
            dp[i] = dp[i + 1] + 1;

            // Xét các chuỗi con bắt đầu từ vị trí i
            for (int j = i; j < n; j++) {
                String substring = s.substring(i, j + 1);
                if (dictSet.contains(substring)) {
                    // Nếu chuỗi con có trong từ điển, cập nhật dp[i]
                    dp[i] = Math.min(dp[i], dp[j + 1]);
                }
            }
        }

        // Trả về kết quả là dp[0]
        return dp[0];
    }

    public static void main(String[] args) {
        // Ví dụ 1
        System.out.println(minExtraChar("leetscode", new String[]{"leet", "code", "leetcode"})); // Kết quả: 1
        // Ví dụ 2
        System.out.println(minExtraChar("sayhelloworld", new String[]{"hello", "world"})); // Kết quả: 3
    }
}
