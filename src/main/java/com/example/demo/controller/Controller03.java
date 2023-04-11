package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sub3")
public class Controller03 {
	
	//spring mvc request handler method

	@RequestMapping("/link1")
	public void method01() {
		System.out.println("working in the link1");
	}
		
		@RequestMapping("/link2")
		public void method02() {
			System.out.println("working in the link2");
		}
		
	
}
