class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm={} #hm=HashMap
        for i,n in enumerate(nums):
            dif=target-n
            if dif in hm:
                return [hm[dif],i]
            hm[n]=i
        return
