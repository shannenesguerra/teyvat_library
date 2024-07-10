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
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home {

	private JFrame frmTeyvatLiterature;

	/**
	 * Launch the application.
	 */
	public static void home() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
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
		
		JLabel moonlit = new JLabel("");
		moonlit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MoonlitBook moonlit = new MoonlitBook();
				moonlit.moonlit();
				frmTeyvatLiterature.dispose();
			}
		});
		
		JLabel backbutton = new JLabel("");
		backbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Teyvat teyvat = new Teyvat();
				teyvat.main(null);
				frmTeyvatLiterature.dispose();
			}
		});
		backbutton.setBounds(10, 11, 86, 68);
		layeredPane.add(backbutton);
		moonlit.setBounds(605, 353, 150, 143);
		layeredPane.add(moonlit);
		
		JLabel legend = new JLabel("");
		legend.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LegendBook legend = new LegendBook();
				legend.legend();
				frmTeyvatLiterature.dispose();
			}
		});
		legend.setBounds(445, 353, 150, 143);
		layeredPane.add(legend);
		
		JLabel hearts_desire = new JLabel("");
		hearts_desire.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HeartsDesireBook heart_desire = new HeartsDesireBook();
				heart_desire.heartsDesire();
				frmTeyvatLiterature.dispose();	
			}
		});
		hearts_desire.setBounds(262, 353, 150, 143);
		layeredPane.add(hearts_desire);
		
		JLabel heart = new JLabel("");
		heart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HeartBook heart = new HeartBook();
				heart.heart();
				frmTeyvatLiterature.dispose();	
			}
		});
		heart.setBounds(77, 353, 150, 143);
		layeredPane.add(heart);
		
		JLabel customs = new JLabel("");
		customs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CustomsBook customs = new CustomsBook();
				customs.customs();
				frmTeyvatLiterature.dispose();	
			}
		});
		customs.setBounds(577, 129, 150, 143);
		layeredPane.add(customs);
		
		JLabel breeze = new JLabel("");
		breeze.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BreezeBook breeze = new BreezeBook();
				breeze.breeze();
				frmTeyvatLiterature.dispose();	
			}
		});
		breeze.setBounds(407, 129, 150, 143);
		layeredPane.add(breeze);
		
		JLabel ballads = new JLabel("");
		ballads.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BalladsBook ballads = new BalladsBook();
				ballads.ballads();
				frmTeyvatLiterature.dispose();				
			}
		});
		ballads.setBounds(247, 129, 150, 143);
		layeredPane.add(ballads);
		
		JLabel drunkards = new JLabel("");
		drunkards.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DrunkardsBook drunkards = new DrunkardsBook();
				drunkards.drunkards();
				frmTeyvatLiterature.dispose();
			}
		});
		drunkards.setBounds(77, 129, 150, 143);
		layeredPane.add(drunkards);
		
		JLabel Paimon = new JLabel("");
		Paimon.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\PROJECT_ TEYVAT LITERATURE\\PAIMON MAIN MENU.gif"));
		Paimon.setHorizontalAlignment(SwingConstants.CENTER);
		Paimon.setBounds(792, 97, 392, 450);
		layeredPane.add(Paimon);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\156461277_203227271579373_6478615527155613988_n.png__nc_cat=104&ccb=1-3&_nc_sid=ae9488&_nc_eui2=AeHF9hSqOOCIWafHid45kmb_amhhwUpexM1qaGHBSl7EzR9zT4FdtjUACamjvysHVwJ9WGqHlMkt8QGySr_hKE2L&_nc_ohc=uvQA5wD-QzYAX96Lgk3&_.png"));
		lblNewLabel.setBounds(0, 0, 1184, 661);
		layeredPane.add(lblNewLabel);

	    
	}
}
