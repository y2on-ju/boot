package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub9")
public class Controller09 {

	// /sub9/link1?name=son&age=20
	@RequestMapping("link1")
	public String method01(HttpServletRequest req, Model model) {
		// 1. request parameter 수집/가공
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));

		Dto04 obj = new Dto04();
		obj.setName(name);
		obj.setAge(age);

		// 2. business logic

		// 3. add attribute
		model.addAttribute("value", obj);

		// 4. forward / redirect
		// /WEB-INF/views/sub9/link1.jsp 로 포워드
		return "/sub9/link1";
	}

	// /sub9/link2?name=park&age=40
	@RequestMapping("link2")
	public String method2(@ModelAttribute("value") Dto04 obj) {

		return "/sub9/link1";
	}

	@RequestMapping("link3")
	public void method3(@ModelAttribute("attr") Dto04 dto) {
		// 1. request param 수집/가공
		// Dto04 객체 만듦
		// name 요청 파라미터를 위 객체에 셋팅
		// age 요청 파라미터를 위 객체에 셋팅

		// 3. add attribute 추가
		// 위 객체를 attr 이름으로 model 추가

		// 4. forward/ redirect
		// /WEB-INF/views/sub9/link3.jsp로 포워드
	}

	// 경로 : /sub9/link4?name=cha&age=50
	@RequestMapping("link4")
	public void method4(Dto04 dto) {
		// 1. request param 수집/가공
		// Dto04 객체 만듦
		// name 요청 파라미터를 위 객체에 셋팅
		// age 요청 파라미터를 위 객체에 셋팅

		// 3. add attribute 추가
		// 위 객체를 dto04 이름으로 model 추가

		// 4. forward/ redirect
		// /WEB-INF/views/sub9/link4.jsp로 포워드
	}
	
	//경로 /sub9/link5?model=genesis&company=tesla&price=300
	@RequestMapping("link5")
	public void method5(Dto02 dto) {
		//1. 쿼리스트링작성
		//2. jsp 작성
		//3. 해서 dto의 property들 출력
	}
}


