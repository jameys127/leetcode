package AddTwoNumbers;

import MergeTwoSortedLists.ListNode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        // String l1num = "";
        // String l2num = "";
        // while(l1 != null){
        //     int dummy = l1.val;
        //     l1num = l1num  + dummy;
        //     l1 = l1.next;
        // }
        // while(l2 != null){
        //     int dummy = l2.val;
        //     l2num = l2num + dummy;
        //     l2 = l2.next;
        // }
        // StringBuilder l1string = new StringBuilder();
        // l1string.append(l1num);
        // StringBuilder l2string = new StringBuilder();
        // l2string.append(l2num);
        // l1string.reverse();
        // l2string.reverse();
        // int backToNuml1 = Integer.parseInt(l1string.toString());
        // int backToNuml2 = Integer.parseInt(l2string.toString());
        // System.out.println(backToNuml1);
        // System.out.println(backToNuml2);
        // int answerNum = backToNuml1 + backToNuml2;
        // System.out.println(answerNum);
        // ListNode head = new ListNode();
        // ListNode dummy = head;
        // while(answerNum > 0){
        //     int remainder = answerNum % 10;
        //     ListNode x = new ListNode(remainder);
        //     dummy.next = x;
        //     dummy = dummy.next;
        //     answerNum = answerNum / 10;
        // }
        // return head.next;


        ListNode head = new ListNode();
        ListNode dummy = head;
        boolean carryOver = false;
        while(l1 != null && l2 != null){
            int num = l1.val + l2.val;
            if(carryOver){
                num += 1;
                carryOver = false;
            }
            if(num >= 10){
                int remainder = num % 10;
                dummy.next = new ListNode(remainder);
                carryOver = true;
                dummy = dummy.next;
                l1 = l1.next;
                l2 = l2.next;
                continue;
            }
            dummy.next = new ListNode(num);
            dummy = dummy.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int num = l1.val;
            if(carryOver){
                num += 1;
                carryOver = false;
            }
            if(num >= 10){
                int remainder = num % 10;
                dummy.next = new ListNode(remainder);
                carryOver = true;
                dummy = dummy.next;
                l1 = l1.next;
                continue;
            }
            dummy.next = new ListNode(num);
            dummy = dummy.next;
            l1 = l1.next;
        }
        while(l2 != null){
            int num = l2.val;
            if(carryOver){
                num += 1;
                carryOver = false;
            }
            if(num >= 10){
                int remainder = num % 10;
                dummy.next = new ListNode(remainder);
                carryOver = true;
                dummy = dummy.next;
                l2 = l2.next;
                continue;
            }
            dummy.next = new ListNode(num);
            dummy = dummy.next;
            l2 = l2.next;
        }
        if(carryOver){
            dummy.next = new ListNode(1);
        }
        return head.next;
    }

    public static void main(String[] args) {
        System.out.println("\n");
        ListNode s1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))));
        ListNode s2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode f1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode f2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9,
                        new ListNode(9, new ListNode(9, new ListNode(9))))));
        String answer = addTwoNumbers(s1, s2).toString();
        System.out.println(answer);
    }
    
}
