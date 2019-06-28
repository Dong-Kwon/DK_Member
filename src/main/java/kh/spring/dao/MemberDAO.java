package kh.spring.dao;

import kh.spring.dto.MemberDTO;

public interface MemberDAO {
	public int insert(MemberDTO dto);
	public MemberDTO login(String id, String pw);
	public int duplProc(String id);
	public MemberDTO myPage(String id);
}
