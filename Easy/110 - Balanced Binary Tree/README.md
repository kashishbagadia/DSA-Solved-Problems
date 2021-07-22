# Convert Sorted Array to Binary Search Tree
#### Given an integer array ```nums``` where the elements are sorted in **ascending order**, convert it to a ***height-balanced** binary search tree.*

A **height-balanced** binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

## Examples
![btree1](https://user-images.githubusercontent.com/66882470/126492746-4bf9074e-080e-4246-a532-c091b59ef724.jpg)
```
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:
```
![btree2](https://user-images.githubusercontent.com/66882470/126492595-f08382aa-c996-48fa-9dc2-85e7e1a6b469.jpg)

![btree](https://user-images.githubusercontent.com/66882470/126492643-1be9abd9-dd34-4e3c-8ace-a22c760f5f61.jpg)
```
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,3] and [3,1] are both a height-balanced BSTs.
```
## Contraints
* 1 <= nums.length <= 10<sup>4</sup>
* -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>
* nums is sorted in a **strictly increasing** order.
