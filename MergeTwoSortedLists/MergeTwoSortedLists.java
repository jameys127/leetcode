package MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        ListNode preHead = new ListNode(0);
        ListNode last = preHead;
    
        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                last.next = l2;
                l2 = l2.next;
            } else {
                last.next = l1;
                l1 = l1.next;
            }
            last = last.next;
        }
    
        if(l1 == null) {
            last.next = l2;
        } else {
            last.next = l1;
        }
    
        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(5);
        l1.next = l2;
        l3.next = l4;
        l2.next = l5;
        l4.next = l6;
        System.out.println(l1.toString());
        System.out.println(l3.toString());
        System.out.println(mergeTwoLists(l1, l3).toString());
    }
}

//I hate this problem