import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (true) {
            ;
            Scanner sc = new Scanner(System.in);
            System.out.println("점수를 입력하세요(종료하려면 음수를 입력)");
            int N = sc.nextInt();


            if (N < 0) {
                System.out.println("종료");
                break;
            } else {
                sum = sum + N;
            }
            System.out.println("점수의 총합은" + N);
        }
    }
}

