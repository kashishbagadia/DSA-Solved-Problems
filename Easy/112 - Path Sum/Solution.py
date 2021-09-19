<<<<<<< HEAD
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: TreeNode) -> int:    
        
        def helper(node):
            
            if not node:
                return 0
            
            l_height = helper(node.left)
            r_height = helper(node.right)
            
            if (l_height == 0):
                return r_height + 1
            elif (r_height == 0):
                return l_height + 1
            else:
                return (min(l_height, r_height) + 1)
            
        return helper(root)
=======
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: TreeNode, targetSum: int) -> bool:
        if not root:
            return False
        targetSum -= root.val
        
        if not root.left and not root.right:
            return targetSum == 0
        else:
            return self.hasPathSum(root.left, targetSum) or self.hasPathSum(root.right, targetSum)
>>>>>>> 2b13e3bb23edfc25fa373aa09019e309ab6a6b3c
