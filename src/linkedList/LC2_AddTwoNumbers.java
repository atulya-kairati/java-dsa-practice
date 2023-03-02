package linkedList;


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LC2_AddTwoNumbers {
    public static ListNode solution(ListNode l1, ListNode l2) {
        int num1 = 0, num2 = 0;

        int c = 0;
        while(l1 != null){
            num1 = num1 +  l1.val * (int) Math.pow(10, c);
            l1 = l1.next;
            c++;
        }

        c = 0;
        while(l2 != null){
            num2 = num2 + l2.val * (int) Math.pow(10, c);
            l2 = l2.next;
            c++;
        }

        System.out.println(num1 + ", " + num2);
        int num3 = num1 + num2;

        ListNode l3 = new ListNode();
        ListNode ptr = l3;

        while(num3 != 0) {
            ptr.val = num3 % 10;
            num3 /= 10;
            if(num3 == 0) break;
            ptr.next = new ListNode();
            ptr = ptr.next;
        }


        return l3;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(
                2,
                new ListNode(
                        4,
                        new ListNode(9)
                )
        );

        ListNode l2 = new ListNode(
                5,
                new ListNode(
                        6,
                        new ListNode(4, new ListNode(9))
                )
        );

        System.out.println(solution(l1, l2).val);
    }
}
