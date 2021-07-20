package com.semi.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.myapp.dao.MemberDAO;
import com.semi.myapp.vo.MemberVO;

@Service
public class MemberService {
		
	@Autowired
	MemberDAO memberDAO;
	public void memberInsert(MemberVO m) throws Exception{
	memberDAO.memberInsert(m);
	}
		
	public String login(MemberVO m) {
		return memberDAO.login(m);
		}
}
