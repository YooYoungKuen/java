package sec01.ex02;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberBean {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	private Address addr;
	
	// default 생성자
	public MemberBean() {
		
	}
	
	// 속성에 대한 getter/setter

	public MemberBean(String id, String pwd, String name, String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
	
} // class 끝