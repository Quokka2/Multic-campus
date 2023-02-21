package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링4 {

	public void naver(String code1) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code1);
		
		Document doc = null;
		try {
			doc = con.get();
//			Elements codeList = doc.select(".code"); 
//			Element tag = codeList.get(0);
//			String code = tag.text();
//			System.out.println("코드는 " + code);
			
			Elements list = doc.select("span.blind");
			Element tag2 = list.get(12);
			Element tag3 = list.get(20);
			Element tag4 = list.get(16);
			String today1 = tag2.text();
			String today2 = tag3.text();
			String today3 = tag4.text();
			System.out.println("현재가 : " + today1);
			System.out.println("저가 : " + today2);
			System.out.println("고가 : " + today3);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}