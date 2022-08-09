public class MostWater {

    public static int maxArea(int[] height) {
        int max=0;

        for (int i=0; i<height.length; i++){
            for (int j=0; j<height.length; j++){
                if(i==j)
                    continue;

                int temp = (Math.min(height[i], height[j])) * (Math.abs(i-j));
                
                if(temp > max)
                    max = temp;
            }
        }

        return max;
    }

    public static int maxArea2(int[] height) {
        int max_area = 0;
        
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            max_area = Math.max(max_area, Math.min(height[left], height[right])*(right-left));

            if(height[left]<height[right]){
                left++;
            } else{
                right--;
            }     
        }

        return max_area;

    }

    public static void main(String[] args) {
        int inp1[] = {1,8,6,2,5,4,8,3,7};
        int result;

        result = maxArea2(inp1);
        System.out.println(result);
    }
    
}
