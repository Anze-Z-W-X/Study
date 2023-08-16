import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        Solution solution = new Solution();
        int[] res = solution.twoSum(nums,9);
        System.out.println("res = " + Arrays.toString(res));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i]))
                return new int[] {m.get(target-nums[i]),i};
            m.put(nums[i],i);
        }
        return null;
    }
}
