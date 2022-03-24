package com.example.demo.controller;


import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.MemberVO;

@Controller
public class MemberController {
	@RequestMapping("memberInsert")
	public String memberInsert(MemberVO memberVO) {
	System.out.println(memberVO);
		return "memberInsert_result";
	}
	@RequestMapping("login")
	@ResponseBody
	public String login(HttpSession session, MemberVO memberVO) {
		System.out.println("회원 아이디 : "+memberVO.getId()+ " 회원 비밀번호 : "+memberVO.getPw());
		session.setAttribute("memberVO", memberVO);
		JSONObject jo = new JSONObject();
		jo.put("id", memberVO.getId());
		
		return jo.toJSONString();
	}
	@RequestMapping("logout")
	@ResponseBody
	public String logout(HttpSession session) {
	JSONObject jo=new JSONObject();
	try {
	session.invalidate();
	jo.put("msg", "ok");
	}catch(Exception e) {
	jo.put("msg", e.getMessage());
	}
	return jo.toJSONString();
	}
}
