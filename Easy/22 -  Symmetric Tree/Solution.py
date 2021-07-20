# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
         # if tree is empty
        if (root == None) :
            return True

        if(not root.left and not root.right):
            return True

        q = []    

        q.append(root)
        q.append(root)

        leftNode = 0
        rightNode = 0

        while(not len(q)):
            leftNode = q[0]
            q.pop(0)

            rightNode = q[0]
            q.pop(0)
            if(leftNode.key != rightNode.key):
                return False
            
            if(leftNode.left and rightNode.right) :
                q.append(leftNode.left)
                q.append(rightNode.right)

            elif (leftNode.left or rightNode.right) :
                return False
            
            if(leftNode.right and rightNode.left):
                q.append(leftNode.right)
                q.append(rightNode.left)
                
            elif(leftNode.right or rightNode.left):
                return False

        return True
