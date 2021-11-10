import java.awt.*;
import java.awt.event.*;

public class Login extends Frame implements ActionListener {
	String username = "admin";
	String password = "admin";
	TextField t1, t2;
	Label l1, l2, l3, l4, l5, l6;
	Button b2, b3, b4;
	GridBagLayout gbl;
	GridBagConstraints gbc;
	Font f1, f2;

	public Login() {

		setBackground(Color.cyan);
		f1 = new Font("TimesRoman", Font.BOLD, 20);
		f2 = new Font("TimesRoman", Font.BOLD, 15);
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		setLayout(gbl);
		l1 = new Label("Username", Label.CENTER);
		l1.setFont(f1);
		l2 = new Label("Password", Label.CENTER);
		l2.setFont(f1);
		l3 = new Label("");
		l4 = new Label("");
		l5 = new Label("");
		l6 = new Label("");
		t1 = new TextField(15);
		t2 = new TextField(15);
		t2.setEchoChar('*');
		b2 = new Button("Reset");
		b2.setFont(f2);
		b3 = new Button("Submit");
		b3.setFont(f2);
		b4 = new Button("Close");
		b4.setFont(f2);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbl.setConstraints(l1, gbc);
		add(l1);

		gbc.gridx = 2;
		gbc.gridy = 0;
		gbl.setConstraints(t1, gbc);
		add(t1);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbl.setConstraints(l2, gbc);
		add(l2);

		gbc.gridx = 2;
		gbc.gridy = 2;
		gbl.setConstraints(t2, gbc);
		add(t2);

		gbc.gridx = 0;
		gbc.gridy = 4;
		gbl.setConstraints(l3, gbc);
		add(l3);

		gbc.gridx = 2;
		gbc.gridy = 4;
		gbl.setConstraints(l4, gbc);
		add(l4);

		gbc.gridx = 0;
		gbc.gridy = 6;
		gbl.setConstraints(b2, gbc);
		add(b2);

		gbc.gridx = 2;
		gbc.gridy = 6;
		gbl.setConstraints(b3, gbc);
		add(b3);

		gbc.gridx = 0;
		gbc.gridy = 8;
		gbl.setConstraints(l4, gbc);
		add(l4);

		gbc.gridx = 2;
		gbc.gridy = 8;
		gbl.setConstraints(l5, gbc);
		add(l5);

		gbc.gridx = 0;
		gbc.gridy = 10;
		gbl.setConstraints(b4, gbc);
		add(b4);


		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b2) {
			t1.setText("");
			t2.setText("");
		}
		if (ae.getSource() == b4) {
			System.exit(0);
		}
		if (ae.getSource() == b3) {
			if ((t1.getText().equals(username)) && (t2.getText().equals(password))) {
				MainMenu m = new MainMenu();
				setVisible(false);
				m.setSize(400, 400);
				m.setVisible(true);
				m.setTitle("Main Menu");
			} else {
				MessageBox mb = new MessageBox(this);
				mb.setLocation(200, 200);
				mb.setVisible(true);
			}
		}
	}
}
