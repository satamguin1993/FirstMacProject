package preparation;

public class MaximumSubArray_Product {

    public static void main(String[] args) {
        int[] input = {-3, -40, -2, 0, -5, -1};
        int result = findMaxProduct(input);
        System.out.println("Result : " + result);
    }


    private static int findMaxProduct(int[] arr) {
        // max positive product
        // ending at the current
        // position
        int max_ending_here = 1;

        // min negative product
        // ending at the current
        // position
        int min_ending_here = 1;

        // Initialize overall max product
        int max_so_far = 0;
        int flag = 0;

        /* Traverse through the array. Following
        values are maintained after the ith iteration:
        max_ending_here is always 1 or some positive product
                        ending with arr[i]
        min_ending_here is always 1 or some negative product
                        ending with arr[i] */
        for (int j : arr) {
            /* If this element is positive, update
               max_ending_here. Update min_ending_here only
               if min_ending_here is negative */
            if (j > 0) {
                max_ending_here = max_ending_here * j;
                min_ending_here
                        = Math.min(min_ending_here * j, 1);
                flag = 1;
            }

            /* If this element is 0, then the maximum
            product cannot end here, make both
            max_ending_here and min_ending _here 1
            Assumption: Output is always greater than or
            equal to 1. */
            else if (j == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            }

            /* If element is negative. This is tricky
            max_ending_here can either be 1 or positive.
            min_ending_here can either be 1 or negative.
            next min_ending_here will always be prev.
            max_ending_here * arr[i]
            next max_ending_here will be 1 if prev
            min_ending_here is 1, otherwise
            next max_ending_here will be
                        prev min_ending_here * arr[i] */
            else {
                int temp = max_ending_here;
                max_ending_here
                        = Math.max(min_ending_here * j, 1);
                min_ending_here = temp * j;
            }

            // update max_so_far, if needed
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }

        if (flag == 0 && max_so_far == 0)
            return 0;
        return max_so_far;

    }


}
