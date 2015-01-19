package com.manamement.library;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.EventQueue;
import java.awt.Font;

public class LibraryHome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryHome frame = new LibraryHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LibraryHome() {
		setFont(new Font("Californian FB", Font.BOLD, 13));
		setTitle("Islamic Education Centre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel regestrationPanel = new JPanel();
		regestrationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Registration"));
		tabbedPane.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Registration</body></html>", regestrationPanel);
		
		JPanel renewPanel = new JPanel();
		renewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Renew Student Term"));
		tabbedPane.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Renew Student Term</body></html>", renewPanel);
		
		
		JPanel viewStudentPanel = new JPanel();
		viewStudentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Student"));
		tabbedPane.addTab("<html><body leftmargin=15 topmargin=8 marginwidth=15 marginheight=5>Search Student</body></html>", viewStudentPanel);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
		
		

		
	
		
		
		
		
	}
}
