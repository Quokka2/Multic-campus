package 배열심화;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 200);
		f.setTitle("2023년 달력");
		
		String header[] = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		String contents[][] = {
				{"1", "2", "3", "4", "5", "6", "7"},
				{"8", "9", "10", "11", "12", "13", "14"},
				{"15", "16", "17", "18", "19", "20", "21"},
				{"22", "23", "24", "25", "26", "27", "28"},
				{"29", "30", "31", " ", " ", " ", " "}
		};

		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		Font font = new Font("맑은고딕", Font.BOLD, 10);

		table.setFont(font);
		table.setBackground(Color.lightGray);
		f.add(scroll);
		f.setVisible(true);
		}
}
