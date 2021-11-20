/**
 * 
 */
package algortihms.twoPointers;

import algortihms.twoPointers.RemoveNthNodeFromEndInLinkedList.ListNode;

/**
 * @author maury
 *
 */
public class MiddleOfLinkedList {
	public ListNode middleNode(ListNode head) {
		int length = 0;
		int counter = 0;
		ListNode tempNode = head;
		while (tempNode.next != null) {
			tempNode = tempNode.next;
			length++;
		}
		if (length % 2 == 0) {
			length = length / 2;
		} else {
			length = length / 2 + 1;
		}
		tempNode = head;
		while (counter < length) {
			tempNode = tempNode.next;
			counter++;
		}
		return tempNode;
	}
}
