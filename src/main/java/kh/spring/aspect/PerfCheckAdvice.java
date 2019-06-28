package kh.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfCheckAdvice {
	
	@Around("execution(* kh.spring.practice.MemberController.*(..))")
	public Object perfCheck(ProceedingJoinPoint pjp) {
		long startTime = System.currentTimeMillis();
		Object retVal = null;								// 뭘 받을지 모르기 때문에 Object형임. (반드시 Object일 필요는 없음)
		
		try {
			retVal = pjp.proceed();							// return 값이 home / Exception의 상위 예외 처리인 Throwable을 써야 함. 
		} catch (Throwable e) {
			e.printStackTrace();	
		}       							  			 	// 윗 줄은 Before, 아랫 줄은 After		

		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime)/1000.0 + "초간 수행");	
		return retVal;
	}
}
