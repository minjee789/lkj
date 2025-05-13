import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요:");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 0;



        for(int i = 1; i <= N; i++){
            if (i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("홀수의 합: " + sum);
    }
}