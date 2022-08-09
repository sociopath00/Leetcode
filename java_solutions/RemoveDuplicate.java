public class RemoveDuplicate {
    
    public static int removeDuplicates(int[] nums){
        int count=0;

        for(int j=1; j<nums.length; j++){
            if(nums[count]!=nums[j]){
                count++;
                nums[count] = nums[j];
            }   
        }
        return count+1;
    }

    public static void main(String[] args) {
        int inp1[] = {1,2,4,4,7};
        int result;

        result = removeDuplicates(inp1);
        System.out.println(result);
    }
}
