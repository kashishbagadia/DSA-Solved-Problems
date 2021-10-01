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

