package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sub2")
public class Controller02 {

	// 경로 : /sub2/link1
	@RequestMapping("/link1")
	public void method01() {
		System.out.println("/sub2/link1 에서 일하는 메소드!!");
	}
	
	// 경로 : /sub2/link2
	@RequestMapping("/link2")
	public void method02() {
		System.out.println("/sub2/link2 에서 일하는 메소드!!");
	}
}




