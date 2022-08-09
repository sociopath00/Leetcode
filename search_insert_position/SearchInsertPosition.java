package Leetcode.search_insert_position;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; 
        while(left<=right){
            int val = (right+left)/2;
            
            // if (left == right && nums[val]<target){
            //     return ++val;
            // } else if(left == right && nums[val]>target){
            //     return val;
            // } else if(left > right){
            //     return ++val;
            // }
                
            if(nums[val]==target){
                return val;
            } else if(nums[val] > target){
                right = val - 1;
            } else if(nums[val] < target){
                left = val + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] inp = {1, 3};
        System.out.println(searchInsert(inp, 2));

    }
}
