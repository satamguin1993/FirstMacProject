package preparation;

import java.util.Arrays;

public class MaximumStationsRequired {

    public static void main(String[] args) {
        int arrival[] = {900, 940, 950, 1100, 1500, 1800};
        int departure[] = {910, 1200, 1120, 1130, 1900, 2000};

        //int arrival[] = {900, 940};
        //int departure[] = {910, 1200};

        int calculateMaximumStationsRequired = calculate(arrival, departure);
        System.out.println("Minimum Required: " + calculateMaximumStationsRequired);
    }

    private static int calculate(int[] arrival, int[] departure) {

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i = 1, j = 0;
        int totalCount = Integer.MIN_VALUE;
        int currentCount = 1;

        while(i<arrival.length && j < departure.length) {
            if (arrival[i] <= departure[j]) {
                currentCount++;
                totalCount = Math.max(totalCount, currentCount);
                i++;
            } else {
                currentCount--;
                j++;
            }
        }

        return totalCount;
    }


}
