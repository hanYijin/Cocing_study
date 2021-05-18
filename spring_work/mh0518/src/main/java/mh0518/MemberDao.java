package mh0518;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {

	List<MemberDTO> list = new ArrayList<MemberDTO>();
	
	public void doInsert() {
		MemberDTO mdto = new MemberDTO("홍길동");
		list.add(mdto);
		System.out.println("저장했습니다.");
	}
}
