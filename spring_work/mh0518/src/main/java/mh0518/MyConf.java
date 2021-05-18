package mh0518;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyConf1.class)
public class MyConf {

	@Bean
	public CMemberDao cmemberDao() {
		CMemberDao md = new CMemberDao();
		return md;
	}
	
	@Bean
	public MemberDao memberDao() {
		MemberDao md = new MemberDao();
		return md;
	}
	
	@Bean
	public MemberService memberService() {
		MemberService ms = new MemberService();
		ms.setMemberdao(memberDao());
		return ms; 
	}
	
//	@Bean
//	public MemberController memberController() throws IOException {
//		return new MemberController(memberService());
//	}
	
	
}
