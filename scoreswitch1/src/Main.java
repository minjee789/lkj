import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("점수를 입력하시오");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        switch (score/10) {
            case 10:
                System.out.println("학점은 A 입니다.");
                break;

            case 9:
                System.out.println("학점은 A 입니다.");
                break;

            case 8:
                System.out.println("학점은 B 입니다");
                break;

            case 7:
                System.out.println("학점은 C 입니다.");
                break;

            case 6:
                System.out.println("학점은 D 입니다.");
                break;

            case 5:
                System.out.println("학점은 F 입니다.");
                break;

            case 4:
                System.out.println("학점은 F 입니다.");
                break;

            case 3:
                System.out.println("학점은 F 입니다.");
                break;

            case 2:
                System.out.println("학점은 F 입니다.");
                break;

            case 1:
                System.out.println("학점은 F 입니다.");
                break;

            case 0:
                System.out.println("학점은 F 입니다.");
                break;
        }
    }
}