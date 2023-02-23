package 네트워크프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 도토리톡A extends JFrame {

	DatagramSocket socket;
	JTextArea list;
	JTextField input;

	public 도토리톡A() {
		try {
			socket = new DatagramSocket(7777);
		} catch (SocketException e1) {
			e1.printStackTrace();
		}

		list = new JTextArea();
		input = new JTextField();
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		setTitle("도토리톡A");
		setSize(300, 300);
		list.setBackground(Color.BLUE);
		list.setForeground(Color.WHITE);
		input.setBackground(Color.BLUE);
		input.setForeground(Color.WHITE);

		Font font = new Font("맑은고딕", Font.BOLD, 20);
		list.setFont(font);
		input.setFont(font);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String s = input.getText();
				try {
					DatagramSocket socket = new DatagramSocket();

					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5555);

					list.append("나 >> " + s + "\n");
					input.setText("");
					socket.send(packet);
					socket.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});

		setVisible(true);
	}

	public void process() {
		// 받는 부분을 무한루프 먼저 실행해야한다
		while (true) {
			try {
				System.out.println("살아있음 팔닥팔닥");
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				list.append("남자A >> " + new String(data) + "\n");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		도토리톡A m = new 도토리톡A();
		m.process();
	}

}
