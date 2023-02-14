package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {

	public void open() {
		// Jframe화면이 보이게 하자. 기능을 정의하도록 함
		// System.out.println("화면이 open될거예요..");

		JFrame f = new JFrame();
		f.setTitle("내 일기장 작성화면");
		f.setSize(400, 400);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("맑은고딕", 1, 20);

		JLabel day = new JLabel("오늘의 날짜");
		JLabel title = new JLabel("오늘의 제목");
		JLabel content = new JLabel("오늘의 내용");
		day.setFont(font);
		title.setFont(font);
		content.setFont(font);

		JTextField dayText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		dayText.setFont(font);
		titleText.setFont(font);

		JTextArea contentText = new JTextArea(5, 10);
		contentText.setFont(font);

		JButton btn = new JButton("파일에 일기 저장");
		btn.setFont(font);
		btn.setBackground(Color.WHITE);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 날짜, 제목, 내용 입력한 것 가지고 오세요
				String day2 = dayText.getText();
				String title2 = titleText.getText();
				String content2 = contentText.getText();
				System.out.println(day2 + " " + title2 + " " + content2);
				
				// 파일도 만들어주고, 자바프로그램과 file간에 연결통로(강물, stream)을
				// 만들어준다
				// 외부에 있는 파일, 네트워크, CPU등을 자바에서 연결할 때는
				// 아주 위험한 상황이라고 인식!!
				// 이렇게 위험한 상황에서 만약 문제가 발생하면 어떻게 처리할지를
				// 꼭 써주어야 함!!!
				try {
					FileWriter file = new FileWriter(day2 + ".txt");
					file.write(day2 + "\n");
					file.write(title2 + "\n");
					file.write(content2 + "\n");
					file.close();
				} catch (Exception e2) {
					// 처리할 내용을 넣어주세요!!
					System.out.println("파일로 저장하는 중 문제가 생김!");
				}
			}
		});

		f.add(day);
		f.add(dayText);
		f.add(title);
		f.add(titleText);
		f.add(content);
		f.add(contentText);
		f.add(btn);

		f.setVisible(true);

	}
}
