

package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr1;		//배열 변수 arr1 선언
		int[] arr2;		//배열 변수 arr2 선언
		int[] arr3;		//배열 변수 arr3 선언
		
		
		arr1 = new int[] {1,2,3};	//배열 {1,2,3}을 생성하고 arr1 변수에 대입
		arr2 = new int[] {1,2,3};	//배열 {1,2,3}을 생성하고 arr2 변수에 대입
		arr3 = arr2;		//배열 변수 arr2의 값을 배열 변수 arr3에 대입
		
		System.out.println(arr1 == arr2);   //arr1과 arr2 변수가 같은 배열을 참조하는지 검사
		System.out.println(arr2 == arr3);	//arr2과 arr3 변수가 같은 배열을 참조하는지 검사
		
		
		//arr1과 arr2의 저장 항목은 같지만 서로 다른 배열 객체로 생성되니까 arr1과 arr2의 번짓수는 다르다.
		//arr3은 arr2 변수의 번지가 대입되었기 때문에 arr3과 arr2의 번짓수가 같다
	}

}
