import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음료를 선택하시오: 1: 아메리카노, 2: 카페라떼, 3:카푸치노");
        int drinkType = sc.nextInt();
        System.out.println("사이즈를 선택하시오 1: small, 2: medium, 3: large");
        int size = sc.nextInt();
        System.out.println("옵션을 선택하시오 1: 기본, 2: 샷추가, 3: 시럽추가, 4: 샷, 시럽 추가");
        int option = sc.nextInt();

        int price = 0;
        if (drinkType == 1) {
            price = 3000;
        }else if (drinkType == 2) {
            price = 4000;
        }else if (drinkType == 3) {
            price = 4500;
        }else {
            System.out.println("오류입니다.");
            return;
        }
        if (size == 2) {
            price += 500;
        }else if (size == 3) {
            price += 1000;
        }
        if (option == 2) {
            price += 500;
        }else if (option == 3) {
            price += 300;
        }else if (option == 4) {
            price += 800;
        }
        System.out.println("최종 가격: " +price+ "원");
        sc.close();
    }
}