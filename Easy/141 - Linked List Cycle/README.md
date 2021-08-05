# Linked List Cycle

#### Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. **Note that** `pos` **is not passed as a parameter.**

Return `true` *if there is a cycle in the linked list*. Otherwise, return `false`.

## Examples
![circularlinkedlist](https://user-images.githubusercontent.com/66882470/127962091-999f6eb8-6214-48c2-937b-a9110d10e743.png)
```
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
```

![circularlinkedlist_test2](https://user-images.githubusercontent.com/66882470/127962143-b1e6cd13-8c8a-473d-a0ec-9d8dcccf59c4.png)
```
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
```
![circularlinkedlist_test3](https://user-images.githubusercontent.com/66882470/127962183-cb4d85b2-6200-4d9b-b13d-798bb0e6c720.png)
````
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
````
## Contraints
* The number of the nodes in the list is in the range [0, 10<sup>4</sup>].
* -10<sup>5</sup> <= Node.val <= 10<sup>5</sup>
* pos is -1 or a **valid index** in the linked-list.
