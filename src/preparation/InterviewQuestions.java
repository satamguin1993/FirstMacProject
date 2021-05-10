package preparation;

public class InterviewQuestions {

    public static void main(String[] args) {
        System.out.println("satam".substring(2));

        StringBuffer sb1 = new StringBuffer("Satam");
        StringBuffer sb2 = new StringBuffer("Satam");

        String satam = "Satam";

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(satam));

        sb2 = sb1;

        System.out.println(sb1.equals(sb2));


        float f = 45.0f;
        double d = 45.0;

        int i = (int) f;

        f = (float)d;
        d = f;

        String hello = "Hello  ";
        hello += "Adobe  ";
        hello = hello.trim();
        System.out.print(hello);

    }

}
