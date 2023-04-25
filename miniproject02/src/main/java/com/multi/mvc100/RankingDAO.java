package com.multi.mvc100;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RankingDAO {

	@Autowired
	SqlSessionTemplate my;

	public int insert(RankingVO bag) {
		int result = my.insert("book.create", bag);
		return result;
	}

	public RankingVO one(RankingVO bag) {
		RankingVO result = my.selectOne("Ranking.one", bag);
		System.out.println(result);
		return result;
	}

	public List<Object> list() {
		return my.selectList("Ranking.all");
	}
	
	public List<Object> list1() {
		return my.selectList("Ranking.count");
	}
	
	public List<Object> list(String storeAddress) {
		List<Object> list = my.selectList("Ranking.rank", storeAddress);
		return list;
	}
	
	
}