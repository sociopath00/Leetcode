import java.util.Arrays;

public class MultiplyByTwo {
    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = (left+right) / 2;
            // System.out.println(mid);
            if (nums[mid] == original){
                original *= 2;
                left = mid + 1;
                right = nums.length - 1;
                // System.out.println(original);
            } else if(nums[mid]>original){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return original;
    }

    public static void main(String[] args) {
        int[] inp = {5,3,6,1,12};
        System.out.println(findFinalValue(inp, 3));
    }
}
