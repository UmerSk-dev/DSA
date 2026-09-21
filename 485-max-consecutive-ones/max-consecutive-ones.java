class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = -1;
        int count = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != 1){
                count = 0;
            }else{
                count++;
            }
            max = Math.max(max , count);
        }
        return max;
    }
}