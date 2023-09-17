public class Leet19 {
    public static void main(String[] args) {
        Solution s = new Solution();
    }
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int m = 0;
            ListNode res = head;
            while(head!=null){
                head=head.next;
                m++;
            }
            int l = m-n,count=0;
            if(l==0)
                res=res.next;
            else{
                f(res,count,l);
            }
            return res;
        }

        private void f(ListNode temp,int n,int m){
            if(n<m-1)
                f(temp.next,n+1,m);
            else
                temp.next = temp.next.next;
        }
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
