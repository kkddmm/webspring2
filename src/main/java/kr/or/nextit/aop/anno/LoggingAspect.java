package kr.or.nextit.aop.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Pointcut("execution(public * kr.or.nextit..*Service.*(..))")
	public void servicePointCut() {}
	
	@Before("servicePointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("[AOP : LoggingAspect.before() 메서드 실행.]");
	}
	
	@AfterReturning(pointcut="servicePointCut()", returning="retVal")
	public void afterReturning(JoinPoint joinPoint, Object retVal) {
		System.out.println("[AOP : LoggingAspect.afterReturning() 메서드 실행. retVal=" + retVal +"]");
	}
	
	@AfterThrowing(pointcut="servicePointCut()", throwing="e")
	public void afterThrowing(JoinPoint joinPoint, Throwable e) {
		System.out.println("[AOP : LoggingAspect.afterThrowing() 메서드 실행 에러발생. msg=" + e.getMessage() +"]");
	}
	
	@After("servicePointCut()")
	public void after() {
		System.out.println("[AOP : LoggingAspect.after() 메서드 실행.]");
	}
	
	@Around("servicePointCut()")
	public Object around(ProceedingJoinPoint joinPoint)throws Throwable{
		System.out.println("[AOP : LoggingAspect.after() 메서드 실행전.]");
		
		Object retVal = joinPoint.proceed();
		
		System.out.println("[AOP : LoggingAspect.after() 메서드 실행후.]");
		return retVal;
	}
	
}
