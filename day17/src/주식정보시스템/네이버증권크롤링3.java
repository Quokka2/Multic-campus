package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {

	public static void main(String[] args) {
		String site = "https://finance.naver.com/item/main.naver?code=";
		String[] name = { "서흥", "CJ제일제당", "와이지-원", "에스피지", "대한화섬" };
		String[] com = { "008490", "097950", "019210", "058610", "003830" };

		Document doc = null;
		try {
			for (int i = 0; i < com.length; i++) {
				// 연결할 링크 con에 저장
				Connection con = Jsoup.connect(site + com[i]);
				// con에 저장된 정보를 get(꺼내오다로 이해)해서 doc에 저장
				doc = con.get();
				System.out.println(name[i]);
				// doc에 저장된 소스코드에 span태그 안에 blind 클래스 선택해서 list 요소에 저장
				Elements list = doc.select("span.blind");
				// list에 있는 소스에 12번째 소스를 꺼내와서 tag에 저장
				Element tag = list.get(12);
				// tag에 저장된 소스의 text(글자)를 꺼내와서 today에 저장
				String today = tag.text();
				System.out.println("현재가 : " + today);
				System.out.println("=============");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}