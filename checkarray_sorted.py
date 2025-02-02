def check(self, nums: list[int]) -> bool:
    if(all(nums[i] <= nums[i+1] for i in range(len(nums) - 1))):
        return True
    rp=0
    for i in range(len(nums)-1):
        if(nums[i]>nums[i+1]):
            rp=i+1
    x=(len(nums))-rp
    b=[0]*(len(nums))
    for i in range(len(nums)):
        b[(i+x)%(len(nums))]=nums[i]
    if(all(b[i] <= b[i+1] for i in range(len(b) - 1))):
        return True
    else:
        return False