package kr.or.nextit;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.nextit.controller.MemberController;
import kr.or.nextit.service.MemberService;

public class SpringAOPMain {
	public static void main(String[] args) {
		
		String configLocation = "classpath:aspect-context.xml";
		
		AbstractApplicationContext context =  new GenericXmlApplicationContext(configLocation);//웹이면 다른설정파일씀
		
		MemberService memberService = context.getBean("memberService",  MemberService.class);

		//memberService.select();
		memberService.insert();
		
		/*MemberController memberController = context.getBean("memberController", MemberController.class);
		memberController.process();*/
		
	}

}
