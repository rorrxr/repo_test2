package com.example.demo.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.infra.codegroup.CodeGroupDto;

@Service
public class CodeService {
	@Autowired
	CodeDao dao;
	
	public List<CodeDto> selectList(){ return dao.selectList();}


	public CodeDto selectOne(CodeDto dto) {
		// TODO Auto-generated method stub
		return dao.selectTwo(dto);
	}
	
	public int insert(CodeDto dto) {
		return dao.insert(dto);

	}
	public int update(CodeDto dto) {
		return dao.update(dto);
	}
	
	public int updateDelete(CodeDto dto) {
		return dao.updateDelete(dto);
	}
	
	public int delete(CodeDto dto) {
		return dao.delete(dto);
	}
}
