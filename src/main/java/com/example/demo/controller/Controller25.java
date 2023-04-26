package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.*;

@Controller
@RequestMapping("sub25")
public class Controller25 {

	@RequestMapping(value = "link1", method = RequestMethod.POST)
	public void method1() {
		System.out.println("/sub25/link1 에서 메소드 일함");
	}
	
	// @RequestMapping(value = "link2", method = RequestMethod.GET)
	@GetMapping("link2")
	public void method2() {
		System.out.println("/sub25/link2 GET 에서 메소드 일함");
	}
	
	// @RequestMappin(value = "link3", method = RequestMethod.POST)
	@PostMapping("link3")
	public void method3() {
		System.out.println("/sub25/link3 POST 에서 메소드 일함");
	}
	
	// /sub25/link4/abc
	// /sub25/link4/def
	@GetMapping("link4/{var1}")
	public void method4(@PathVariable("var1") String p1) {
		System.out.println("var1:" + p1);
	}
	
	// /sub25/link5/abc/55
	// /sub25/link5/def/77
	@GetMapping("link5/{id}/{age}")
	public void method5(@PathVariable("id") String id,
			@PathVariable("age") int age) {
		System.out.println(id + ", " + age);
	}
	
	// /sub25/link6/id/3/name/son
	// /sub25/link6/id/7/name/park
	@GetMapping("link6/id/{var1}/name/{var2}")
	public void method6(@PathVariable("var1") String id,
			@PathVariable("var2") String name) {
		System.out.println(id + ", " + name);
	}
	
	@GetMapping("link7")
	public String method7() {
		
		return "hello"; // /WEB-INF/views/hello.jsp 
	}
	
	// redirect
	@GetMapping("link8")
	public String method8() {
		return "redirect:/sub25/link7";
	}
	
	@GetMapping("link9")
	public String method9(Model model) {
		
		model.addAttribute("attr1", "value1");
		
		return "redirect:link10";
	}
	
	@GetMapping("link10")
	public void method10() {
		
	}
	
	@GetMapping("link11")
	public String method11(RedirectAttributes rttr) {
		rttr.addFlashAttribute("attr1", "redirect attribute!!");
		
		return "redirect:link10";
	}
	
	@GetMapping("link12")
	public String method12(RedirectAttributes rttr) {
		
		rttr.addFlashAttribute("list", List.of("강백호", "서태웅"));
		
		return "redirect:link13";
	}
	
	@GetMapping("link13")
	public void method13() {
		
	}
	
	@GetMapping("link14")
	public String method14(RedirectAttributes rttr) {
		// 목적지의 Model Attribute로
//		rttr.addFlashAttribute(null, rttr); 
		
		// 쿼리스트링으로 붙어서
		rttr.addAttribute("address", "seoul");
		
		return "redirect:link15";
	}
	
	// /sub25/link15 요청 보내면
	@GetMapping("link15")
	public String method15(RedirectAttributes rttr) {
		rttr.addAttribute("email", "abc@gmail.com");
		rttr.addAttribute("location", "seoul");
		
		return "redirect:link16";
	}
	
	@GetMapping("link16")
	public void method16(@RequestParam("email") String email,
			@RequestParam("location") String location) {
		System.out.println("email:" + email);
		System.out.println("location:" + location);
	}
	
}















