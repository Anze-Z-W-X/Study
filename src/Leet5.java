public class Leet5 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String res = s.longestPalindrome("asjhjfgssaassafghsdhw");
        System.out.println("res = " + res);
    }

    static class Solution {

        // 这题如果要做的话，建议留下原来的代码，注释掉，然后重新写

        public String longestPalindrome(String s) {
            // 转移方程
            // p[i][j]为true则表示s[i]~s[j]都为回文

            // 首先是字符串过小的边界情况
            int len = s.length();
            if(len < 2) {
                return s;
            }

            int maxLen = 1; // 至少为1
            int begin = 0; // 回文串开始下标
            boolean[][] dp = new boolean[len][len];

            // 概念性：对角线上的都是回文
            // 实际上：长度为1的都算是回文，即字母本身，而没有任何组合
            for (int i = 0; i < len; i++) {
                dp[i][i] = true;
            }

            // 先枚举字串长度，L就表示长度，从2开始
            char[] charArray = s.toCharArray();
            for (int j = 1; j < len; j++) { // L表示的是长度而不是下表，长度的区间就是[2, len]
                // 从最左边j开始按长度匹配？
                for (int i = 0; i < j; i++) {
                    if(charArray[i]!=charArray[j])
                        dp[i][j]=false;
                    else{
                        if(j-i<3)
                            dp[i][j]=true;
                        else{
                            dp[i][j]=dp[i+1][j-1];
                        }
                    }

                    // 如果是回文+当前回文长度大于先前的回文长度，则记录下来
                    if(dp[i][j] && j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        begin = i;
                    }
                }
            }
            // 字符串截断返回
            return s.substring(begin, begin + maxLen);
        }
    }
}
