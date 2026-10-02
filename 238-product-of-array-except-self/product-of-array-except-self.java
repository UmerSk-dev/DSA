class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = product;
            product = product * nums[i];
        }

            product = 1;
        for(int j = nums.length - 1 ; j >=0 ; j--){
            ans[j] *= product ;
            product = product * nums[j];
        }
        return ans;
    }
}