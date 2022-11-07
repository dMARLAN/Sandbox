package easy.mergetwosortedlists;

public class Solution {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1, new ListNode(5, new ListNode(7)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoLists(l1, l2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null){
            curr.next = l1;
        } else if (l2 != null) {
            curr.next = l2;
        }

        return head.next;
    }
}
