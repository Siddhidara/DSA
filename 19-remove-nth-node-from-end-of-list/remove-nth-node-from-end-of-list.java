/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)return null;
        ListNode curr=head;
        // if(n==1)
        // {
        //     while(curr.next.next!=null)
        //     {
        //         curr=curr.next;
        //     }
        //     curr.next=null;
        //     return head;
        // }

        ListNode newcurr=head;
        int i=1;
        while(curr.next!=null)
        {
            curr=curr.next;
            i++;
        } 
        int ans=i-n;
        if(ans==0)
        {
            return head.next;
        }
        for(int j=0;j<ans-1;j++)
        {
            newcurr=newcurr.next;
        }
        newcurr.next=newcurr.next.next;
        return head;
    }
}