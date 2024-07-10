import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JToggleButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LogIn {

	private JFrame frame;
	private final JLayeredPane layeredPane = new JLayeredPane();
	private final JLabel lblNewLabel = new JLabel("");
	private JTextField enterEmail;
	private JTextField enterPassword = new JTextField();
	private final JLabel register = new JLabel("");
	private final JLabel forgotUser = new JLabel("");
	private final JLabel forgotPass = new JLabel("");
	private final JLabel login_Button = new JLabel("");
	public static ArrayList <String> email = new ArrayList<String>();
	public static ArrayList <String> user_name = new ArrayList<String>();
	public static ArrayList <String> password = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void Login() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void Account() {
	email.add("klarenzdevera@gmail.com");
    user_name.add("klarenz");
    password.add("hotdogsausage");
    
    email.add("shannenesguerra08@gmail.com");
    user_name.add("shannen_16");
    password.add("cheesesaucefries");
	}
	/**
	 * Create the application.
	 */
	public LogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		email.add("klarenzdevera@gmail.com");
	    user_name.add("klarenz");
	    password.add("hotdogsausage");
	    
	    email.add("shannenesguerra08@gmail.com");
	    user_name.add("shannen_16");
	    password.add("cheesesaucefries");
		
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 600, 600);
		frame.setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUp sign_up = new SignUp();
				sign_up.Signup();
				frame.dispose();				
			}
		});
		forgotPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgotPassword forgot_pass = new ForgotPassword();
				forgot_pass.ForgotPass();
				frame.dispose();
			}
		});
		login_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String user, pass;
				user = enterEmail.getText();
				pass = enterPassword.getText();
				if (user_name.contains(user) || email.contains(user)  && password.contains(pass)) {
					JOptionPane.showMessageDialog(null, new ImageIcon("C:\\Users\\shann\\Downloads\\login_success-removebg-preview.png"));
					Home home = new Home();
					home.home();
					frame.dispose();
				}else 
					JOptionPane.showMessageDialog(null, new ImageIcon("C:\\Users\\shann\\Downloads\\invalid_input-removebg-preview.png"),
					pass, JOptionPane.ERROR_MESSAGE);	
		}
		});
		login_Button.setBounds(102, 424, 381, 51);
		
		layeredPane.add(login_Button);
		forgotPass.setBounds(380, 279, 169, 27);
		
		layeredPane.add(forgotPass);
		forgotUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgotUsername forgot_user = new ForgotUsername();
				forgot_user.ForgotUser();
				frame.dispose();
			}
		});
		forgotUser.setBounds(208, 279, 162, 27);
		
		layeredPane.add(forgotUser);
		register.setBounds(49, 279, 122, 27);
		
		layeredPane.add(register);
		enterPassword = new JTextField();
		enterPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (enterPassword.getText().equals(" Enter password")) {
					enterPassword.setText("");
					//enterPassword.getText().replaceAll("[a-zA-z][0-9]", "*");
					enterPassword.setForeground(Color.BLACK);
				}	
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (enterPassword.getText().equals("")) {
					enterPassword.setText(" Enter password");
					enterPassword.setForeground(new Color(192, 192, 192));
				}
			}
		});
		enterPassword.setForeground(new Color(192, 192, 192));
		enterPassword.setText(" Enter password");
		enterPassword.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		enterPassword.setBounds(63, 231, 458, 27);
		enterPassword.setColumns(10);
		
		layeredPane.add(enterPassword);
		
		enterEmail = new JTextField();
		enterEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (enterEmail.getText().equals(" Enter e-mail/username")) {
					enterEmail.setText("");
					enterEmail.setForeground(Color.BLACK);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (enterEmail.getText().equals("")) {
					enterEmail.setText(" Enter e-mail/username");
					enterEmail.setForeground(new Color(192, 192, 192));
				}
			}
		});
		enterEmail.setForeground(new Color(192, 192, 192));
		enterEmail.setText(" Enter e-mail/username");
		enterEmail.setToolTipText("");
		enterEmail.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		enterEmail.setBounds(63, 178, 458, 27);
		layeredPane.add(enterEmail);
		enterEmail.setColumns(10);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shann\\Downloads\\LOGIN (1).jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 584, 561);
		
		layeredPane.add(lblNewLabel);
	    
		
	}
}
