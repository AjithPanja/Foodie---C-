import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.Rectangle;
import javax.swing.JFormattedTextField;

public class Hot implements ActionListener{

	JFrame frame;
	private final JPanel panel = new JPanel();
	private JLabel lblNewLabel;
	private Choice choice;
	static Hot window = new Hot();
	JToggleButton tglbtnVeg = new JToggleButton("Select Option");
	/**
	 * Launch the application.
	 */
	public void Newscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public Hot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 1280, 692);
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		
		tglbtnVeg.setFont(new Font("Poor Richard", Font.PLAIN, 20));
		tglbtnVeg.addActionListener(this);
		tglbtnVeg.setBounds(192, 276, 137, 25);
		panel.add(tglbtnVeg);

		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(this);
		btnContinue.setForeground(new Color(233, 150, 122));
		btnContinue.setBackground(Color.WHITE);
		btnContinue.setFont(new Font("NSimSun", Font.BOLD, 20));
		btnContinue.setBounds(1056, 547, 149, 38);
		panel.add(btnContinue);

		choice = new Choice();
		choice.setFont(new Font("Source Code Pro Black", Font.PLAIN, 19));
		choice.setBounds(167, 176, 175, 52);
		choice.add("A2B");
		choice.add("Coal Barbeque");
		choice.add("Arasan");
		panel.add(choice);
		
		JFormattedTextField frmtdtxtfldWelcomeToFoodie = new JFormattedTextField();
		frmtdtxtfldWelcomeToFoodie.setEditable(false);
		frmtdtxtfldWelcomeToFoodie.setBackground(new Color(240, 230, 140));
		frmtdtxtfldWelcomeToFoodie.setHorizontalAlignment(SwingConstants.CENTER);
		frmtdtxtfldWelcomeToFoodie.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		frmtdtxtfldWelcomeToFoodie.setText("Welcome to Foodie!!!");
		frmtdtxtfldWelcomeToFoodie.setBounds(494, 36, 268, 60);
		panel.add(frmtdtxtfldWelcomeToFoodie);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Hot.class.getResource("/image/img_2328.jpg")));
		lblNewLabel.setBounds(0, 0, 1293, 692);
		panel.add(lblNewLabel);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tglbtnVeg)
		{
			if (tglbtnVeg.isSelected()) {
				tglbtnVeg.setText("Veg");
			} else {
				tglbtnVeg.setText("Non-Veg");
			}
		}
		else
		{
		Items i = new Items();
		//Hot window = new Hot();
		window.frame.setVisible(false);
		//window.setVisible(false);
		i.itemsDisplay();
		}
	}

		
}
