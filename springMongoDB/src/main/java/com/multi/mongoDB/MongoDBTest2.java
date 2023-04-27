package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2 {

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

		Document doc = new Document();
		doc.append("id", "banana");
		doc.append("pw", "1234");
		doc.append("name", "hong");
		doc.append("tel", "013");
		
		Document doc2 = new Document();
		doc2.append("id", "banana1");
		doc2.append("pw", "1234");
		doc2.append("name", "park");
		doc2.append("tel", "014");

		//ArrayList<Document> list = new ArrayList<Document>();
		List<Document> list = new ArrayList<>();
		list.add(doc);
		list.add(doc2);
		
		collection.insertMany(list);
		System.out.println("4. 전송완료.");
	}

}