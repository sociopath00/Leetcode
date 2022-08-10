public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] inp = {5,3,6,1,12};
        int[] result = runningSum(inp);

        for(int i:result)
            System.out.println(i);
    }
}
