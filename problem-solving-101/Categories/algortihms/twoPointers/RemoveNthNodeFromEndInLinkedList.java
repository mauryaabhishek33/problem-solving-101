/**
 * 
 */
package algortihms.twoPointers;

/**
 * @author maury this one is optimized solution with less space
 */
public class RemoveNthNodeFromEndInLinkedList {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		if (head == null) {
			return null;
		}

		if (head.next == null && n == 1) {
			return null;
		}

		ListNode ptr1 = head;
		ListNode ptr2 = head;
		int count = 1;

		while (count <= n) {
			ptr1 = ptr1.next;
			count++;
		}

		if (ptr1 == null) {
			return head.next;
		}

		ListNode prev = null;
		while (ptr1 != null) {
			ptr1 = ptr1.next;
			prev = ptr2;
			ptr2 = ptr2.next;
		}

		prev.next = ptr2.next;

		return head;

	}

	public class ListNode {
		int val;
		public ListNode next;
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
}
