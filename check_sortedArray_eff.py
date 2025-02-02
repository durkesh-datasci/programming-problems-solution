def check(self, nums: list[int]) -> bool:
    n=len(nums)
    dp=0
    for i in range(n):
        if(nums[i]>nums[(i+1)%n]):
            dp+=1
        if(dp>1):
            return False
    return True