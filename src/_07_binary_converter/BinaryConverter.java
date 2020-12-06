package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button = new JButton();
	static JLabel label = new JLabel();
	static JTextField textField = new JTextField(20);
public static void main(String[] args) {
	BinaryConverter stuff = new BinaryConverter();
	stuff.addActionListener();
	panel.add(button);
	frame.add(panel);
	panel.add(label);
	panel.add(textField);
	frame.setVisible(true);
	button.setText("Convert");
	frame.pack();
}
public void addActionListener() {
	button.addActionListener(this);
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
@Override
public void actionPerformed(ActionEvent arg0) {
	System.out.println("Button Clicked");
	String converted = convert(textField.getText());
	label.setText(converted);
	frame.pack();
	
}
}
