package com.multi.mongoDB;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_find {

	public static void main(String[] args) {
		// 1. mongodb 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. mongodb 연결 성공.");
		// 2. shop2 db로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db 연결 성공.");
		// 3. member 컬렉션에 연결
		MongoCollection<org.bson.Document> collection = database.getCollection("member");
		System.out.println("3. member 컬렉션에 연결 성공.");

		FindIterable<Document> list = collection.find();
		ArrayList<MemberVO> result = new ArrayList<>();
		for (Document document : list) {
			// System.out.println(document);
			MemberVO bag = new MemberVO();
			bag.setId(document.getString("id"));
			bag.setName(document.getString("pw"));
			bag.setPw(document.getString("name"));
			bag.setTel(document.getString("tel"));
			result.add(bag);
		}
		System.out.println(result);
	}

}