package kh.spring.dao;

import kh.spring.dto.MemberDTO;

public interface MemberService {
	public void insert(MemberDTO dto) throws Exception;
	public MemberDTO login(String id, String pw);
	public int duplProc(String id);
	public MemberDTO myPage(String id);
}
