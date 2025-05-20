package yyk.roulett;


import java.util.Random;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int money = 0;
        int tries = 0;
        int totalPoints = 0;

        System.out.println("=== 룰렛 게임 시작 ===");

        // 돈 충전
        System.out.print("충전 금액을 입력하세요 (1000원 단위): ");
        money = scanner.nextInt();

        if (money % 1000 != 0) {
            System.out.println("1000원 단위로만 충전 가능합니다.");
            return;
        }

        tries = (money / 1000) * 2;
        System.out.println("게임 횟수: " + tries + "회");

        // 게임 실행
        while (tries > 0) {
            System.out.print("엔터를 눌러 룰렛 돌리기...");
            scanner.nextLine();  // 이전 입력 초기화
            scanner.nextLine();  // 실제 엔터 대기

            int result = random.nextInt(6) + 1;

            if (result <= 4) {
                System.out.println("성공! " + result + "점 획득!");
                totalPoints += result;
            } else {
                System.out.println("실패!");
            }

            tries--;
            System.out.println("남은 시도: " + tries + "회\n");
        }

        // 결과 출력
        System.out.println("=== 게임 종료 ===");
        System.out.println("총 포인트: " + totalPoints + "점");
        System.out.println("매출: " + money + "원");
    }
}
