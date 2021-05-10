package preparation;

import java.util.*;

public class NextGreaterNumber {

    public static void main(String ... args) {

        int num1 = 1321;
        int num = 982349865;

        int[] input = new int[10];

        //input = new int[]{9, 8, 2, 3, 4, 9, 8, 6, 5};
        input = new int[]{1, 3, 1, 2};

        int i;

        //get the first break point
        for(i=input.length-1; i>0; i--) {
            if(input[i] > input[i-1])
                break;
        }

        if(i==0)
            System.out.println("Not possible");

        else {
            //find out the minimum number greater than the ith index number
            int j = input.length - 1;
            int pivot = input[i-1];
            while(j>i) {
                if(input[j] > pivot)
                    break;
                j--;
            }

            //swap the 2 elements in the array
            swap(input, i-1, j);

            //sort the rest of the array to find out the next bigger number
            Arrays.sort(input, i, input.length);
        }

        for(i=0;i<input.length;i++)
            System.out.print(input[i] + " ");

    }

    private static void swap(int[] input, int start, int end) {
        int i = input[start];
        input[start] = input[end];
        input[end] = i;
    }

}
