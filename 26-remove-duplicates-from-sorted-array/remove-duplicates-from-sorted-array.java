class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i + 1;
        int k = 1;

        if (nums.length==0){
            return 0;
        }else if(nums.length==1){
            return 1;
        }else{
            while(j < nums.length){
                while(j < nums.length && nums[i] == nums[j]){
                    j++;
                }
                if(j < nums.length){
                    i++;
                    k = i + 1;
                    nums[i] = nums[j];
                    j++;
                }
            }
        }
        
    return k;
    }
}