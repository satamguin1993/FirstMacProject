package preparation;

public class FibonacciSeries {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int i = 0;
        while (i < 10) {
            System.out.println(a);
            int c = b;
            b = a+b;
            a = c;
            i++;
        }

    }

}
