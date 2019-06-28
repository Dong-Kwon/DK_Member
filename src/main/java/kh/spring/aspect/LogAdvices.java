package kh.spring.aspect;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvices {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	
	@Pointcut("execution(* kh.spring.practice.MemberController.*())")
	public void homeAll() {}
	
	@Before("homeAll()")
	public void printLog(JoinPoint jp) {				// login 할때 넘기는 Parameter 값을 여기에 담아 준다.
		for(Object o : jp.getArgs()) {
			System.out.println("for문 : " + o);
		}
		System.out.println("배열 : " + Arrays.toString(jp.getArgs()));
			
		Signature sign = jp.getSignature();
		
		StringBuilder sb = new StringBuilder();
		sb.append(sdf.format(System.currentTimeMillis()) + " 에 ");
		sb.append(sign.getName() + " 메서드가 실행됨.");					// 메서드 이름
		System.out.println("문자열 : " + sb.toString());
		System.out.println("타겟 : " + jp.getTarget());				// 어느 메서드에 속해 있는지
		System.out.println("롱 스트링 : " + sign.toLongString());
		System.out.println("쇼트 스트링 : " + sign.toShortString());
	}
}


