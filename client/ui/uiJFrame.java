package ui;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class uiJFrame extends JFrame {
	public uiJFrame() {
		super();
		setSize((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2,
				(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
