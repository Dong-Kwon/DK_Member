package kh.spring.impl;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kh.spring.dao.MemberDAO;
import kh.spring.dto.MemberDTO;

@Component
public class MemberDAOimpl implements MemberDAO{
	@Autowired
	private SqlSessionTemplate sst;
	
	@Autowired
	private JdbcTemplate template;

	public int insert(MemberDTO dto) {
		dto.setId(dto.getId());
		dto.setPw(dto.getPw());
		dto.setName(dto.getName());
		dto.setImgAddr(dto.getImgAddr());
		return sst.insert("MemberDAO.insert", dto);
	}

	public MemberDTO login(String id, String pw) {
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		return sst.selectOne("MemberDAO.login", dto);
	}

	public int duplProc(String id) {
		String sql="select * from members where id=?";
		return template.update(sql, id);
	}
	
	public MemberDTO myPage(String id){
		String sql = "select * from members where id=?";
		return template.queryForObject(sql, new Object[]{id}, new RowMapper<MemberDTO>() {
			@Override
			public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				MemberDTO dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setImgAddr(rs.getString("ImgAddr"));
				return dto;
			}
		});
	}
	
}


