public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i=0;

        for(int j=0; j<nums.length; j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++; 
            }
        }
        // for(int j: nums)
        //     System.out.println(j);
        return i;
    }
    public static void main(String[] args) {
        int inp1[] = {3, 2, 2, 3};
        int result;

        result = removeElement(inp1, 3);
        System.out.println(result);
    }
    
}
