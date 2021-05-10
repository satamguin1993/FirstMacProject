package preparation;

public class ChessBoardSteps {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        String result = ifPossibleToReachCertainStep(x, y);

        System.out.println(result);
    }

    //Very important problem
    //5,7
    public static String ifPossibleToReachCertainStep(int x, int y) {
        if (sol(1, 1, x, y))
            return "yes";
        return "No";
    }

    static boolean sol(int a, int b, int x, int y){
        if( a == x && b == y)
            return true;
        else if(a > x || b > y)
            return false;
        else{
            if(sol(a+b, a, x, y)) return true;
            if(sol(a, a+b, x, y)) return true;
        }
        return false;
    }

}
