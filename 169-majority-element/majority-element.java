class Solution {
    public int majorityElement(int[] nums) {
        int el = 0;
        int fre = 0;
        for(int i = 0; i < nums.length;i++){
            if(fre == 0){
               el = nums[i]; 
            }
            if(nums[i] == el){
                fre++;
            }else{
                fre--;
            }

        }
        return el;
        }
}
