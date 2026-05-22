class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int countZero = 0;
        for(int num : nums){
            if(num == 0) countZero++;
            else prod = prod * num;
        }
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(countZero>1)
                res[i] = 0;
            else if(countZero==1){
                if(nums[i]!=0){
                    res[i] = 0;
                }else{
                    res[i] = prod;
                }}else{
            res[i] = prod / nums[i];
            }
        }
        return res;
    }
}  
