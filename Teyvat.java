import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Teyvat {
	
	private JFrame frmTeyvatLiterature;
	public static void main(String[] args) {
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teyvat window = new Teyvat();
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
	public Teyvat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTeyvatLiterature = new JFrame();
		frmTeyvatLiterature.setTitle("Teyvat Literature");
		frmTeyvatLiterature.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\shann\\Downloads\\PROJECT_ TEYVAT LITERATURE\\tumblr_350e608e12f1bc97576f6dbdfd37cde0_48fa6df8_500.png"));
		frmTeyvatLiterature.setBounds(100, 100, 1200, 700);
		frmTeyvatLiterature.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmTeyvatLiterature.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		
		JLayeredPane layeredPane = new JLayeredPane();
		frmTeyvatLiterature.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton exitButton = new JButton("");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTeyvatLiterature.dispose();
			}
		});
		exitButton.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\LOGIN SCREEN (1).jpg"));
		exitButton.setBounds(444, 589, 297, 61);
		layeredPane.add(exitButton);
		
		JButton loginButton = new JButton("");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn log_in = new LogIn();
				log_in.Login();
			}
		});
		loginButton.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\LOGIN SCREEN.jpg"));
		loginButton.setBounds(444, 477, 297, 61);
		layeredPane.add(loginButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\LOGIN SCREEN (3).png"));
		lblNewLabel.setBounds(0, 0, 1184, 661);
		layeredPane.add(lblNewLabel);    	
    
		/*if (Home()) {
			frmTeyvatLiterature.dispose();	
	}
}
	private boolean Home() {
		return false;*/
	}
}
