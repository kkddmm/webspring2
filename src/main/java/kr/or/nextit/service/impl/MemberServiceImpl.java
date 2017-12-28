package kr.or.nextit.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.nextit.dao.MemberDao;
import kr.or.nextit.service.MemberService;

@Service("memberService") //인터페이스 이름따라 첫글자 소문자 없으면 첫문자대문자memberServiceImpl 인식
public class MemberServiceImpl implements MemberService{
	
	Logger logger = Logger.getLogger(MemberServiceImpl.class);
	
	@Autowired
	//@Resource(name="memberDao")
	private MemberDao memberDao;
	
	@Override
	public void select() {
		//logger.debug("[MemberDaoServiceImpl.select()실행]");
		
		System.out.println("[MemberDaoServiceImpl.select() 메소드 호출...]");
		memberDao.select();
		
		//logger.debug("[MemberDaoServiceImpl.select()종료]");
		
	}

	@Override
	public int insert() {
		System.out.println("[MemberDaoServiceImpl.insert() 메소드 호출...]");
		
		//int sum = 3/0;//error 발생
		
		return memberDao.insert();
	}

}
