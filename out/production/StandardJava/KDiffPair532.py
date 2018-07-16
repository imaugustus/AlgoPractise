def find_pairs(nums, k):
    c= collections.Counter(nums)
    res = 0
    for i in c:
        if i+k in c and k>0 or c[i]>1 and k==0:
            res++
         return resKDiffPair532.py