import java.util.HashMap;

public class two_sum{

    // Brute Force Approach
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];

        outerloop:
        for (int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if (i==j){
                    continue;
                }

                int sum = nums[i] + nums[j];
                
                if(sum==target){
                    // System.out.println("Inside the loop");
                    // System.out.println(i);
                    // System.out.println(j);
                    arr[0] = i;
                    arr[1] = j;
                    break outerloop;
                }
            }
        }
        
        return arr;
    }

    // Hashmap
    public static int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< nums.length; i++){
            int compliment = target - nums[i];
            System.out.println(map.containsKey(compliment)); 
            if (map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};
            }
            map.put(nums[i], i);

        }
        return null;
    }

    public static void main(String[] args) {
        // Solution s = new Solution();
        int result[] = new int[2];

        int inp1[] = {2,7,11,15};
        result = twoSum2(inp1, 9);

        for (int i: result){
            System.out.println(i);
        }
        
    }
}


