package practice;

public class P_250304_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Sytem.out.println(world);
		 * ?
		 * System.out.println(world+a) 를 했을 때 결과가
		 * 5
		 * 11
		 * 이 출력이 되도록 ? 에 내용을 기재
		 */
		
//		int world = 5;
//		int a = 11;
//		System.out.println(world);
//		System.out.println(a);
		
		System.out.println("=====================");
		
		/*
		 * 아래의 문장을 기술해서 예상 결과를 주석으로 기재한 후 실행
		 */
		
		int world=5;
		System.out.println(world+5);
		//예상결과 10 , 결과 ==> 10
		System.out.println("world"+5);
		//예상결과 world5 , 결과 ==> world5
		System.out.println("world"+world);
		//예상결과 world5 , 결과 ==> world5
		System.out.println("=====================");
		
		/*
		 * 아래의 문장을 기술해서 예상 결과를 주석으로 기재한 후 실행
		 */
		
		int a=5;
		int b=6;
		System.out.println("a+b="+a+b);
		//예상결과 a+b=56 , 결과 ==> a+b=56
		System.out.println("a+b="+(a+b));
		//예상결과 a+b=11 , 결과 ==> a+b=11
		
		System.out.println("=====================");
		/*
		 * 아래의 문장을 기술해서 예상 결과를 주석으로 기재한 후 실행
		 */
		
		int c=5;
		System.out.println(c);
		//예상결과 5 , 결과 ==> 5
		c=3;
		System.out.println(c);
		//예상결과 3 , 결과 ==> 3
		
		System.out.println("=====================");
		
		int d=5;
		System.out.println(d);
		//예상결과 5 , 결과 ==> 5
		d=6;
		System.out.println(d);
		//예상결과 6 , 결과 ==> 6
		int e=5;
		System.out.println(d+e);
		//예상결과 11 , 결과 ==> 11
		System.out.println("=====================");
		
		
		int f=5;
		f=6;
		f=7;
		f=8;
		System.out.println(f);
		//예상결과 8 , 결과 ==> 8
		System.out.println("=====================");
		
		int g=5;
		double h=5.1;
		String st="hello";
		System.out.println(g+h+st);
		//예상결과 10.1hello , 결과 ==> 10.1hello
		System.out.println(st+h+g);
		//예상결과 hello5.15 , ==> 결과 hello5.15
		System.out.println("g+h="+(g+h)+st);
		//예상결과 g+h=10.1hello , 결과 ==> g+h=10.1hello
		System.out.println("=====================");
		
		
		int i=5;
		i=i+5;
		System.out.println(i);
		//예상결과 10 , 결과 ==> 10
		System.out.println("=====================");
		
		/*
		 * 아래의 문장을 기술해서 예상 결과를 주석으로 기재한 후 실행
		 */
		
		int sum=0;
		sum=sum+1;
		System.out.println(sum);
		//예상결과 1
		sum=sum+2;
		System.out.println(sum);
		//예상결과 3
		sum=sum+3;
		System.out.println(sum);
		//예상결과 6
		int j=5;
		sum=j+5;
		System.out.println(sum);
		//예상결과 11 , 결과 ==> 10 . sum이 j+5로 재선언되었는데 sum+5로 잘못 봤음
		j=7;
		sum=sum+j;
		System.out.println(sum);
		//예상결과 18 , 결과 ==> 17 앞전에 sum이 재선언된것을 잘 못 봤음
		
		
		
	}

}
