package kr.or.nextit.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class SimpleLoggingAdvice {
	
	// around. 패러미터제약
	private Object logging(ProceedingJoinPoint joinPoint) {
		
		//대상 타겟.
		Class clazz = joinPoint.getTarget().getClass();
		Logger logger = Logger.getLogger(clazz);
		
		String className = clazz.getName(); // 클래스 이름
		String methodName = joinPoint.getSignature().getName();	// 메서드 이름
		
		//실행 전 로그
		logger.debug("[AOP : logging] : " + className + " : " 
				+  "." + methodName + " 가 실행 전.");
			
		Object retVal;
		try {
			//본 서비스 실행
			retVal = joinPoint.proceed();
			//실행 후 로그
			logger.debug("[AOP : logging] : " + className + " : " 
					+  "." + methodName + " 가 실행 후.");
			
		} catch (Throwable e) {
			logger.error("[AOP : logging] :" + e.getMessage(), e);
		} finally {
			logger.debug("[AOP : logging] : " + className + " : " 
					+  "." + methodName + " 가 종료.");
		}
		
		return null;
	}
}
