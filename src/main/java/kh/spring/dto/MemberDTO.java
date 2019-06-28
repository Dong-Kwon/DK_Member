package kh.spring.dto;

import org.springframework.web.multipart.MultipartFile;

public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private MultipartFile image;
	private String imgAddr;
	
	public MemberDTO(String id, String pw, String name, MultipartFile image, String imgAddr) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.image = image;
		this.imgAddr = imgAddr;
	}
	
	public MemberDTO(String id, String pw, String name, String imgAddr) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.imgAddr = imgAddr;
	}
	
	public MemberDTO(String id, String pw, String name, MultipartFile image) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.image = image;
	}
	
	public MemberDTO() {
		super();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public String getImgAddr() {
		return imgAddr;
	}
	public void setImgAddr(String imgAddr) {
		this.imgAddr = imgAddr;
	}
	
	
	
	

}
