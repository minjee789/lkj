import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.print("숫자를 입력하시오 ");
        num1 = input.nextInt();

        System.out.print("숫자를 입력하시오 ");
        num2 = input.nextInt();

        System.out.print("숫자를 입력하시오 ");
        num3 = input.nextInt();

        System.out.println(num1 + " - " + num2 + " - " + num3 + " = " + (num1 - num2 - num3));
    }
}