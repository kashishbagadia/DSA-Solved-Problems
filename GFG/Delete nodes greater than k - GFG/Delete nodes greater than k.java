class Solution
   {
         public Node deleteNode(Node root,int k)
         {
            if(root==null) return null;
            root.left = deleteNode(root.left, k);
            if(root.data >= k) return root.left;
            root.right = deleteNode(root.right, k);
            return root;
         }
   }