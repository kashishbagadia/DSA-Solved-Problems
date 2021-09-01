# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = None
        carry = 0
        temp = None
        
        
        while l1 is not None or l2 is not None:
            # At the start of every iteration we have to add carry if there is any
            total_sum = carry
            
            if l1 is not None:
                total_sum += l1.val
                l1 = l1.next
            if l2 is not None:
                total_sum += l2.val
                l2 = l2.next
                
            node = ListNode(total_sum % 10)
            carry = total_sum // 10
            
            # Just for the first node
            if temp is None:
                temp = head = node
            # for rest of the node
            else:
                temp.next = node
                temp = temp.next
            
            if carry > 0:
                temp.next = ListNode(carry)
            
        return head
            
