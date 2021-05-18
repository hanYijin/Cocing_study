package mh0518;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {

//	@Autowired
	MemberDao memberdao;
	
	public MemberService(MemberDao memberdao) {
		this.memberdao = memberdao;
	}
	
	public MemberService() {}

	public MemberDao getMemberdao() {
		return memberdao;
	}

	public void setMemberdao(MemberDao memberdao) {
		this.memberdao = memberdao;
	}

	public void insert() {
		memberdao.doInsert();
	}
}
