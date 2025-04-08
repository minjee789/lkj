import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor = 0, mat = 0, eng = 0, sci = 0;
        int sum = 0;
        int inAvg = 0;
        double doubleAvg = 0.0;
        boolean boolRslt = false;

        System.out.println("kor score");
        kor = sc.nextInt();
        System.out.println("mat score");
        mat = sc.nextInt();
        System.out.println("eng score");
        eng = sc.nextInt();
        System.out.println("sci score");
        sci = sc.nextInt();

        sum = kor + mat + eng + sci;

        inAvg = sum / 4;

        doubleAvg = sum / 4;

        boolRslt = inAvg == doubleAvg;

        System.out.println("sum");
        System.out.println(sum);
        System.out.println("inAvg");
        System.out.println(inAvg);
        System.out.println("doubleAvg");
        System.out.println(doubleAvg);
        System.out.println("boolRslt");
        System.out.println(boolRslt);
    }
}