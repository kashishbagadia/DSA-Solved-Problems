# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        if head is None or head.next is None:
            return head
        copy = head
        while copy.next:
            if copy.val == copy.next.val:
                copy.next = copy.next.next
            else:
                copy = copy.next
        return head