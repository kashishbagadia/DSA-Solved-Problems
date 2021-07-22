# Balanced Binary Tree
#### Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

## Examples
![balance_1](https://user-images.githubusercontent.com/66882470/126668617-831af813-3477-4062-9379-e7af713da44a.jpg)
```
Input: root = [3,9,20,null,null,15,7]
Output: true
```
![balance_2](https://user-images.githubusercontent.com/66882470/126668668-7dd86e1b-4e26-4be1-9fd7-249aeb230b52.jpg)
```
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
```
```
Input: root = []
Output: true
```
## Contraints
* The number of nodes in the tree is in the range ```[0, 5000]```.
* -10<sup>4</sup> <= Node.val <= 10<sup>4</sup>
