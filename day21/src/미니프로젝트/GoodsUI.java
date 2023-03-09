package 미니프로젝트;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GoodsUI {
	private static JTable table;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(528, 693);
		JPanel panel = new JPanel();

		panel.repaint();
		String header[] = { "CODE", "NAME", "PRICE" };
		GoodsDAO dao = new GoodsDAO();
		ArrayList<GoodsVO> list = dao.list();

		Object[][] all = new String[list.size()][3];
		for (int i = 0; i < all.length; i++) {
			for (int j = 0; j < 3; j++) {
				all[i][0] = list.get(i).getCode();
				all[i][1] = list.get(i).getName();
				all[i][2] = list.get(i).getPrice();
			}
		}
		f.getContentPane().add(panel, BorderLayout.CENTER);
		table = new JTable(all, header);
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane);
		panel.updateUI();

		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int rowNo = table.getSelectedRow();
				int colNo = table.getSelectedColumn();
				Object value = (Object) table.getModel().getValueAt(rowNo, colNo);
				System.out.println(value);
			}

		});
		f.setVisible(true);

	}

}
