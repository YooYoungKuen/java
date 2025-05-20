package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * grade에 따라 스위치된 점수를 score에 대입하는 
		 * switchValueExample 예제
		 */
		
		String grade = "B";
		
		//Java 11이전 문법
		int score1 = 0;
		switch(grade) {
		case "A":
		score1 = 100;
		break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
			default:
				score1 = 60;
		}
		System.out.println("score1:" + score1);
		
		
		
		//Java 13부터 가능
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		System.out.println("score2:" + score2);

	}

}
