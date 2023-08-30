public class Leet11 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int i = s.maxArea(arr);
        System.out.println("i = " + i);
    }
    static class Solution {
        public int maxArea(int[] height) {
            int res = 0,start=0,end=height.length-1,temp;
            while(start<end){
                temp = Math.min(height[start],height[end])*(end-start);
                res = Math.max(res,temp);
                if(height[start]<=height[end])
                    ++start;
                else
                    --end;

            }
            return res;
        }
    }
}
