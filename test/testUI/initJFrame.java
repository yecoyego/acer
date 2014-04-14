package testUI;

import ui.uiJFrame;
import ui.uiJPanel;

public class initJFrame {

	public static void main(String[] args) {
		uiJFrame jframe=new uiJFrame();
		uiJPanel jpanel= new uiJPanel();
		jframe.getContentPane().add(jpanel);
	}

}
