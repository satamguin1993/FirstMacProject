package preparation;

public class Dynamic_IslandProblem {

    public static void main(String[] args) {
        int M[][] = {{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};

        printMatrix(M);
    }

    private static void printMatrix(int[][] M) {

        int i,j;
        int R = M.length;
        int C = M[0].length;

        int S[][] = new int[R][C];

        int max_s, max_i, max_j;
        max_s = Integer.MIN_VALUE;

        for(i = 0; i < R; i++)
            S[i][0] = M[i][0];

        for(j = 0; j < C; j++)
            S[0][j] = M[0][j];

        for (i=1;i<R;i++) {
            for (j=1;j<C;j++) {
                if (M[i][j] == 1) {
                    S[i][j] = Math.min(S[i][j-1], Math.min(S[i-1][j], S[i-1][j-1])) + 1;
                    if (S[i][j] > max_s)
                        max_s = S[i][j];
                } else {
                    S[i][j] = 0;
                }
            }
        }

        System.out.println("---Total Sqaure Size ---" + max_s);


    }


}
