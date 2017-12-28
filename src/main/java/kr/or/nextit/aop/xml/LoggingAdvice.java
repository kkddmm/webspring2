package kr.or.nextit.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAdvice {
	
	public void before(JoinPoint joinPoint) {
		System.out.println("[AOP : LoggingAdvice.before() 메서드 실행.]");
	}
	
	public void afterReturning(JoinPoint joinPoint, Object retVal) {
		System.out.println("[AOP : LoggingAdvice.afterReturning() 메서드 실행. retVal=" + retVal +"]");
	}
	
	public void afterThrowing(JoinPoint joinPoint, Throwable e) {
		System.out.println("[AOP : LoggingAdvice.afterThrowing() 메서드 실행 에러발생. msg=" + e.getMessage() +"]");
	}
	
	public void after() {
		System.out.println("[AOP : LoggingAdvice.after() 메서드 실행.]");
	}
	
	public Object around(ProceedingJoinPoint joinPoint)throws Throwable{
		System.out.println("[AOP : LoggingAdvice.after() 메서드 실행전.]");
		
		Object retVal = joinPoint.proceed();
		
		System.out.println("[AOP : LoggingAdvice.after() 메서드 실행후.]");
		return retVal;
	}
	
}
