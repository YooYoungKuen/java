package ch07.sec09.exam1;

public class InstanceofExample {

	//main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();
        
        //person이 참조하는 객체가 Student 타입인지 확인하고 
        //student 변수에 대입(타입 변환 발생)
        if(person instanceof Student student) {
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        } else {
            System.out.println("학생이 아니라서 번호가 없습니다");
        }
        
        
        //person이 참조하는 객체가 Student 타입인지 확인
        if (person instanceof Student) {
            System.out.println("Java11버전이하이면 지금과 같이 하면 됩니다=============");
            //Stuednt 객체일 경우 강제 타입 변환
            Student student = (Student) person;
            //Student 객체만 가지고 있는 필드 및 메소드 사용
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }
    }
    
    public static void main(String[] args) {
        //Person 객체를 매개값으로 제공하고 personInfo 메소드 호출
        Person p1 = new Person("조현우");
        personInfo(p1);
        
        System.out.println();
        
        //Student 객체를 매개값으로 제공하고 personInfo 메소드 호출
        Person p2 = new Student("김지훈", 10);
        personInfo(p2);
	}

}
