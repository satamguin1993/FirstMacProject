package preparation;

public class Sort_TwoArray {

    public static void main(String[] args) {
        int a1[] = {5, 8, 9, 15};
        int a2[] = {4, 7, 8, 10, 12};

        int result[] = new int[a1.length + a2.length];

        int i,j;
        for (i=0, j=0; i<a1.length && j<a2.length;) {
            if (i < a1.length && a1[i] <= a2[j]) {
                result[i+j] = a1[i];
                i++;
            } else if (j<a2.length){
                result[i + j] = a2[j];
                j++;
            }
        }

        while (i < a1.length) {
            result[i+j] = a1[i];
            i++;
        }

        while (j < a2.length) {
            result[i+j] = a2[j];
            j++;
        }


        for (i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }

}
