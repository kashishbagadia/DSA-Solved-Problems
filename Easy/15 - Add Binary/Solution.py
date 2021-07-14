class Solution:
    def addBinary(self, a: str, b: str) -> str:
        result = ""
        carry = 0
        countOfa = len(a)-1
        countOfb = len(b)-1
        while countOfa >= 0 or countOfb >= 0:
            totalSum = carry
            if countOfa >= 0:
                totalSum += int(a[countOfa])
                countOfa -= 1
            if countOfb >= 0:
                totalSum += int(b[countOfb])
                countOfb -= 1
            result = str(totalSum%2) + result
            carry = totalSum // 2
            
        if carry > 0:
            return str(1) + result
        return result
