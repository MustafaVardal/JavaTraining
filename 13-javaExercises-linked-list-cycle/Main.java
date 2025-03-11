import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);

        System.out.println("Is this cycle LinkedList? " + hasCycle(head1));

    }

    public static boolean hasCycle(ListNode head){

        HashSet<ListNode> visited_nodes = new HashSet<>();
        ListNode currNode = head;

        while (currNode != null){
            if (visited_nodes.contains(currNode)){
                return true;
            }
            visited_nodes.add(currNode);
            currNode = currNode.next;
        }
        return false;
    }
}
