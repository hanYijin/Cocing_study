package mh0518;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//  \\192.168.0.111\git_mh\spring_work\mh0518\src\main\java\mh0518

public class MemberController {
	
	public static ApplicationContext acac = null;
	MemberService memberService;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public MemberController(MemberService memberService) throws IOException {
		this.memberService = memberService;
		
		while(true) {
			System.out.println("뭐할래요?");
			String cmd = br.readLine();
			if(cmd.equals("insert")) {
				memberService.insert();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// spring 3 버전은 xml 방식으로 객체 생성한다
		// spring 4 버전은 annotaion 방식으로 객체 생성한다
		
//		acac = new AnnotationConfigApplicationContext(MyConf.class);
//		MemberService ms = acac.getBean("memberService",MemberService.class);
		
		GenericXmlApplicationContext gxac =
				new GenericXmlApplicationContext("myconf.xml");
		
		MemberService ms = gxac.getBean("memberService",MemberService.class);
		
		new MemberController(ms);
	}
}



















