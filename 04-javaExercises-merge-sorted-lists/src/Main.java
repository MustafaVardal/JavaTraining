import trainingQuestion.ListNode;

public class Main {
    public static void main(String[] args) {


        int val = 1;
        int val2 = 23456789;
        ListNode list1 = new ListNode(val);
        ListNode list2 = new ListNode(val2);

        ListNode mergedList = mergeTwoLists(list1, list2);

        System.out.println(mergedList.val);

    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        /*
        if (list1 != null & list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null) {
            return list2;
        }
        return list1;
*/
    }

}

