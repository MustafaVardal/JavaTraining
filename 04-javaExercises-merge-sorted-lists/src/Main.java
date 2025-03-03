import trainingQuestion.ListNode;

public class Main {
    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode merged= mergeTwoLists(list1,list2);

        printList(merged);

    }

    private static void printList(ListNode merged) {
        while (merged != null){
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
        System.out.println();
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(list1 != null && list2 !=null){
            if (list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 !=null){
            current.next = list1;
        }
        if (list2 != null){
            current.next = list2;
        }

        return dummy.next;

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

