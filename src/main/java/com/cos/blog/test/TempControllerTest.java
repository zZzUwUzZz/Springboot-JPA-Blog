package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 9faf17c0aeefd54f9cb9ae04cc9c771a711e9868

@Controller
public class TempControllerTest {
	
	//http://localhost:1000/blog/temp/home
	@GetMapping("/temp/home")
	public String tempHome() {
		System.out.println("tempHome()");
		//파일리턴 기본경로 : src/main/resources/static
		// 풀경로:src/main/resources/static/home.html
		return "home";
	}
	
	@GetMapping("/temp/img")
	public String templmg() {
		return "a.jpg";
	}
	
	@GetMapping("/temp/jsp")
	public String tempJsp() {
<<<<<<< HEAD
		return "test";
=======
		return "home";
>>>>>>> 9faf17c0aeefd54f9cb9ae04cc9c771a711e9868
	}
}
