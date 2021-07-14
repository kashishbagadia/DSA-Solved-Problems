# Valid Parentheses
#### Given a string ```s``` containing just the characters ```'('```, ```')'```, ```'{'```, ```'}'```, ```'['``` and ```']'```, determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

## Examples
```
Input: s = "()"
Output: true
```
```
Input: s = "()[]{}"
Output: true
```
```
Input: s = "(]"
Output: false
```
```
Input: s = "([)]"
Output: false
```
```
Input: s = "{[]}"
Output: true
```
## Contraints
* 1 <= s.length <= 10<sup>4</sup>
* ```s``` consists of parentheses only ```'()[]{}'```.
