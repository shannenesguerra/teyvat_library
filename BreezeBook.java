import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class BreezeBook {

	private JFrame frmTeyvatLiterature;

	/**
	 * Launch the application.
	 */
	public static void breeze() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreezeBook window = new BreezeBook();
					window.frmTeyvatLiterature.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BreezeBook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTeyvatLiterature = new JFrame();
		frmTeyvatLiterature.setTitle("Teyvat Literature");
		frmTeyvatLiterature.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\shann\\Downloads\\PROJECT_ TEYVAT LITERATURE\\tumblr_350e608e12f1bc97576f6dbdfd37cde0_48fa6df8_500.png"));
		frmTeyvatLiterature.getContentPane().setBackground(Color.WHITE);
		frmTeyvatLiterature.setBounds(100, 100, 1200, 720);
		frmTeyvatLiterature.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTeyvatLiterature.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.WHITE);
		frmTeyvatLiterature.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel back_button = new JLabel("");
		back_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.home();
				frmTeyvatLiterature.dispose();
			}
		});
		back_button.setBounds(0, 11, 103, 104);
		layeredPane.add(back_button);
		
		JPanel breeze_vol1 = new JPanel();
		breeze_vol1.setBackground(Color.WHITE);
		breeze_vol1.setBounds(0, 0, 1184, 661);
		layeredPane.add(breeze_vol1);
		
		JPanel breeze_vol2 = new JPanel();
		breeze_vol2.setBackground(Color.WHITE);
		breeze_vol2.setBounds(0, 0, 1184, 661);
		layeredPane.add(breeze_vol2);
		breeze_vol1.setLayout(null);
				
		JLabel vol1 = new JLabel("");
		vol1.setBounds(-8, 5, 1200, 700);
		vol1.setVerticalAlignment(SwingConstants.TOP);
		vol1.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\breeze_vol1.png"));
		vol1.setHorizontalAlignment(SwingConstants.CENTER);
		breeze_vol1.add(vol1);
		
		JButton vol2_button1 = new JButton("");
		vol2_button1.setBorderPainted(false);
		vol2_button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(breeze_vol2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol2_button1.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol2_button.jpg"));
		vol2_button1.setBounds(20, 267, 226, 43);
		breeze_vol1.add(vol2_button1);
		
		JLabel back_button_1 = new JLabel("");
		back_button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.home();
				frmTeyvatLiterature.dispose();
			}
		});
		back_button_1.setBounds(0, 0, 103, 104);
		breeze_vol1.add(back_button_1);
		breeze_vol2.setLayout(null);
		
		JLabel vol2 = new JLabel("");
		vol2.setBounds(-8, 5, 1200, 700);
		vol2.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\breeze_vol2 (1).png"));
		vol2.setHorizontalAlignment(SwingConstants.CENTER);
		breeze_vol2.add(vol2);	
		
		JButton vol1_button2 = new JButton("");
		vol1_button2.setBorderPainted(false);
		vol1_button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(breeze_vol1);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol1_button2.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol1_button.jpg"));
		vol1_button2.setBounds(20, 223, 223, 39);
		breeze_vol2.add(vol1_button2);
		
		JLabel back_button_2 = new JLabel("");
		back_button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.home();
				frmTeyvatLiterature.dispose();
			}
		});
		back_button_2.setBounds(0, 0, 103, 104);
		breeze_vol2.add(back_button_2);
	}
}
