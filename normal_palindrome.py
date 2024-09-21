class Solution:
    def isPalindrome(self, x: int) -> bool:
        l=len(str(x))
        temp=x
        rd=0
        while(l>0):
            dig=x%10
            rd=rd*10+dig
            x//=10
            l-=1
        return temp==rd
#normal method to solve palindrome; rd-reversed digit