class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 or (x % 10 == 0 and x != 0):
            return False
        rh = 0
        while x > rh:
            rh = rh * 10 + x % 10
            x //= 10
        return x == rh or x == rh // 10
#to check by half digits method; rh-reversed half digit