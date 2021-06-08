# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        solution = ListNode(0)
        head = solution
        while l1!=None and l2!=None:
            if l1.val < l2.val:
                solution.next = l1
                l1 = l1.next
            else:
                solution.next = l2
                l2 = l2.next
            solution = solution.next
        
        if l1 == None:
            solution.next = l2
        else:
            solution.next = l1
        return head.next
            
        
