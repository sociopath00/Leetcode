import java.util.Arrays;

public class median_array{

    // Brute Force
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int arr[] = new int[n+m];
        double result;

        for (int i=0; i<n; i++){
            arr[i] = nums1[i];
        }

        for (int i=0; i<m; i++){
            arr[n+i] = nums2[i];
        }

        Arrays.sort(arr);

        if ((n+m)%2==0){
            int median_idx = (n+m)/2;

            result = (arr[median_idx] + arr[median_idx -1]) / 2.0;
        } else {
            int median_idx = (n+m) / 2;

            result = arr[median_idx];
        }

        return result;

    }

    public static void main(String[] args) {
        double result;

        int inp1[] = {1, 3};
        int inp2[] = {2, 4};
        result = findMedianSortedArrays(inp1, inp2);
        System.out.println(result);
    }
}


