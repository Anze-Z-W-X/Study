public class Leet3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int i = s.lengthOfLongestSubstring("abcabcbb");
        System.out.println("i = " + i);
    }
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int[] arr = new int[128];
            int res=0;
            int start=0;
            int index;
            int n=s.length();
            for(int i=0;i<n;i++){
                index=s.charAt(i);
                start = Math.max(start,arr[index]);
                res=Math.max(res,i-start+1);
                arr[index]=i+1;
            }
            return res;
        }
    }
}
