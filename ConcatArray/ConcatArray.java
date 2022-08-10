public class ConcatArray {
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[2*nums.length];
        for(int i=0; i<result.length; i++){
            result[i] = nums[i%nums.length];
        }

        return result;
    }

    public static int[] getConcatenation2(int[] nums) {
        int[] result = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            result[i+nums.length] = result[i] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] inp = {1, 2, 1};
        int[] result = getConcatenation2(inp);

        for(int i: result){
            System.out.println(i);
        }
    }
}
