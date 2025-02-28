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

public class HeartsDesireBook {

	private JFrame frmTeyvatLiterature;
	private JLabel vol3;

	/**
	 * Launch the application.
	 */
	public static void heartsDesire() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeartsDesireBook window = new HeartsDesireBook();
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
	public HeartsDesireBook() {
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
		
		JPanel heartdesire_vol1 = new JPanel();
		heartdesire_vol1.setBackground(Color.WHITE);
		heartdesire_vol1.setBounds(0, 0, 1184, 661);
		layeredPane.add(heartdesire_vol1);
		
		JPanel heartdesire_vol2 = new JPanel();
		heartdesire_vol2.setBackground(Color.WHITE);
		heartdesire_vol2.setBounds(0, 0, 1184, 661);
		layeredPane.add(heartdesire_vol2);
		
		JPanel heartdesire_vol3 = new JPanel();
		heartdesire_vol3.setBackground(Color.WHITE);
		heartdesire_vol3.setBounds(0, 0, 1184, 661);
		layeredPane.add(heartdesire_vol3);
		
		JPanel heartdesire_vol4 = new JPanel();
		heartdesire_vol4.setBackground(Color.WHITE);
		heartdesire_vol4.setBounds(0, 0, 1184, 661);
		layeredPane.add(heartdesire_vol4);
		heartdesire_vol1.setLayout(null);
				
		JLabel vol1 = new JLabel("");
		vol1.setBounds(-8, 5, 1200, 700);
		vol1.setVerticalAlignment(SwingConstants.TOP);
		vol1.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\heartdesire_vol1 (1).png"));
		vol1.setHorizontalAlignment(SwingConstants.CENTER);
		heartdesire_vol1.add(vol1);
		
		JButton vol2_button1 = new JButton("");
		vol2_button1.setBorderPainted(false);
		vol2_button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol2_button1.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol2_button.jpg"));
		vol2_button1.setBounds(20, 267, 226, 43);
		heartdesire_vol1.add(vol2_button1);
		
		JButton vol3_button1 = new JButton("");
		vol3_button1.setBorderPainted(false);
		vol3_button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol3_button1.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol3_button.jpg"));
		vol3_button1.setBounds(20, 313, 226, 43);
		heartdesire_vol1.add(vol3_button1);
		
		JButton vol4_button1 = new JButton("");
		vol4_button1.setBorderPainted(false);
		vol4_button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol4_button1.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol4_button.jpg"));
		vol4_button1.setBounds(20, 360, 226, 43);
		heartdesire_vol1.add(vol4_button1);
		
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
		heartdesire_vol1.add(back_button_1);
		heartdesire_vol2.setLayout(null);
		
		JLabel vol2 = new JLabel("");
		vol2.setBounds(-8, 5, 1200, 700);
		vol2.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\hearts_desire_vol2.png"));
		vol2.setHorizontalAlignment(SwingConstants.CENTER);
		heartdesire_vol2.add(vol2);	
		
		JButton vol1_button2 = new JButton("");
		vol1_button2.setBorderPainted(false);
		vol1_button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol1);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol1_button2.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol1_button.jpg"));
		vol1_button2.setBounds(20, 223, 223, 39);
		heartdesire_vol2.add(vol1_button2);
		
		JButton vol3_button2 = new JButton("");
		vol3_button2.setBorderPainted(false);
		vol3_button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol3_button2.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol3_button.jpg"));
		vol3_button2.setBounds(20, 319, 223, 39);
		heartdesire_vol2.add(vol3_button2);
		
		JButton vol4_button2 = new JButton("");
		vol4_button2.setBorderPainted(false);
		vol4_button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol4_button2.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol4_button.jpg"));
		vol4_button2.setBounds(20, 366, 223, 39);
		heartdesire_vol2.add(vol4_button2);
		
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
		heartdesire_vol2.add(back_button_2);
		heartdesire_vol3.setLayout(null);
		
		vol3 = new JLabel("");
		vol3.setBounds(-8, 5, 1200, 700);
		vol3.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\heartdesire_vol3 (1).png"));
		vol3.setHorizontalAlignment(SwingConstants.CENTER);
		heartdesire_vol3.add(vol3);
		
		JButton vol1_button3 = new JButton("");
		vol1_button3.setBorderPainted(false);
		vol1_button3.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol1_button.jpg"));
		vol1_button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol1);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol1_button3.setBounds(20, 216, 223, 47);
		heartdesire_vol3.add(vol1_button3);
		
		JButton vol2_button3 = new JButton("");
		vol2_button3.setBorderPainted(false);
		vol2_button3.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol2_button.jpg"));
		vol2_button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol2_button3.setBounds(20, 263, 223, 47);
		heartdesire_vol3.add(vol2_button3);
		
		JButton vol4_button3 = new JButton("");
		vol4_button3.setBorderPainted(false);
		vol4_button3.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol4_button.jpg"));
		vol4_button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol4);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol4_button3.setBounds(20, 365, 223, 37);
		heartdesire_vol3.add(vol4_button3);
		
		JLabel back_button_3 = new JLabel("");
		back_button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.home();
				frmTeyvatLiterature.dispose();
			}
		});
		back_button_3.setBounds(0, 0, 103, 104);
		heartdesire_vol3.add(back_button_3);
		heartdesire_vol4.setLayout(null);
		
		JLabel vol4 = new JLabel("");
		vol4.setBounds(-8, 5, 1200, 700);
		vol4.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\hearts_desire_vol4.png"));
		vol4.setHorizontalAlignment(SwingConstants.CENTER);
		heartdesire_vol4.add(vol4);
		
		JButton vol1_button4 = new JButton("");
		vol1_button4.setBorderPainted(false);
		vol1_button4.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol1_button.jpg"));
		vol1_button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol1);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol1_button4.setBounds(20, 217, 225, 50);
		heartdesire_vol4.add(vol1_button4);
		
		JButton vol2_button4 = new JButton("");
		vol2_button4.setBorderPainted(false);
		vol2_button4.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol2_button.jpg"));
		vol2_button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol2_button4.setBounds(20, 268, 225, 43);
		heartdesire_vol4.add(vol2_button4);
		
		JButton vol3_button4 = new JButton("");
		vol3_button4.setBorderPainted(false);
		vol3_button4.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\vol3_button.jpg"));
		vol3_button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(heartdesire_vol3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		vol3_button4.setBounds(20, 312, 225, 43);
		heartdesire_vol4.add(vol3_button4);
		
		JLabel back_button_4 = new JLabel("");
		back_button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home home = new Home();
				home.home();
				frmTeyvatLiterature.dispose();
			}
		});
		back_button_4.setBounds(0, 0, 103, 104);
		heartdesire_vol4.add(back_button_4);
	}
}
