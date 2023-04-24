package com.multi.mvc100;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RankingController {

	@Autowired
	RankingDAO dao;

//	@RequestMapping("one")
//	public void one(String id, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(id);
//		RankingVO bag = dao.one(id);
//		model.addAttribute("bag", bag);
//	}

//	@RequestMapping("jsonResponse3")
//	@ResponseBody
//	public RankingVO jsonResponse3(String id) {
//		System.out.println("one요청됨.");
//		System.out.println(id);
//		RankingVO bag = dao.one(id);
//		return bag;
//	}

	@RequestMapping("list")
	public List<Object> list(Model model) {
		List<Object> list = dao.list();
		model.addAttribute("list", list);
		return list;
	}
	
	@RequestMapping("list6")
	public List<Object> list6(String store , Model model) {
		List<Object> list = dao.list(store);
		System.out.println(list.size());
		model.addAttribute("list", list);
		return list;
	}

//	@RequestMapping("jsonResponse4")
//	@ResponseBody
//	public ArrayList<RankingVO> list() {
//		ArrayList<RankingVO> list = dao.list();
//		System.out.println(list.size());
//		return list;
//	}

	// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8

}
