package ch06.sec07.Book;

public class Book {
	
	String title;
	int series = 1;
	int page = 100;
	
	Book () {
		this.title = "제목없음";
		this.series = 1;
		this.page = 100;
	}
	
	Book (String title) {
		this(title, 1, 100);

	}
	
	Book (String title, int page) {
		this(title, 1, page);
	}
	
	Book (int series, String title) {
		this(title, series, 100);
		
	}
	
	Book (String title, int series, int page ) {
		this.title = title;
		this.series = series;
		this.page = page;
	}	

}
