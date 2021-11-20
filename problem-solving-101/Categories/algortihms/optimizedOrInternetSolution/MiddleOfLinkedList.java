/**
 * 
 */
package algortihms.optimizedOrInternetSolution;

import algortihms.twoPointers.RemoveNthNodeFromEndInLinkedList.ListNode;

/**
 * @author maury
 *
 */
public class MiddleOfLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		while (fastPointer.next != null) {
			slowPointer = slowPointer.next;
			if (fastPointer.next.next == null) {
				fastPointer = fastPointer.next;
			} else {
				fastPointer = fastPointer.next.next;
			}
		}
		return slowPointer;
	}
}
