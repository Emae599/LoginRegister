import javax.swing.*;
import custom.PasswordFieldCustom;
import custom.TextFieldCustom;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;

public class homepage extends homepageform implements ActionListener{
	
    
	 public homepage(){
	        super("");
	        addGuiComponents();

	    }
	    private void addGuiComponents() {
	    	JLabel LOGIN = new JLabel("LOGIN");
	        LOGIN.setBounds(520, 10, 140, 140);
	        LOGIN.setForeground(Color.WHITE);
	        LOGIN.setFont(new Font("Segoe UI", Font.BOLD, 36));
	        LOGIN.setHorizontalAlignment(SwingConstants.CENTER);
	        add(LOGIN);
	        
	        JLabel NumberMail = new JLabel("Enter Phone Number/E-Mail");
	        NumberMail.setBounds(406,160, 200, 15);
	        NumberMail.setForeground(Color.WHITE);
	        NumberMail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        NumberMail.setHorizontalAlignment(SwingConstants.CENTER);
	        add(NumberMail);
	        
	        // Phone Number/Email Account field
	        TextFieldCustom usernameField = new TextFieldCustom("",14);
	        usernameField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        usernameField.setBackground(Color.WHITE);
	        usernameField.setForeground(Color.BLACK);
	        usernameField.setBorder(null);
	        usernameField.setBounds(420, 180,350, 30);
	        
	        add(usernameField);
	        
	        JLabel password = new JLabel("Password");
	        password.setBounds(400,230, 100, 15);
	        password.setForeground(Color.WHITE);
	        password.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        password.setHorizontalAlignment(SwingConstants.CENTER);
	        add(password);
	        
	        PasswordFieldCustom passwordField = new PasswordFieldCustom("", 14);
	        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        passwordField.setForeground(Color.WHITE);
	        passwordField.setForeground(Color.BLACK);
	        passwordField.setBounds(420, 250,350, 30);
	        passwordField.setBorder(null);
	        
	        add(passwordField);
	        
	        // login button
	        JButton loginButton = new JButton("Login");
	        loginButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        loginButton.setBackground(CommonConstants.BUTTON_COLOR);
	        loginButton.setForeground(Color.WHITE);
	        loginButton.setBounds(417, 320,350, 30);
	        loginButton.addActionListener(this);
	        add(loginButton);
	        // login -> register label
	        JLabel registerLabel = new JLabel("Sign up Here!");
	        registerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        registerLabel.setForeground(Color.green);
	        registerLabel.setBounds(435, 350,100,50);
	        add(registerLabel);
	        
	        
	        registerLabel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                dispose();
	                new RegisterGui().setVisible(true);
	            }

	            @Override
	            public void mouseEntered(MouseEvent e) {
	                registerLabel.setForeground(new Color(57,155,83));
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	                registerLabel.setForeground(CommonConstants.SECONDARY_COLOR);
	            }
	        });
	        
	        
	        JLabel copyright = new JLabel("copyright © Effortless Loan Management Solution. All rights reserved");
	        copyright.setBounds(26,300, 400, 140);
	        copyright.setForeground(Color.GRAY);
	        copyright.setFont(new Font("Segoe UI", Font.PLAIN, 11));
	        copyright.setHorizontalAlignment(SwingConstants.LEFT);
	        add(copyright);
	    	
	    	JLabel loginImage = CustomTools.loadImage(CommonConstants.LOGIN_IMAGE_PATH);
	    	loginImage.setBounds(3,30,CommonConstants.LOGIN_IMAGE_SIZE.width, CommonConstants.LOGIN_IMAGE_SIZE.height);
	    	loginImage.setForeground(CommonConstants.BUTTON_COLOR);
	    	loginImage.setHorizontalAlignment(SwingConstants.LEFT);
	        add(loginImage);

	        JLabel RIGHT = CustomTools.loadImage(CommonConstants.RIGHT_PATH);
	        RIGHT.setBounds(400,0,CommonConstants.RIGHT_SIZE.width, CommonConstants.RIGHT_SIZE.height);
	        RIGHT.setForeground(CommonConstants.BUTTON_COLOR);
	        RIGHT.setFont(new Font("Dialog", Font.BOLD, 50));
	        RIGHT.setHorizontalAlignment(SwingConstants.RIGHT);
	        add(RIGHT);
	        
	        
	        
	     
	    }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	        //new time menu for the time selection mode
/*
	        JButton time = new JButton("hello");
	        time.setFont(new Font("Dialog", Font.PLAIN, 18));

	        time.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        time.setBackground(CommonConstants.BUTTON_COLOR);
	        time.setBounds(30, 200, 400,25);
	        time.setBackground(Color.WHITE);
	        time.setForeground(Color.BLACK);
	        //reserved space for database
	       
	        JButton SEC = new JButton("PAYMENT");
	        SEC.setFont(new Font("Dialog", Font.PLAIN, 18));

	        SEC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        SEC.setBackground(CommonConstants.BUTTON_COLOR);
	        SEC.setBounds(30, 200, 400,25);
 



	        add(time);
	        add(SEC);
*/
