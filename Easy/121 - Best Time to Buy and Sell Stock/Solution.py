class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        minsoFar = prices[0]
        for i in range(0, len(prices)):
            minsoFar = min(minsoFar, prices[i])
            profit = prices[i] - minsoFar
            maxProfit = max(maxProfit, profit)
        return maxProfit
