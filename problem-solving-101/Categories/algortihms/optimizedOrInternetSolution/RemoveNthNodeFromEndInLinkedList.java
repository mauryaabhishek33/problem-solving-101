/**
 * 
 */
package algortihms.optimizedOrInternetSolution;

/**
 * @author maury My solution, was more focused on one pass ( one loop) approach
 *         and hence took 3 attempts to solve it however idea was that whether
 *         node removed is present in end or start or somewhere in between, two
 *         pointers technique works like a charm ( a good one though) just
 *         remember when to start the slow pointer an optimized approach with
 *         less variables is present in optimized solutions
 */
public class RemoveNthNodeFromEndInLinkedList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null && n == 1) {
			head = null;
			return head;
		}
		ListNode prev = null;
		int counter = 1;
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		while (fastPointer.next != null) {
			if (counter >= n) {
				prev = slowPointer;
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			} else {
				fastPointer = fastPointer.next;
			}
			counter++;
		}
		if (counter == n) {
			head = slowPointer.next;
		} else if (n == 1) {
			prev.next = null;
		} else {
			prev.next = slowPointer.next;
		}
		return head;

	}

	private class ListNode {
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
}
