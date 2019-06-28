package kh.spring.impl;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kh.spring.dao.MemberDAO;
import kh.spring.dao.MemberService;
import kh.spring.dto.MemberDTO;

@Component
public class MemberServiceimple implements MemberService{

	@Autowired
	private MemberDAO mdao;
	
	@Autowired
	private HttpSession session;
	
	public void insert(MemberDTO dto){
		String imageAddr = session.getServletContext().getRealPath("resources");
		String imgName = System.currentTimeMillis() + "_profile.png";
		String imgAddr = "resources/" + imgName;
		System.out.println("경로 : " + imageAddr);
		try {
			dto.getImage().transferTo(new File(imageAddr + "/" + imgName));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		} 
		
		dto.setImgAddr(imgAddr);
		
		mdao.insert(dto);
	}
	
	public MemberDTO login(String id, String pw) {
		return mdao.login(id, pw);
	}
	
	public int duplProc(String id) {
		return mdao.duplProc(id);
	}
	
	public MemberDTO myPage(String id) {
		MemberDTO dto = mdao.myPage(id);
		return dto;
	}
}
