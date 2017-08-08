package d2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class CreateAccount extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount frame = new CreateAccount();
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
	public CreateAccount() {
		setTitle("Register New Account");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//page chua thong tin tai khoan va nut next
		JPanel addAcountPane = new JPanel();
		addAcountPane.setBackground(Color.LIGHT_GRAY);
		contentPane.add(addAcountPane, "AddAcountPane");
		addAcountPane.setLayout(new BorderLayout(0, 0));
		
		//Page chua thong tin tai khoan
		JPanel accountInfoPane = new JPanel();
		accountInfoPane.setBackground(Color.PINK);
		addAcountPane.add(accountInfoPane, BorderLayout.CENTER);
		accountInfoPane.setLayout(null);
		
		JLabel lblCreateYourAccount = new JLabel("Create Your Account");
		lblCreateYourAccount.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCreateYourAccount.setBounds(104, 11, 208, 36);
		accountInfoPane.add(lblCreateYourAccount);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(21, 77, 74, 14);
		accountInfoPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(225, 77, 100, 14);
		accountInfoPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Choose Your usename");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(21, 135, 156, 20);
		accountInfoPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Create a password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(21, 204, 156, 20);
		accountInfoPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(21, 94, 180, 20);
		accountInfoPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 94, 168, 20);
		accountInfoPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(21, 154, 372, 20);
		accountInfoPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Confirm your password");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(21, 264, 168, 20);
		accountInfoPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Birthday (d/m/y) ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(21, 331, 156, 14);
		accountInfoPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(21, 351, 55, 20);
		accountInfoPane.add(textField_5);
		textField_5.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(21, 222, 372, 20);
		accountInfoPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(21, 282, 372, 20);
		accountInfoPane.add(passwordField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January", "Ferbruary", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox.setBounds(86, 351, 97, 20);
		accountInfoPane.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setBounds(193, 351, 200, 20);
		accountInfoPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGender.setBounds(21, 397, 46, 14);
		accountInfoPane.add(lblGender);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(Color.PINK);
		rdbtnNewRadioButton.setBounds(21, 420, 55, 23);
		accountInfoPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBackground(Color.PINK);
		rdbtnNewRadioButton_1.setBounds(90, 420, 59, 23);
		accountInfoPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Orther");
		rdbtnNewRadioButton_2.setBackground(Color.PINK);
		rdbtnNewRadioButton_2.setBounds(172, 420, 109, 23);
		accountInfoPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("Mobile phone");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(21, 450, 100, 14);
		accountInfoPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(21, 467, 372, 20);
		accountInfoPane.add(textField_6);
		textField_6.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I agree to the Terms of Service");
		chckbxNewCheckBox.setBackground(Color.PINK);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxNewCheckBox.setBounds(31, 494, 201, 23);
		accountInfoPane.add(chckbxNewCheckBox);
		
		//Panel chua nut next
		JPanel buttonPane = new JPanel();
		buttonPane.setPreferredSize(new Dimension(100,50));
		buttonPane.setBackground(Color.WHITE);
		addAcountPane.add(buttonPane, BorderLayout.SOUTH);
		buttonPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setBounds(167, 11, 77, 23);
		buttonPane.add(btnNewButton);
	}
}
