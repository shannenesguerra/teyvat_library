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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends LogIn{

	private JFrame frame;
	private JTextField usertxt;
	private JTextField emailtxt;
	private JTextField passwordtxt;
	private JTextField confirmpasstxt;
	

	/**
	 * Launch the application.
	 */
	public void Signup() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
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
		backButton.setHorizontalAlignment(SwingConstants.CENTER);
		backButton.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\back-button.png"));
		backButton.setBounds(512, 11, 50, 56);
		layeredPane.add(backButton);
	
		emailtxt = new JTextField();
		emailtxt.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		emailtxt.setForeground(Color.BLACK);
		emailtxt.setColumns(10);
		emailtxt.setBounds(34, 201, 509, 33);
		layeredPane.add(emailtxt);
		
		usertxt = new JTextField();
		usertxt.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		usertxt.setForeground(Color.BLACK);
		usertxt.setBackground(Color.WHITE);
		usertxt.setBounds(34, 137, 509, 35);
		layeredPane.add(usertxt);
		usertxt.setColumns(10);
		
		passwordtxt = new JTextField();
		passwordtxt.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		passwordtxt.setForeground(Color.BLACK);
		passwordtxt.setColumns(10);
		passwordtxt.setBounds(34, 264, 509, 33);
		layeredPane.add(passwordtxt);
		
		confirmpasstxt = new JTextField();
		confirmpasstxt.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		confirmpasstxt.setForeground(Color.BLACK);
		confirmpasstxt.setColumns(10);
		confirmpasstxt.setBounds(34, 325, 509, 36);
		layeredPane.add(confirmpasstxt);
		
		
		JLabel errorConfirm = new JLabel("");
		errorConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		errorConfirm.setForeground(Color.RED);
		errorConfirm.setFont(new Font("Tahoma", Font.BOLD, 15));
		errorConfirm.setBounds(549, 325, 25, 36);
		layeredPane.add(errorConfirm);
		
		JLabel errorPass = new JLabel("");
		errorPass.setHorizontalAlignment(SwingConstants.CENTER);
		errorPass.setForeground(Color.RED);
		errorPass.setFont(new Font("Tahoma", Font.BOLD, 15));
		errorPass.setBounds(549, 264, 25, 33);
		layeredPane.add(errorPass);
		
		JLabel errorEmail = new JLabel("");
		errorEmail.setHorizontalAlignment(SwingConstants.CENTER);
		errorEmail.setForeground(Color.RED);
		errorEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		errorEmail.setBounds(549, 201, 25, 33);
		layeredPane.add(errorEmail);
		
		JLabel errorUser = new JLabel("");
		errorUser.setHorizontalAlignment(SwingConstants.CENTER);
		errorUser.setForeground(Color.RED);
		errorUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		errorUser.setBounds(549, 137, 25, 35);
		layeredPane.add(errorUser);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setBackground(Color.DARK_GRAY);
		checkBox.setBounds(34, 387, 23, 23);
		layeredPane.add(checkBox);
		
		
		JLabel registerButton = new JLabel("");
		registerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// This method is if the JTextFields is/are empty
				// The asterisk is/are shown depends on what JTextFields is/are empty
				if(emailtxt.getText().isEmpty()) { 
					errorEmail.setText("*");
					errorEmail.setForeground(Color.RED);
				}
				if(usertxt.getText().isEmpty()) {
					errorUser.setText("*");
					errorUser.setForeground(Color.RED);
				}
				if (passwordtxt.getText().isEmpty()) {
					errorPass.setText("*");
					errorPass.setForeground(Color.RED);
				}	
				if (confirmpasstxt.getText().isEmpty()) {
					errorConfirm.setText("*");
					errorConfirm.setForeground(Color.RED); 
					
				} /*else {
					// This method is if the JTextFields are not empty
					emailtxt.setText("");
					emailtxt.setForeground(Color.BLACK);
					
					usertxt.setText("");
					usertxt.setForeground(Color.BLACK);
				
					passwordtxt.setText("");
					passwordtxt.setForeground(Color.BLACK);

					confirmpasstxt.setText("");
					confirmpasstxt.setForeground(Color.BLACK);
				}*/
						// This method is if the JTextFields are not empty
				// The slash (signifies check) is/are shown depends on what JTextFields is/are not empty
				if(!usertxt.getText().isEmpty()) {
					errorUser.setText("/");
					errorUser.setForeground(Color.BLUE);
				}
				if(!emailtxt.getText().isEmpty()) {
					errorEmail.setText("/");
					errorEmail.setForeground(Color.BLUE);
				}
				if (!passwordtxt.getText().isEmpty()) {
					errorPass.setText("/");
					errorPass.setForeground(Color.BLUE);
				}
				if (!confirmpasstxt.getText().isEmpty()) {
					errorConfirm.setText("/");
					errorConfirm.setForeground(Color.BLUE); 
				}
					// This method is if the password and confirm password is not the same
				// The slash and asterisk will show
				if (!passwordtxt.getText().equals(confirmpasstxt.getText())) {
					errorPass.setText("/");
					errorPass.setForeground(Color.BLUE);
					errorConfirm.setText("*");
					errorConfirm.setForeground(Color.RED);
				}
				// This method is if the password and confirm password is not the same
				// A JOptionPane will pop up an error message
				if (!passwordtxt.getText().equals(confirmpasstxt.getText())) {
					JOptionPane.showMessageDialog(null, new ImageIcon("C:\\Users\\shann\\Downloads\\pass_not_match-removebg-preview.png"), 
					null, JOptionPane.ERROR_MESSAGE);
				} 
				
				if(!checkBox.isSelected()) { // if the checkbox is not selected
					JOptionPane.showMessageDialog( // showing an error message
						null, new ImageIcon("C:\\Users\\shann\\Downloads\\agree-removebg-preview.png"),
						null,JOptionPane.OK_OPTION);
				} 
				
				if (!emailtxt.getText().isEmpty() && !usertxt.getText().isEmpty() 
					&& !passwordtxt.getText().isEmpty() && !confirmpasstxt.getText().isEmpty()) { // if the ceredentials are filled
					if (passwordtxt.getText().equals(confirmpasstxt.getText())) { // if the password and confirm password is same
						if(checkBox.isSelected()) { // if the checkbox is selected
							
				// then it will proceed here
				LogIn newAccount = new LogIn(); // calling the LogIn frame to get the arraylist
				String e_mail,user,password;
				e_mail = emailtxt.getText();
				user = usertxt.getText();
				password = passwordtxt.getText();
				// adding the email, user name, and password to the arraylist
				newAccount.email.add(e_mail);
				newAccount.user_name.add(user);
				newAccount.password.add(password);
				// A JOptionPane will pop up if all the JTextFields are filled and the checkbox is checked
				JOptionPane.showMessageDialog(null, new ImageIcon("C:\\Users\\shann\\Downloads\\register_success-removebg-preview.png"));  
				// If all the methods are true then it will proceed to the Login frame
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
					Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
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
					Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
				} catch (URISyntaxException ex) {
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		privacyPolicy.setBounds(431, 387, 120, 23);
		layeredPane.add(privacyPolicy);
		termsOfService.setBounds(284, 387, 137, 23);
		layeredPane.add(termsOfService);
		registerButton.setBounds(81, 442, 415, 39);
		layeredPane.add(registerButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\REGISTER (1) (1).jpg"));
		lblNewLabel.setBounds(-14, 0, 609, 561);
		layeredPane.add(lblNewLabel);
	    
	}
}
