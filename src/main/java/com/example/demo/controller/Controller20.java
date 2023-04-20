package com.example.demo.controller;

import java.time.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub20")
public class Controller20 {

	@Autowired
	private Mapper01 mapper;

	@RequestMapping("link1")
	public void method1() {
		String name = mapper.method1();
		System.out.println(name);

		System.out.println(mapper.method2());
	}

	@RequestMapping("link2")
	public void method2() {

		// Mapper01에 method3 작성

		// 1번 공급자의 공급자명 출력
		System.out.println(mapper.method3());
	}

	@RequestMapping("link3")
	public void method3() {
		String name = mapper.method4(5);
		System.out.println(name);
	}

	// link4?id=70
	@RequestMapping("link4")
	public void method4(
			@RequestParam("id") Integer customerId) {
		String name = mapper.method4(customerId);
		System.out.println(name);
	}
	
	// link5?id=2
	// 2번 직원의 lastName을 콘솔에 출력
	@RequestMapping("link5")
	public void method5(Integer id) {
		System.out.println(mapper.method5(id));
	}
	
	
	@RequestMapping("link6")
	public void method6() {
		Integer price = mapper.method6();
		System.out.println(price);
		
		// mapper01 에  method7 작성
		// 하나의 row의 weight 컬럼의 값 리턴
		Double weight = mapper.method7();
		System.out.println(weight);
		
		LocalDate published = mapper.method8();
		System.out.println(published);
		
		LocalDateTime updated = mapper.method9();
		System.out.println(updated);
	}
	
	@RequestMapping("link7")
	public void method() {
		Dto06 res = mapper.method10();
		System.out.println(res);
	}
	
	@RequestMapping("link8")
	public void method8() {
		Dto05 res = mapper.method11();
		System.out.println(res);
	}
	
	@RequestMapping("link9")
	public void method9() {
		Customer cus = mapper.method12();
		System.out.println(cus);
	}
	
	@RequestMapping("link10")
	public void method10() {
		Supplier sup = mapper.method13();
		System.out.println(sup); // 2번 공급자 정보출력
	}
	
	// method11 mapper.method14() 실행 결과 콘솔에 출력
	@RequestMapping("link11")
	public void method11() {
		System.out.println(mapper.method14());
	}
}










