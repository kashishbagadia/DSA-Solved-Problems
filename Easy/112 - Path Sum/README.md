# Minimum Depth of Binary Tree
#### Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

**Note**: A leaf is a node with no children.

## Examples
![ex_depth](https://user-images.githubusercontent.com/66882470/126671171-1bd7b132-56b9-4993-8e84-e7aa2697258e.jpg)
```
Input: root = [3,9,20,null,null,15,7]
Output: 2
```
```
Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
```
## Contraints
* The number of nodes in the tree is in the range [0, 10<sup>5</sup>].
* ```-1000 <= Node.val <= 1000```
=======
# Path Sum
#### Given the `root` of a binary tree and an integer `targetSum`, return true if the tree has a **root-to-leaf** path such that adding up all the values along the path equals `targetSum`.

A **leaf** is a node with no children.
## Examples
![pathsum1](https://user-images.githubusercontent.com/66882470/133070840-1d89de73-5a97-4b38-a3ca-f0445c559493.jpg)
```
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
```
![pathsum2](https://user-images.githubusercontent.com/66882470/133070904-302ef7aa-6943-42af-8101-603f9b688299.jpg)
```
Input: root = [1,2,3], targetSum = 5
Output: false
```
```
Input: root = [1,2], targetSum = 0
Output: false
````
## Contraints
* The number of nodes in the tree is in the range `[0, 5000]`.
* `-1000 <= Node.val <= 1000`
* `-1000 <= targetSum <= 1000`

