package kr.or.nextit;

import kr.or.nextit.dao.SampleDao;
import kr.or.nextit.service.SampleService;
import kr.or.nextit.service.impl.SampleServiceImpl;

public class SampleMain {

	public static void main(String[] args) {
		
		SampleDao sampleDao = new SampleDao();
		SampleService sampleService = new SampleServiceImpl(sampleDao);
		//SampleServiceImpl2 sampleService2 = new SampleServiceImpl2(sampleDao);
		
		sampleService.select();
	
	}

}
