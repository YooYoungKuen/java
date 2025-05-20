package yyk.roulett;

import java.util.Random;
import java.util.Scanner;


public class RouletteGame1 {
	   // 필드 선언
    String machineId;
    String location;
    int totalPoints;
    int successCount;
    int failCount;
    int remainingTries;
    int revenue;

   // 생성자
   public RouletteGame1(String machineId, String location) {
       this.machineId = machineId;
       this.location = location;
       this.totalPoints = 0;
       this.successCount = 0;
       this.failCount = 0;
       this.remainingTries = 0;
       this.revenue = 0;
   }

   // 충전 메소드
   public void charge(int amount) {
       if (remainingTries > 0) {
           System.out.println("잔여 시도가 남아있어 충전할 수 없습니다.");
           return;
       }

       if (amount % 1000 != 0) {
           System.out.println("1000원 단위로만 충전할 수 있습니다.");
           return;
       }

       int tries = (amount / 1000) * 2;
       revenue += amount;
       remainingTries = tries;

       System.out.println("충전 완료: " + amount + "원 -> " + tries + "회");
   }

   // 게임 실행 메소드
   public void runGame() {
       if (remainingTries <= 0) {
           System.out.println("충전된 시도가 없습니다. 먼저 충전해주세요.");
           return;
       }

       Random random = new Random();
       System.out.println("\n[게임 시작]");

       while (remainingTries > 0) {
           int spin = random.nextInt(6) + 1;

           if (spin <= 4) {
               System.out.println("성공! " + spin + "점 획득!");
               successCount++;
               totalPoints += spin;
           } else {
               System.out.println("실패!");
               failCount++;
           }

           remainingTries--;
       }

       System.out.println("\n[게임 결과]");
       System.out.println("성공 횟수: " + successCount);
       System.out.println("실패 횟수: " + failCount);
       System.out.println("총합 포인트: " + totalPoints);

       // 초기화
       totalPoints = 0;
       successCount = 0;
       failCount = 0;
       remainingTries = 0;

       System.out.println("\n게임이 종료되었습니다. 메뉴로 돌아갑니다.");
   }

   // 매출 반환 메소드
   public int getRevenue() {
       return revenue;
   }

   // 실행용 메인 메소드
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("기기 아이디 입력: ");
       String id = scanner.nextLine();

       System.out.print("지점명 입력: ");
       String location = scanner.nextLine();

       RouletteGame1 game = new RouletteGame1(id, location);

       while (true) {
           System.out.print("\n메뉴 선택 (1: 충전, 2: 게임시작, 3: 마감 및 종료): ");
           String choice = scanner.nextLine();

           switch (choice) {
               case "1":
                   if (game.remainingTries > 0) {
                       System.out.println("잔여 시도가 있어 충전할 수 없습니다.");
                   } else {
                       System.out.print("충전 금액 입력 (1000원 단위): ");
                       int amount = scanner.nextInt();
                       scanner.nextLine(); // 충전 금액 입력값 초기화
                       game.charge(amount); // 충전 메소드 호출
                   }
                   break;
               case "2":
                   game.runGame();  //게임 실행 메소드 호출
                   break;
               case "3":
                   if (game.remainingTries > 0) {
                       System.out.println("남은 시도가 있습니다. 먼저 게임을 마치고 종료해주세요.");
                   } else {
                       System.out.println("\n[마감]");
                       System.out.println("누적 매출액: " + game.getRevenue() + "원"); //매출 반환 메소드 호출
                       System.out.println("프로그램을 종료합니다.");
                       return;
                   }
                   break;
               default:
                   System.out.println("잘못된 입력입니다.");
           }
       }
   }
}


