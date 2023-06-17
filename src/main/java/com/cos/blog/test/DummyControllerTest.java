package com.cos.blog.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.model.User;

@RestController
public class DummyControllerTest {
	
	@PostMapping("/dummy/join")
	public String join(User user) {
		System.out.println("Id : ");
		System.out.println("username : ");
		System.out.println("password : ");
		System.out.println("email : ");
		return "회원가입이 완료되었습니다.";
	}
}