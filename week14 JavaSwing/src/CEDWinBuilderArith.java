/*
 * Assignment 11 Window Builder
 * Ratchapoom Huabiam
 * ID:6402041620256
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class CEDWinBuilderArith extends JFrame {
	private static final long serialVersionUID = 75656381L;
	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//SwingUtilities and EventQueue it same.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					CEDWinBuilderArith frame = new CEDWinBuilderArith();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CEDWinBuilderArith() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("CED Arithmetic");
		lblTitle.setForeground(Color.ORANGE);
		lblTitle.setFont(new Font("MV Boli", Font.BOLD, 38));
		lblTitle.setBounds(21, 24, 334, 65);
		contentPane.add(lblTitle);
		
		JLabel IbINum1 = new JLabel("NUM1  :");
		IbINum1.setForeground(Color.PINK);
		IbINum1.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		IbINum1.setBounds(22, 103, 96, 28);
		contentPane.add(IbINum1);
		
		JLabel IbINum2 = new JLabel("NUM2  :");
		IbINum2.setForeground(Color.PINK);
		IbINum2.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		IbINum2.setBounds(22, 150, 86, 35);
		contentPane.add(IbINum2);
		
		JLabel lblResult = new JLabel("Result  :");
		lblResult.setForeground(Color.GREEN);
		lblResult.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		lblResult.setBounds(21, 196, 107, 47);
		contentPane.add(lblResult);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(140, 102, 224, 28);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(140, 152, 224, 28);
		contentPane.add(txtNum2);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setColumns(10);
		txtResult.setBounds(138, 201, 224, 28);
		contentPane.add(txtResult);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double X = Double.parseDouble(txtNum1.getText());
				double Y = Double.parseDouble(txtNum2.getText());
				double Z = X + Y;
				txtResult.setText(Z+"");
			}
		});
		btnAdd.setForeground(Color.BLUE);
		btnAdd.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnAdd.setBounds(385, 76, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("SUB");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double X = Double.parseDouble(txtNum1.getText());
				double Y = Double.parseDouble(txtNum2.getText());
				double Z = X - Y;
				txtResult.setText(Z+"");
			}
		});
		btnSub.setForeground(Color.BLUE);
		btnSub.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnSub.setBounds(385, 119, 89, 23);
		contentPane.add(btnSub);
		
		JButton btnMul = new JButton("MUL");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double X = Double.parseDouble(txtNum1.getText());
				double Y = Double.parseDouble(txtNum2.getText());
				double Z = X * Y;
				txtResult.setText(Z+"");
			}
		});
		btnMul.setForeground(Color.BLUE);
		btnMul.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnMul.setBounds(385, 161, 89, 23);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("DIV");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double X = Double.parseDouble(txtNum1.getText());
				double Y = Double.parseDouble(txtNum2.getText());
				double Z = X / Y;
				txtResult.setText(Z+"");
			}
		});
		btnDiv.setForeground(Color.BLUE);
		btnDiv.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnDiv.setBounds(385, 206, 89, 23);
		contentPane.add(btnDiv);
		
		JButton btnNewButton = new JButton("CLEAR ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNum1.setText("");
				txtNum2.setText("");
				txtResult.setText("");
			}
		});
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBounds(385, 24, 89, 28);
		contentPane.add(btnNewButton);
		
	}
}
