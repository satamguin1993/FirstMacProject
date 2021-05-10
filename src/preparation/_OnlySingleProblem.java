package preparation;

import java.util.*;

public class _OnlySingleProblem {

    public static void main(String[] args) {

        Integer[] cc = {0, 0, 1, 0, 0, 1, 0};

        List<Integer> c = new ArrayList<>();

        Collections.addAll(c, cc);
        int result = jumpingOnClouds(c);
        System.out.println("result : " + result);

    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here

        int n = c.size();
        int start = -1;
        int count = 0;
        if(c.get(0) == 0)
            start = 0;
        else if(c.get(1) == 0)
            start = 1;
        int i = start;
        while(i<n) {

            if( i<n-2 && c.get(i+2) == 0) {
                i += 2;
                count++;
            } else if (i<n-1 && c.get(i+1) == 0) {
                i += 1;
                count++;
            }
            if(i==n-1)
                break;
        }
        return count;

    }

}
