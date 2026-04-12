/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        // Step 1: Find the middle of the linked list using two pointers
        // slow pointer moves one step at a time, fast pointer moves two steps
        ListNode slowPointer = head;
        ListNode fastPointer = head;
      
        while (fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
      
        // Step 2: Split the list into two halves
        // The second half starts from slowPointer.next
        ListNode secondHalfHead = slowPointer.next;
        slowPointer.next = null; // Disconnect the first half from the second half
      
        // Step 3: Reverse the second half of the list
        ListNode previousNode = null;
        ListNode currentNode = secondHalfHead;
      
        while (currentNode != null) {
            ListNode nextTemp = currentNode.next; // Store next node
            currentNode.next = previousNode;       // Reverse the pointer
            previousNode = currentNode;            // Move previous to current
            currentNode = nextTemp;                // Move to next node
        }
      
        // Step 4: Merge the two halves by alternating nodes
        // previousNode now points to the head of the reversed second half
        ListNode firstHalfCurrent = head;
        ListNode secondHalfCurrent = previousNode;
      
        while (secondHalfCurrent != null) {
            // Store next nodes before modifying pointers
            ListNode firstHalfNext = firstHalfCurrent.next;
            ListNode secondHalfNext = secondHalfCurrent.next;
          
            // Insert node from second half after current node in first half
            firstHalfCurrent.next = secondHalfCurrent;
            secondHalfCurrent.next = firstHalfNext;
          
            // Move pointers forward
            firstHalfCurrent = firstHalfNext;
            secondHalfCurrent = secondHalfNext;
        }
    }
}