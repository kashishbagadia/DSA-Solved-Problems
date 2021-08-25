class Solution:
    def isValid(self, s: str) -> bool:
        symbol = []
        for char in s:
            if char in ['(', '{', '[']:
                symbol.append(char)
            elif char == ')' and len(symbol)!=0 and symbol[-1]=='(':
                symbol.pop()
            elif char == '}' and len(symbol)!=0 and symbol[-1]=='{':
                symbol.pop()
            elif char == ']' and len(symbol)!=0 and symbol[-1]=='[':
                symbol.pop()
            else:
                return False
        return symbol == []
                
        
