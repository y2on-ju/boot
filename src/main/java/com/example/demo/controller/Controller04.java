package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub4")
public class Controller04 {
	// method argument(parameter)

	// 경로 : /sub4/link1?name=손&age=30
	@RequestMapping("link1")
	public void method01(HttpServletRequest request) {
		// 1. request parameter 수집/가공
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
		// 2. business logic
		
		// 3. add attribute
		
		// 4. forward/redirect
	}
	
	// 경로 : /sub4/link2?address=seoul&email=korea@gmail.com
	// address, email 파라미터 출력하는 메소드 작성
	@RequestMapping("link2")
	public void method02(HttpServletRequest request) {
		// 1. request param
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		System.out.println("address:" + address);
		System.out.println("email:" + email);
		
		// 2. business logic
		// 3. add attribute
		// 4. forward/redirect
	}
	
	// 경로 : /sub4/link3?address=seoul
	@RequestMapping("link3")
	public void method03(@RequestParam("address") String address) {
		System.out.println("address:" + address);
	}
	
	// 경로 : /sub4/link4?age=99
	// 로 요청 왔을 때 age request 파람 출력하는 메소드 작성
	@RequestMapping("link4")
	public void method04(@RequestParam("age") String myage) {
		System.out.println("age: " + myage);
		
		int age = Integer.parseInt(myage);
		
		System.out.println("int age : " + age);
	}
	
	// 경로 : /sub4/link5?score=80
	@RequestMapping("link5")
	public void method05(@RequestParam("score") int score) {
		System.out.println("score:" + score);
		
		// 2.
		// 3.
		// 4.
		
	}
	
}





