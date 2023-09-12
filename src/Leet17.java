import java.util.ArrayList;
import java.util.List;

public class Leet17 {
    public static void main(String[] args) {

    }

    static class Solution {
        private String[] map = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        private StringBuilder sb = new StringBuilder();
        private List<String> res = new ArrayList<>();

        public List<String> letterCombinations(String digits) {
            if(digits == null || digits.length() == 0) return res;
            backtrack(digits,0);
            return res;
        }

        private void backtrack(String digits,int index){
            if(sb.length() == digits.length()) {
                res.add(sb.toString());
                return;
            }
            String val = map[digits.charAt(index)-'2'];
            for(char ch:val.toCharArray()) {
                sb.append(ch);
                backtrack(digits,index+1);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
