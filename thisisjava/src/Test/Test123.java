package Test;

import java.util.Scanner;
import java.util.Random;

public class Test123 {
	
	
	public static void main(String[] args) {
		

		
		
	

		class Player {
		    String name;
		    int atBats = 0; // 타석 수
		    int hits = 0; // 안타 수

		    public Player(String name) {
		        this.name = name;
		    }

		    public double getBattingAverage() {
		        return atBats == 0 ? 0.0 : (double) hits / atBats;
		    }
		}

		public class Test123 {
		    static final int TOTAL_PLAYERS = 9; // 타자 수
		    static final int TOTAL_INNINGS = 3; // 총 이닝 수
		    static final int MAX_OUTS = 3; // 이닝당 최대 아웃 수
		    static Player[] players = new Player[TOTAL_PLAYERS];
		    static Random random = new Random();
		    static Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		        initializePlayers();
		        playGame();
		        scanner.close(); // Scanner 종료
		    }

		    // 9명의 플레이어 초기화
		    private static void initializePlayers() {
		        for (int i = 0; i < TOTAL_PLAYERS; i++) {
		            players[i] = new Player("플레이어 " + (i + 1));
		        }
		    }

		    // 게임 진행
		    private static void playGame() {
		        int currentBatterIndex = 0; // 현재 타자 인덱스
		        for (int inning = 1; inning <= TOTAL_INNINGS; inning++) {
		            System.out.println("\n==== " + inning + "회 초 시작 ====");
		            int outs = 0;
		            while (outs < MAX_OUTS) {
		                Player currentBatter = players[currentBatterIndex];
		                System.out.printf("\n타자: %s (타율: %.3f)\n", currentBatter.name, currentBatter.getBattingAverage());
		                System.out.print("1부터 10 사이의 숫자를 입력하세요: ");
		                int batterSwing = getUserInput();
		                int pitch = random.nextInt(10) + 1;
		                System.out.println("투수가 던진 공: " + pitch);

		                currentBatter.atBats++; // 타석 증가
		                if (batterSwing == pitch) {
		                    currentBatter.hits++; // 안타 증가
		                    System.out.println("안타!");
		                } else {
		                    outs++; // 아웃 증가
		                    System.out.println("아웃!");
		                }
		                // 다음 타자로 변경 (9번 타자 이후 1번 타자로 순환)
		                currentBatterIndex = (currentBatterIndex + 1) % TOTAL_PLAYERS;
		            }
		            System.out.println("\n==== " + inning + "회 초 종료 ====");
		        }
		        displayFinalStats();
		    }

		    // 사용자 입력 받기 (1~10 범위)
		    private static int getUserInput() {
		        int input;
		        while (true) {
		            try {
		                input = Integer.parseInt(scanner.nextLine());
		                if (input >= 1 && input <= 10) {
		                    return input;
		                }
		                System.out.print("잘못된 입력입니다. 1부터 10 사이의 숫자를 입력하세요: ");
		            } catch (NumberFormatException e) {
		                System.out.print("잘못된 입력입니다. 1부터 10 사이의 숫자를 입력하세요: ");
		            } catch (java.util.NoSuchElementException e) {
		                System.out.println("입력 오류가 발생했습니다. 프로그램을 종료합니다.");
		                System.exit(1); // 프로그램 종료
		            }
		        }
		    }

		    // 최종 통계 출력
		    private static void displayFinalStats() {
		        System.out.println("\n==== 게임 종료! 최종 통계 ====");
		        for (Player player : players) {
		            System.out.printf("%s - 타석: %d, 안타: %d, 타율: %.3f\n", player.name, player.atBats, player.hits, player.getBattingAverage());
		        }
		    }
		}
		
		
	}
}