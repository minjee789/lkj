import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int drinkType = sc.nextInt();

        System.out.println("크기를 선택하세요: 1-Small, 2-Medium, 3-Large");
        int size = sc.nextInt();

        System.out.println("옵션을 선택하세요: 1-기본, 2-샷추가, 3-시럽추가, 4-샷+시럽추가");
        int option = sc.nextInt();

        int baseprice = 0;

        switch (drinkType) {
            case 1:
                baseprice = 3000;
                break;
            case 2:
                baseprice = 4000;
                break;
            case 3:
                baseprice = 4500;
                break;
            default:
                System.out.println("잘못된 접근입니다.");
                return;
        }
        switch (size) {
            case 1:
                size = + 0;
                break;
            case 2:
                size = + 500;
                break;
            case 3:
                size = + 1000;
                break;
            default:
                System.out.println("잘못된 접근입니다.");
                return;
        }
        switch (option) {
            case 1:
                option = + 0;
                break;
            case 2:
                option = + 500;
                break;
            case 3:
                option = + 300;
                break;
            case 4:
                option = + 800;
                break;
            default:
                System.out.println("잘못된 접근입니다.");
                return;
        }

        int result_price = baseprice + size + option;

        System.out.println("최종 가격은 "+ result_price + "원입니다.");
        sc.close();
    }
}