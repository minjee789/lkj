import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하시오");
        int x = sc.nextInt();


        if (1 <= x && x <= 100) {
            System.out.println("1에서 100사이의 값입니다.");
        }
        if (!(1 <= x && x <= 100)) {
            System.out.println("1에서 100사이의 값이 아닙니다.");
        }
        sc.close();
    }
}