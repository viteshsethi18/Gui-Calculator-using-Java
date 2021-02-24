import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.SwingConstants;


public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 244, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 213, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("B");
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0);
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setBounds(10, 72, 51, 39);
		frame.getContentPane().add(btnBackspace);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+ btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btn7.setBounds(10, 113, 51, 39);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+ btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn4.setBounds(10, 149, 51, 39);
		frame.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+ btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn1.setBounds(10, 185, 51, 39);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn0.setBounds(10, 224, 51, 39);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnClear.setBounds(65, 72, 51, 39);
		frame.getContentPane().add(btnClear);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+ btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btn8.setBounds(65, 113, 51, 39);
		frame.getContentPane().add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+ btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn5.setBounds(65, 149, 51, 39);
		frame.getContentPane().add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+ btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn2.setBounds(65, 185, 51, 39);
		frame.getContentPane().add(btn2);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+ btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnDot.setBounds(65, 224, 51, 39);
		frame.getContentPane().add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn00.setBounds(117, 72, 51, 39);
		frame.getContentPane().add(btn00);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+ btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btn9.setBounds(117, 113, 51, 39);
		frame.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+ btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn6.setBounds(117, 149, 51, 39);
		frame.getContentPane().add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+ btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btn3.setBounds(117, 185, 51, 39);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer = null;
				second=Double.parseDouble(textField.getText());
				if(operation=="+"){
					result=first+second;
					//answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if(operation=="-"){
					result=first-second;
					//answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if(operation=="*"){
					result=first*second;
					//answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if(operation=="/"){
					result=first/second;
					//answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if(operation=="%"){
					result=first%second;
					//answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
			}
		});
		btnEqual.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnEqual.setBounds(117, 224, 51, 39);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnPlus.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnPlus.setBounds(172, 72, 51, 39);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnSub.setBounds(172, 113, 51, 39);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnMul.setBounds(172, 149, 51, 39);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setHorizontalAlignment(SwingConstants.RIGHT);
		btnDivide.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnDivide.setBounds(172, 185, 51, 39);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnPercent.setBounds(172, 224, 51, 39);
		frame.getContentPane().add(btnPercent);
	}
}
