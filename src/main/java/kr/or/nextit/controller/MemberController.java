package kr.or.nextit.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import kr.or.nextit.service.MemberService;

@Controller
public class MemberController {
	
	@Resource(name="memberService")
	MemberService memberService;
	
	public void process() {
		System.out.println("[MemberController.process() 메서드 호출...]");
		memberService.select();
	}
	
}
