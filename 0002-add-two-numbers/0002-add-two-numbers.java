class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to start the result list
        ListNode current = dummy; // Pointer to construct the result list
        int carry = 0; // Variable to store carry-over for each addition

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with carry from the previous addition

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10; // Calculate new carry
            current.next = new ListNode(sum % 10); // Create a new node with the digit part
            current = current.next; // Move to the next node in the result list
        }

        return dummy.next; // Return the head of the result list
    }
}
