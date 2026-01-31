package week_5;

public class MergetwoSortedList_21 {

	static class ListNode {
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

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode d = new ListNode(-1);
		ListNode current = d;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}

		if (list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}

		return d.next;
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

		ListNode mergedList = mergeTwoLists(list1, list2);

		ListNode current = mergedList;
		while (current != null) {
			System.out.print(current.val + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}
