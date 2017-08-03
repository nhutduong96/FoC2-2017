import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
public class Ex1_T153706_Nhut extends JFrame{
	//Field - Instance Variable
	JLabel lblUsername;
	JTextField txtUsername;
	private JPasswordField txtPassword;
	//Hàm dựng - Constructor
	public Ex1_T153706_Nhut(){
		getContentPane().setBackground(Color.PINK);
		getContentPane().setLayout(null);
		JLabel lblUsername = new JLabel("User name");
		lblUsername.setLocation(30,50);
		lblUsername.setSize(80,30);
		getContentPane().add(lblUsername);
		JTextField txtUsername = new JTextField ();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtUsername.setBackground(new Color(153, 255, 153, 100));
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtUsername.setBackground(Color.WHITE);
			}
		});
		txtUsername.setLocation(30,80);
		txtUsername.setSize(158,20);
		getContentPane().add(txtUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(30, 111, 46, 14);
		getContentPane().add(lblPassword);
		
		JCheckBox chckbxRememberMe = new JCheckBox("Remember Me");
		chckbxRememberMe.setBounds(40, 163, 97, 23);
		getContentPane().add(chckbxRememberMe);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userName = txtUsername.getText();
				char[] passArray = txtPassword.getPassword();
				String password = new String(passArray);
				if(userName.equals("admin")&& password.equals("root")){
						JOptionPane.showMessageDialog(Ex1_T153706_Nhut.this,"Hello"+userName);
				}else{
					JOptionPane.showMessageDialog(Ex1_T153706_Nhut.this,"Fail :(("+userName);

				}
			}
		});
		btnLogin.setBounds(63, 212, 89, 23);
		getContentPane().add(btnLogin);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(81, 11, 71, 34);
		getContentPane().add(lblLogin);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(30, 136, 158, 20);
		getContentPane().add(txtPassword);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args){
		Ex1_T153706_Nhut gui = new Ex1_T153706_Nhut();
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(400,300);
		
	}
}

