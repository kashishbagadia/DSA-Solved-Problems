class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = []
        first_line = [1]
        second_line = [1, 1]
        if numRows == 0:
            return ans
        ans.append(first_line)
        if numRows == 1:
            return ans
        ans.append(second_line)
        if numRows == 2:
            return ans
        for i in range(2, numRows):
            current_line = list(range(i + 1))
            current_line[0] = 1
            current_line[i] = 1
            for j in range(1, i):
                current_line[j] = ans[i-1][j-1] + ans[i-1][j]
            ans.append(current_line)
        return ans
            