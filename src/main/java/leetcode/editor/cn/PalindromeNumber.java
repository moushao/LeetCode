package main.java.leetcode.editor.cn;
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1: 
//
// 输入: 121
//输出: true
// 
//
// 示例 2: 
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3: 
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 进阶: 
//
// 你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学


import java.util.HashMap;
import java.util.Map;

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
        solution.isPalindrome(121);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0)
                return false;
            int y = x;
            int i = 0;
            Map<Integer, Integer> map = new HashMap<>();
            while (y != 0) {
                map.put(i++, y % 10);
                y = y / 10;
            }
            for (i = 0; i <= map.size() / 2; i++) {
                if (map.get(i) != map.get(map.size() - 1 - i))
                    return false;
            }
            //
            //            while (y != 0) {
            //                i++;
            //                y = y / 10;
            //            }
            //
            //            for (int j = 0; j <= i / 2; j++) {
            //                System.out.println((int)(x / Math.pow(10, i - 1 - j)) + ":" + (int)(x / Math.pow(10,
            //                j+1)));
            //                if ((int)(x / Math.pow(10, i - 1 - j)) != (int)(x / Math.pow(10, j+1)))
            //                    return false;
            //            }

            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}