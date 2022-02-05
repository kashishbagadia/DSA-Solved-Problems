# Same Tree
#### Given the roots of two binary trees ```p``` and ```q```, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

## Examples
![ex1](https://user-images.githubusercontent.com/66882470/126307660-58caa64f-c887-406f-8fa7-cf08b206ec0f.jpg)
```
Input: p = [1,2,3], q = [1,2,3]
Output: true
```
![ex2](https://user-images.githubusercontent.com/66882470/126307720-7f33d72b-7664-4f0b-b7ab-55d6f100cdb3.jpg)
```
Input: p = [1,2], q = [1,null,2]
Output: false
```
![ex3](https://user-images.githubusercontent.com/66882470/126307804-fa0fd183-0596-4562-9f31-e3cd24a9276f.jpg)
```
Input: p = [1,2,1], q = [1,1,2]
Output: false
```
## Contraints
* The number of nodes in both trees is in the range ```[0, 100]```.
* -10<sup>4</sup> <= Node.val <= 10<sup>4</sup>
