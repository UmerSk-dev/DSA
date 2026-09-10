class Solution {
    public static int[] twoSum(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4};
        int target = 6;

        int[] result = twoSum(arr , target);

            System.out.print("[");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            if(i != result.length-1){
                System.out.print(",");
            }
        }
            System.out.print("]");

    }
}