package kh.spring.dto;

public class BoardDTO {
	private int seq;
	private String writer;
	private String writeDate;
	private int viewCount;
	private int likeIt;
	
	public BoardDTO(int seq, String writer, String writeDate, int viewCount, int likeIt) {
		super();
		this.seq = seq;
		this.writer = writer;
		this.writeDate = writeDate;
		this.viewCount = viewCount;
		this.likeIt = likeIt;
	}
	
	public BoardDTO() {
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getLikeIt() {
		return likeIt;
	}
	public void setLikeIt(int likeIt) {
		this.likeIt = likeIt;
	}
	
}
