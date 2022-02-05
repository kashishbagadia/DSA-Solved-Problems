class Solution:
    def reverse(self, x: int) -> int:
        reverse = 0
        if x > 0:
            while x!= 0:
                remainder = x % 10;                
                if reverse > (2147483647/10):
                    return 0
                reverse = (reverse * 10) + remainder
                x = int(x//10)
            return reverse
        
        elif x < 0:
            x = x * (-1)
            while x!=0:
                remainder = x % 10;                
                if reverse > (2147483647/10):
                    return 0
                reverse = (reverse * 10) + remainder
                x = int(x//10)
            reverse = reverse * (-1)
            return reverse
       
        else:
            return 0