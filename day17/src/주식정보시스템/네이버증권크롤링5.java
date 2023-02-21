package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링5 {

	public String naver1(String code2) {

		Element tag2 = null, tag3 = null, tag4 = null;

		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code2).get();
			Elements list = doc.select("span.blind");
			tag2 = list.get(12);
			tag3 = list.get(20);
			tag4 = list.get(16);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return "현재가 : " + tag2.text() + "\n" + "저가 : " + tag3.text() + "\n" + "고가 : " + tag4.text();
	}
}