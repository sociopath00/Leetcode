package Leetcode.Array_Perm;

public class ArrayPerm {
    public static int[] buildArray(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++){
            nums[i] = (nums[i] + (nums[nums[i]] % len)*len);
        }

        for(int i=0; i<len; i++){
            nums[i] = nums[i] / len;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] inp1 = {0,2,1,5,3,4};
        int[] result;

        result = buildArray(inp1);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
