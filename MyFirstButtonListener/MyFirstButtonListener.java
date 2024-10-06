import javax.swing.*;
import java.awt.event.*;

class MyFirstButtonListener implements ActionListener{
	int nTimeClicked = 0;
	String sTimeClicked = "0 times i been clicked";
	JButton button;

	public static void main(String[] args) {
		MyFirstButtonListener gui = new MyFirstButtonListener();
		gui.go();
	}

	public void go(){
		JFrame frame = new JFrame();
		button = new JButton(sTimeClicked);

		button.addActionListener(this);

		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event){
		sTimeClicked = " times i been clicked";
		nTimeClicked ++;
		button.setText(nTimeClicked+sTimeClicked);

	}
}