package preparation;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int input[] = {3, 4, 5, 6, 1, 2};
        int key = 1;

        int l = input.length;
        System.out.println(doPivotedBinarySearch(key, input, l));

    }

    private static int doPivotedBinarySearch(int key, int[] input, int n) {

        int pivot = findPivot(input, 0, n-1);

        //simple binary search since no pivot is not found
        if (pivot==-1)
            return doBinarySearch(input, 0, n-1, key);

        //when pivot is the key
        if (input[pivot] == key)
            return pivot;

        //key lies in the left sub array
        if (input[0] <= key)
            return doBinarySearch(input, 0, pivot-1, key);

        //key lies in the right sub array
        return doBinarySearch(input, pivot+1, n-1, key);

    }

    //simple binary search to find the key
    private static int doBinarySearch(int[] input, int start, int end, int key) {
        if(start>end)
            return -1;

        int mid = (start + end)/2;
        if(input[mid]==key)
            return mid;
        else if(input[mid] > key)
            return doBinarySearch(input, 0, mid-1, key);
        return doBinarySearch(input, mid+1, end, key);
    }

    private static int findPivot(int[] input, int start, int end) {

        //base case
        if (start > end)
            return -1;
        if (start == end)
            return start;


        int mid = (start+end)/2;
        if(mid < end && input[mid] < input[mid+1])
            return mid;
        if(mid > start && input[mid] < input[mid-1])
            return mid-1;

        if(input[start] >= input[mid])
            return findPivot(input, 0, mid-1);
        else
            return findPivot(input, mid+1, end);

    }

}
