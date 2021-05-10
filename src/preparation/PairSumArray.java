package preparation;

import javafx.util.Pair;

public class PairSumArray {

    public static void main(String ... args) {
        int input[] = {1,2,3,5,9};
        int sum = 8;



        int i=0;
        int j = input.length-1;
        while(i<j) {
            if(input[i] + input[j] == sum) {
                System.out.println("Combination found : " + i + ":" + j);
                break;
            }
            else if(input[i] + input[j] > sum)
                j--;
            else
                i++;
        }

        Pair<Integer, Integer> pair = new Pair<>(i, j);
        System.out.println(pair.hashCode());
    }

}
