package com.cos.blog.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// ORM -> Java(다른언어) Object -> 테이블로 매핑해주는 기술

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity// User 클래스가 MySQL에 테이블이 생성이 된다.
public class User {

	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; // 시퀀스, auto_increment
 
	@Column(nullable = false, length = 20)
	private String username;

	@Column(nullable = false, length = 100) // 123456 => 해쉬 (비밀번호 암호화)
	private String password;

	@Column(nullable = false, length = 50)
	private String email;

//	@ColumnDefault("'user'")
	@Enumerated(EnumType.STRING)
	private RoleType role; // Enum을 쓰는게 좋다. // admin, user, manager
	
	public enum RoleType { //enum -> 내가 넣고자 하는 값을 강제할 수 있다. and 데이터의 도메인을 만드는 역할
	    USER, ADMIN //-> 해당 값을 강제할 수 있다. and 실수해서 다른 값을 넣는 걸 방지할 수 있다.
	}
	
	@CreationTimestamp // 시간이 자동 입력
	private Timestamp createDate;
}


