# Search a 2D Matrix

#### Write an efficient algorithm that searches for a value in an `m x n` matrix. This matrix has the following properties:

* Integers in each row are sorted from left to right.
* The first integer of each row is greater than the last integer of the previous row.
 

## Examples
![mat](https://user-images.githubusercontent.com/66882470/136430421-a60e0baf-b4d4-47a3-b40d-e02cb12e8d25.jpg)
```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
```
![mat2](https://user-images.githubusercontent.com/66882470/136430496-74514dc1-caf1-4d5c-b0ca-8047c814bb89.jpg)

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
```

## Contraints
* m == matrix.length
* n == matrix[i].length
* 1 <= m, n <= 100
* -10<sup>4</sup> <= matrix[i][j], target <= 10<sup>4</sup>
