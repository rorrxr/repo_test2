package com.example.demo.infra.code;

import java.util.List;


public interface CodeDao {
	public List<CodeDto> selectList();
	
	public CodeDto selectTwo(CodeDto dto); // 데이터 하나만 리턴할 때에는 list가 아닌 dto로 가져옴

	public int insert(CodeDto dto); // 데이터 하나만 리턴할 때에는 list가 아닌 dto로 가져옴
	public int update(CodeDto dto);
	public int updateDelete(CodeDto dto);
	public int delete(CodeDto dto);

}
