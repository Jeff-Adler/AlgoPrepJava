/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
public class MiddleNodeofLinkedList {
    public ListNode middleNode(ListNode head) {
        int listLength = 0;
        ListNode temp = head;
        while (temp != null) {
            listLength++;
            temp = temp.next;
        }
        int middleIndex = listLength / 2;
        ListNode middle = head;
        while (middleIndex > 0) {
            middle = middle.next;
            middleIndex--;
        }
        return middle;
    }
}
