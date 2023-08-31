import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet15 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-1,0,1,-2,2,0};
        List<List<Integer>> lists = s.threeSum(nums);
        System.out.println("lists = " + lists);
    }
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            Arrays.sort(nums);
            for(int i=0;i<n-2;i++){
                int count2=0;
                if(i>0&&nums[i]==nums[i-1]){
                    continue;
                }
                int k = n-1;
                for(int j=i+1;j<n;j++){
                    if(j>i+1&&nums[j]==nums[j-1])
                        continue;
                    while(j<k&&nums[i]+nums[j]+nums[k]>0){
                        --k;
                    }
                    if(j==k)
                        break;
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        res.add(temp);
                    }
                }
            }
            return res;
        }
    }
}
