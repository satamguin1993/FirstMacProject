package preparation;

import java.time.Instant;

public class ReverseWords {

    public static void main(String[] args) {
        String input = "i.love.to.play.football";
        String output = makeReverseString(input);
        String reverseWords = makeReverseWords(input);
        System.out.println("All output : " + output);
        System.out.println("Reverse words output : " + reverseWords);

        Instant i = Instant.now();
        System.out.println(i.toString());

    }

    private static String makeReverseWords(String input) {
        StringBuilder sb = new StringBuilder();
        String[] tokens = input.split("\\.");
        for (String s : tokens) {
            sb.append(makeReverseString(s))
                    .append(".");
        }
        return sb.toString();
    }

    private static String makeReverseString(String input) {
        char[] chars = input.toCharArray();
        int i=0,j=input.length()-1;
        while(i<j) {
            swap(chars, i , j);
            i++;
            j--;
        }
        return new String(chars);
    }

    private static void swap(char[] chars, int i, int j) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

}
