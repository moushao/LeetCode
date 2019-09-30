package main.java.leetcode.editor.cn;  //给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学


public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {

            int length = (x + "").length();
            if (x < 0)
                length--;
            long result = 0;
            int lessNum = x;

            for (int i = 0; i < length; i++) {
                int offNum = lessNum % 10;
                lessNum = lessNum / 10;
                result = result + (int) (offNum * Math.pow(10, length - i - 1));
            }
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
            return (int)result;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}