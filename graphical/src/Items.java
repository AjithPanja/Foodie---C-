import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JTextArea;

import Foods.nonveg;
import Foods.veg;

import javax.swing.JMenuItem;
import java.awt.Choice;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Items extends Hot{
	static int k =0;
	private JFrame frame;
	Choice choice = new Choice();
	static Items window2 = new Items();
	/**
	 * Launch the application.
	 */
	public void itemsDisplay() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					window2.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Items() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(247, 157, 54, 31);
		frame.getContentPane().add(spinner);
		
		
		choice.setBackground(Color.WHITE);
		choice.setBounds(60, 157, 148, 31);
		frame.getContentPane().add(choice);
		addItems();
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				window.frame.setVisible(true);
				window2.frame.setVisible(false);
			}
		});
		btnBack.setBounds(1084, 552, 117, 25);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Items.class.getResource("/image/4454039-food-wallpapers.jpg")));
		lblNewLabel.setBounds(-305, 0, 1604, 688);
		frame.getContentPane().add(lblNewLabel);
	}
	public void addItems()
	{System.out.println(tglbtnVeg.getText());
		if(tglbtnVeg.isSelected())
		{
		veg v = new veg();
		v.display_veg();
		for(int i=0;v.items_veg[i]!=null;i++)
		{
			choice.add(v.items_veg[i]);
		}
		}
		else
		{
			nonveg nv = new nonveg();
			nv.display_nonveg();
			for(int i=0;nv.items_nonveg[i]!=null;i++)
			{
				choice.add(nv.items_nonveg[i]);
			}
		}
	}
}
