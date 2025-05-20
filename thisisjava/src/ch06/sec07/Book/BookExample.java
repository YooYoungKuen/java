package ch06.sec07.Book;

public class BookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Book b1 = new Book(); 
	        System.out.println("b1.title : " + b1.title);        // 제목없음
	        System.out.println("b1.series : " + b1.series);    // 1
	        System.out.println("b1.page : " + b1.page);    // 100

	        Book b2 = new Book("이것이 자바다");
	        System.out.println("b2.title : " + b2.title);        // 이것이 자바다
	        System.out.println("b2.series : " + b2.series);    // 1
	        System.out.println("b2.page : " + b2.page);    // 100

	        Book b3 = new Book("신데렐라", 170); 
	        System.out.println("b3.title : " + b3.title);        // 신데렐라
	        System.out.println("b3.series : " + b3.series);    // 1
	        System.out.println("b3.page : " + b3.page);    // 170

	        Book b4 = new Book(5, "노인과 바다");
	        System.out.println("b4.title : " + b4.title);        // 노인과 바다
	        System.out.println("b4.series : " + b4.series);    // 5
	        System.out.println("b4.page : " + b4.page);    // 100
		
	}

}
