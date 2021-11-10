import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Confirmed extends Frame {
	Connection con;

	Confirmed() {
		addWindowListener(new W());
		JTable table = new JTable();
		table.setBackground(Color.WHITE);
		table.setBounds(23, 250, 800, 300);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airdb", "root", "");
			String sql = "SELECT * from Passengers";
			table.setBackground(Color.WHITE);
			table.setBounds(23, 250, 800, 300);

			JScrollPane pane = new JScrollPane(table);
			pane.setBounds(23, 250, 800, 300);
			pane.setBackground(Color.WHITE);
			add(pane);

			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery(sql);
			table.setBackground(Color.WHITE);
			table.setBounds(23, 250, 800, 300);
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	class W extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			setVisible(false);

		}
	}
}
