package kr.or.nextit;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.nextit.service.SampleService;

public class SpringDIMain {
	public static void main(String[] args) {
		
		String configLocation = "classpath:application-context.xml";
		
		AbstractApplicationContext context =  new GenericXmlApplicationContext(configLocation);
		
		//SampleService sampleService = (SampleService)context.getBean("sampleService");
		SampleService sampleService = context.getBean("sampleService",  SampleService.class);
		SampleService sampleService2 = context.getBean("sampleService",  SampleService.class);
		
		System.out.println("같은 서비스 객체인가용?" + (sampleService == sampleService2));
		
		sampleService.select();
		
	}

}
