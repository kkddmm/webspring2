package kr.or.nextit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	
	public MemberDao() {}
	
	public void select() {
		System.out.println("MemberDao.select() Dao호출");
	}
	
	public int insert() {
		System.out.println("MemberDao.insert() Dao호출");
		return new Integer(2017);
	}
	
}
