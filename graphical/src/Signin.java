import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signin extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField textField;

	private JPasswordField passwordField;
	static Signin frame = new Signin();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public Signin() {
		super("Foodie");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 853, 692);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Signin.class.getResource("/image/foodie-apps1.jpg")));
		lblNewLabel_1.setBounds(-19, -48, 873, 727);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(855, 0, 425, 692);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setBackground(Color.LIGHT_GRAY);
		txtUsername.setFont(new Font("Maiandra GD", Font.PLAIN, 18));
		txtUsername.setToolTipText("");
		txtUsername.setBounds(212, 110, 131, 30);
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblHello = new JLabel("UserName");
		lblHello.setBackground(Color.GRAY);
		lblHello.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblHello.setBounds(61, 109, 111, 31);
		panel_1.add(lblHello);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		lblNewLabel.setBounds(61, 188, 111, 30);
		panel_1.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBounds(212, 188, 131, 30);
		panel_1.add(passwordField);
		
		JButton btnSignin = new JButton("Login");
		btnSignin.setSize(131, 40);
		btnSignin.setLocation(146, 332);
		btnSignin.setBackground(new Color(175, 238, 238));
		btnSignin.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
		btnSignin.addActionListener( this );
		panel_1.add(btnSignin);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		String u="admin",p="pass";
		char[] g = passwordField.getPassword();
		g.toString();
		if(u.equals(txtUsername.getText()) || p.equals(g))
		{
		Hot h = new Hot();
		frame.setVisible(false);
		h.Newscreen();
		}
		else
		{
			JOptionPane.showMessageDialog(frame, "Enter Correct Credentials");
		}
	}
}

