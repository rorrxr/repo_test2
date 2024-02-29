package com.example.demo.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService service;
//	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/codeGroupXdmList")
	public String codeGroupXdmList(Model model) throws Exception{
//		List<CodeGroupDto> list = service.selectList();
//		List<CodeGroupDto> codeGroupDtos = service.selectList();
		
//		for(CodeGroupDto a:codeGroupDtos) {
//			System.out.println(a.getName());
//		}
		
		model.addAttribute("list", service.selectList());
		
		return "codeGroupXdmList";
	}
}
