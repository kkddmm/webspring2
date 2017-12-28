package kr.or.nextit.service.impl;

import kr.or.nextit.dao.SampleDao;
import kr.or.nextit.service.SampleService;

public class SampleServiceImpl implements SampleService{

	private SampleDao sampleDao;
	
	public void  setSampleDao(SampleDao sampleDao) {
		System.out.println("[DI : SampleServiceImpl Setter 생성자 주입완료]");
		this.sampleDao = sampleDao;
	}
	
	public SampleServiceImpl() {};
	
	public SampleServiceImpl(SampleDao sampleDao) {
		System.out.println("[[DI : SampleServiceImpl 생성자 주입완료]");
		this.sampleDao = sampleDao;
	}

	
	@Override
	public void select() {
		System.out.println("[SampleServiceImpl.select() 메소드 호출...]");
		sampleDao.select();
	}

}
