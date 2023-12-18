class Solution {
    public static int maxProductDifference(int[] nums) {
        // Product Difference.
        return (arrMax(nums) * arrMax(nums)) - (arrMin(nums) * arrMin(nums));
    }

    public static int arrMax(int[] nums){
        int len = nums.length; // Length of array.
        int max = 0, element = 0; // Maximum value and index of it.
        // Max value is searched for every element of array. When found, its replaced with 0.
        for(int i = 0; i < len; i++){
            if(max < nums[i]){
                max = nums[i];
                element = i;
            }
        }
        nums[element] = 0;
        return max;
    }

    public static int arrMin(int[] nums){
        int len = nums.length; // Length of array.
        int min = 10000, element = 0; // Minimum value and index of it.
        // Min value is searched for every element of array. When found, its replaced with 0.
        for(int i = 0; i < len; i++){
            // Ignoring the elements we replaced with 0.
            if(nums[i] < 1){ continue; }
            if(min > nums[i]){
                min = nums[i];
                element = i;
            }
        }
        nums[element] = 0;
        return min;
    }
}
