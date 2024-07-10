import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class ForgotUsername {

	private JFrame frame;
	private JTextField txtEmail;
	private JPasswordField txtEnterPassword;
	private JPasswordField txtConfirmPassword;

	/**
	 * Launch the application.
	 */
	public static void ForgotUser() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotUsername window = new ForgotUsername();
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
	public ForgotUsername() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 600, 600);
		frame.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel backButton = new JLabel("");
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LogIn log_in = new LogIn();
				log_in.Login();
				frame.dispose();
			}
		});
		
		JLabel showPassword = new JLabel(" Show Password");
		showPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		showPassword.setBounds(52, 199, 107, 14);
		layeredPane.add(showPassword);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					txtEnterPassword.setEchoChar((char)0);
					txtConfirmPassword.setEchoChar((char)0);
				} else {
					txtEnterPassword.setEchoChar('*');
					txtConfirmPassword.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(34, 199, 23, 15);
		layeredPane.add(chckbxNewCheckBox);
		backButton.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\back-button.png"));
		backButton.setHorizontalAlignment(SwingConstants.CENTER);
		backButton.setBounds(503, 11, 59, 59);
		layeredPane.add(backButton);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setBackground(Color.DARK_GRAY);
		checkBox.setBounds(34, 270, 23, 23);
		layeredPane.add(checkBox);
		
		JLabel enter = new JLabel("");
		enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(!checkBox.isSelected()) {
					JOptionPane.showMessageDialog(
							null, new ImageIcon("C:\\Users\\shann\\Downloads\\agree-removebg-preview.png"),
							null,JOptionPane.OK_OPTION);
				} 
				
				
				if (!txtEnterPassword.getText().equals(txtConfirmPassword.getText())) {
					JOptionPane.showMessageDialog(null, new ImageIcon("C:\\Users\\shann\\Downloads\\pass_not_match-removebg-preview.png"));
				}
				LogIn newPass = new LogIn();
				String email, pass;
				email = txtEmail.getText();
				pass = txtEnterPassword.getText();
				
				if (!newPass.email.contains(email) && !newPass.password.contains(pass)) {
					JOptionPane.showMessageDialog(null, new ImageIcon("C:\\Users\\shann\\Downloads\\invalid_input-removebg-preview.png"));
				}
				
				if (newPass.email.contains(email) && newPass.password.contains(pass)) {
					if (txtEnterPassword.getText().equals(txtConfirmPassword.getText())) {
						if(checkBox.isSelected()) {
				
						JOptionPane.showMessageDialog(null, new ImageIcon("C:\\Users\\shann\\Downloads\\success (2).png"));
						LogIn log_in = new LogIn();
						log_in.Login();
						frame.dispose();
						}
					}
				}
			}
		});
		
		JLabel termsOfService = new JLabel("");
		termsOfService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL ("https://genshin.mihoyo.com/en/company/terms").toURI());
				} catch (MalformedURLException ex) {
					Logger.getLogger(ForgotUsername.class.getName()).log(Level.SEVERE, null, ex);
				} catch (URISyntaxException ex) {
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JLabel privacyPolicy = new JLabel("");
		privacyPolicy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL ("https://genshin.mihoyo.com/en/company/privacy").toURI());
				} catch (MalformedURLException ex) {
					Logger.getLogger(ForgotUsername.class.getName()).log(Level.SEVERE, null, ex);
				} catch (URISyntaxException ex) {
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		txtConfirmPassword = new JPasswordField();
		txtConfirmPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtConfirmPassword.getText().equals(" Confirm password")) {
					txtConfirmPassword.setEchoChar('*');
					txtConfirmPassword.setText("");
					txtConfirmPassword.setForeground(Color.BLACK);
					txtConfirmPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtConfirmPassword.getText().equals("")) {
					txtConfirmPassword.setText(" Confirm password");
					txtConfirmPassword.setEchoChar((char)0);
					txtConfirmPassword.setForeground(new Color(192, 192, 192));
					txtConfirmPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
				}
			}
		});
		
		txtConfirmPassword.setBounds(31, 221, 523, 28);
		layeredPane.add(txtConfirmPassword);
		txtConfirmPassword.setColumns(10);
		
		txtEnterPassword = new JPasswordField();
		txtEnterPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtEnterPassword.getText().equals(" Enter password")) {
					txtEnterPassword.setEchoChar('*');
					txtEnterPassword.setText("");
					txtEnterPassword.setForeground(Color.BLACK);
					txtEnterPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtEnterPassword.getText().equals("")) {
					txtEnterPassword.setEchoChar((char)0);
					txtEnterPassword.setText(" Enter password");
					txtEnterPassword.setForeground(new Color(192, 192, 192));
					txtEnterPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
				}
			}
		});
		
		txtEnterPassword.setBounds(31, 164, 523, 28);
		layeredPane.add(txtEnterPassword);
		txtEnterPassword.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtEmail.getText().equals(" Email")) {
					txtEmail.setText("");
					txtEmail.setForeground(Color.BLACK);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtEmail.getText().equals("")) {
					txtEmail.setText(" Email");
					txtEmail.setForeground(new Color(192, 192, 192));
				}
			}
		});
		txtEmail.setForeground(new Color(192, 192, 192));
		txtEmail.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		txtEmail.setText(" Email");
		txtEmail.setBounds(31, 112, 523, 28);
		layeredPane.add(txtEmail);
		txtEmail.setColumns(10);
		privacyPolicy.setBounds(447, 270, 115, 23);
		layeredPane.add(privacyPolicy);
		termsOfService.setBounds(290, 270, 137, 23);
		layeredPane.add(termsOfService);
		enter.setBounds(77, 452, 431, 41);
		layeredPane.add(enter);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\FORGOT USERNAME.jpg"));
		lblNewLabel.setBounds(0, 0, 584, 561);
		layeredPane.add(lblNewLabel);    
		
	}
}
