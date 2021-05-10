package preparation;

public class Dynamic_Factorial {

    public static void main(String[] args) {
        int N = 5;
        int result[] = new int[N+1];
        result[1] = 1;
        int i = 2;
        while (i <= N){
            result[i] = i * result[i-1];
            i++;
        }
        System.out.println(result[N]);
    }

}
