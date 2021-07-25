class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        ans = []
        first_row = [1]
        second_row = [1,1]
        ans.append(first_row)
        if rowIndex == 0:
            return first_row
        ans.append(second_row)
        if rowIndex == 1:
            return second_row
        for i in range(2, (rowIndex+1)):
            current_row = list(range(i+1))
            current_row[0] = 1
            current_row[i] = 1
            for j in range(1,i):
                current_row[j] = ans[i-1][j-1] + ans[i-1][j]
            ans.append(current_row)
            if i == rowIndex:
                return ans[i]