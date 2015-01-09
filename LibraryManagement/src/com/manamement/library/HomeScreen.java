package com.manamement.library;

import java.awt.EventQueue;
import java.awt.KeyboardFocusManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AbstractDocument;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JTextArea;

import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JDateChooser;

import javax.swing.JInternalFrame;

public class HomeScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static JPanel contentPane;
	protected JTextField textFirstName;
	protected JTextField textLastName;
	private JTextField textCellNo;
	private JTextField textEmail;
	private JTextField textEducation;
	private JTextField textInsName;
	private JTextField textMemPeriod;
	private JTextField textAmountPaid;
	private JDateChooser textDob;
	private JDateChooser textFrom;
	private JDateChooser textTo;
	private JYearChooser yearChooser;
	private JTextArea textResAddress;
	private JTextArea textInsAddress;
	private File studentImageFile;
	private FileNameExtensionFilter filter;
	private JLabel imageLabel;
	private String imagePath = null; 
	byte b[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen frame = new HomeScreen();
					frame.setSize(800, 500);
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
	public HomeScreen() {
		setTitle("Library Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFirstName = new JTextField();
		textFirstName.setToolTipText("");
		textFirstName.setBounds(99, 11, 130, 20);
		contentPane.add(textFirstName);
		textFirstName.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 11, 61, 20);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(267, 14, 61, 14);
		contentPane.add(lblLastName);
		 
		textLastName = new JTextField();
		textLastName.setToolTipText("");
		textLastName.setBounds(362, 11, 130, 20);
		contentPane.add(textLastName);
		textLastName.setColumns(10);
		
		JLabel lblCellNo = new JLabel("Cell No.");
		lblCellNo.setBounds(10, 48, 46, 14);
		contentPane.add(lblCellNo);
		
		textCellNo = new JTextField();
		textCellNo.setBounds(99, 45, 130, 20);
		((AbstractDocument)textCellNo.getDocument()).setDocumentFilter(new NumericAndLengthFilter(10));
		contentPane.add(textCellNo);

		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(267, 48, 46, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(362, 42, 130, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DOB");
		lblNewLabel.setBounds(10, 82, 51, 14);
		contentPane.add(lblNewLabel);
		
		textDob = new JDateChooser();
		//textDob.setCalendar(Calendar.getInstance());
		//((JTextFieldDateEditor)jDateChooser3.getDateEditor()).setEditable(false);
		textDob.setDateFormatString("yyyy-MM-dd");
		textDob.setBounds(99, 76, 130, 20);
		contentPane.add(textDob);
		
		JLabel lblEducation = new JLabel("Education");
		lblEducation.setBounds(267, 76, 60, 14);
		contentPane.add(lblEducation);
		
		textEducation = new JTextField();
		textEducation.setBounds(362, 73, 130, 20);
		contentPane.add(textEducation);
		textEducation.setColumns(10);
		
		JLabel lblInstitutionName = new JLabel("<html>Institution<br>Name</html>");
		lblInstitutionName.setBounds(10, 105, 92, 39);
		contentPane.add(lblInstitutionName);
		
		textInsName = new JTextField();
		textInsName.setBounds(99, 107, 130, 20);
		contentPane.add(textInsName);
		textInsName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Year");
		lblNewLabel_1.setBounds(267, 116, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		yearChooser = new JYearChooser();
		yearChooser.setBounds(362, 113, 47, 20);
		JSpinner spinner = (JSpinner)yearChooser.getSpinner();
		((javax.swing.JTextField)spinner.getEditor()).setEditable(false);
		contentPane.add(yearChooser);
		
		JLabel lblResidentialAddress = new JLabel("<html>Residential<br>\r\nAddress</html>");
		lblResidentialAddress.setBounds(10, 189, 74, 28);
		contentPane.add(lblResidentialAddress);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(99, 160, 130, 90);
		contentPane.add(scrollPane);
		
		textResAddress = new JTextArea();
		scrollPane.setViewportView(textResAddress);
		textResAddress.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
		textResAddress.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
		textResAddress.setRows(5);
		textResAddress.setLineWrap(true);
		
		JLabel lblinstitutionAddress = new JLabel("<html>Institution<br>\r\nAddress</html>");
		lblinstitutionAddress.setBounds(267, 189, 74, 28);
		contentPane.add(lblinstitutionAddress);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(362, 160, 130, 90);
		contentPane.add(scrollPane_1);
		
		textInsAddress = new JTextArea();
		scrollPane_1.setViewportView(textInsAddress);
		textInsAddress.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, null);
		textInsAddress.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, null);
		textInsAddress.setRows(5);
		textInsAddress.setLineWrap(true);
		
		JLabel lblMembershipGrantedFor = new JLabel("<html>Membership<br>Granted for<br>term</html>");
		lblMembershipGrantedFor.setBounds(10, 258, 124, 53);
		contentPane.add(lblMembershipGrantedFor);
		
		textMemPeriod = new JTextField();
		textMemPeriod.setBounds(99, 267, 130, 20);
		contentPane.add(textMemPeriod);
		textMemPeriod.setColumns(10);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid");
		lblAmountPaid.setBounds(267, 270, 85, 14);
		contentPane.add(lblAmountPaid);
		
		textAmountPaid = new JTextField();
		textAmountPaid.setBounds(362, 267, 130, 20);
		((AbstractDocument)textAmountPaid.getDocument()).setDocumentFilter(new NumericAndLengthFilter(5));
		contentPane.add(textAmountPaid);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(10, 327, 46, 14);
		contentPane.add(lblFrom);
		
		textFrom = new JDateChooser();
		textFrom.setDateFormatString("yyyy-MM-dd");
		textFrom.setBounds(99, 321, 130, 20);
		contentPane.add(textFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(274, 327, 25, 14);
		contentPane.add(lblTo);
		
		textTo = new JDateChooser();
		textTo.setDateFormatString("yyyy-MM-dd");
		textTo.setBounds(362, 321, 130, 20);
		contentPane.add(textTo);
		
		//----------------
		JButton btnNewButton = new JButton("Browse Image");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					JFileChooser browseImage = new  JFileChooser(new File("E:\\"));
					browseImage.setMultiSelectionEnabled(false);
					browseImage.setVisible(true);
					browseImage.showOpenDialog(HomeScreen.this);
			
					filter = new FileNameExtensionFilter("jpeg and png files", "jpg", "png");
					browseImage.addChoosableFileFilter(filter);
					
					studentImageFile = browseImage.getSelectedFile();
					imagePath=studentImageFile.getPath();
					
					if (imagePath != null) {
						imageLabel.setIcon(new ImageIcon(imagePath));
						FileInputStream fileInputStream = new FileInputStream(imagePath);
						b = new byte[fileInputStream.available()];
						fileInputStream.read(b);
						fileInputStream.close();
					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage(),
							"Error", JOptionPane.ERROR_MESSAGE);
				}	
			}
		});
		btnNewButton.setBounds(99, 364, 130, 23);
		contentPane.add(btnNewButton);
		
		//--------------
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textFirstName.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter First Name");
				}else if(textLastName.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter Last Name");
				}else if(textCellNo.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter Cell Number");
				}else if(textEmail.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter Email Address");
				}else if(((JTextField)textDob.getDateEditor().getUiComponent()).getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Please enter DOB");
				}else if(textEducation.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter Education");
				}else if(textInsName.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter Institution Name");
				}else if(yearChooser.getValue()==1){
					JOptionPane.showMessageDialog(null, "Please enter Education Year");
				}else if(textResAddress.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter your Residential Address");
				}else if(textInsAddress.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter your Institute Address");
				}else if(textMemPeriod.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter Membership Granted term");
				}else if(textAmountPaid.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please enter Amount Paid");
				}else if(((JTextField)textFrom.getDateEditor().getUiComponent()).getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Please select date in From field");
				}else if(((JTextField)textTo.getDateEditor().getUiComponent()).getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Please select date in To field");
				}
				else{
					String firstName = textFirstName.getText();
					String lastName = textLastName.getText();
					String cellNumber1 = textCellNo.getText();
					long cellNumber = Long.parseLong(cellNumber1);
					String email = textEmail.getText();
					//String studentDob = new SimpleDateFormat("dd-MM-yyyy").format(textDob.getDate());
					java.sql.Date studentDob = new java.sql.Date(textDob.getDate().getTime());
					String studentEducation = textEducation.getText();
					String instituteName = textInsName.getText();
					int educationYear = yearChooser.getValue();
					String residentialAddress = textResAddress.getText();
					String instituteAddress = textInsAddress.getText();
					String membershipTerm = textMemPeriod.getText();
					String amountPaid_1 = textAmountPaid.getText();
					int amountPaid = Integer.parseInt(amountPaid_1);
					//String from = new SimpleDateFormat("yyyy-MM-dd").format(textFrom.getDate());
					java.sql.Date fromDate = new java.sql.Date(textFrom.getDate().getTime());
					//String to = new SimpleDateFormat("yyyy-MM-dd").format(textTo.getDate());
					java.sql.Date toDate = new java.sql.Date(textTo.getDate().getTime());
					byte imageData[] = b;
					
					Database.connectToDatabse();
					Database.insertStudent(firstName, lastName, cellNumber, email, studentDob, studentEducation, instituteName, 
							educationYear, residentialAddress, instituteAddress, membershipTerm, amountPaid, fromDate, toDate, imageData );
					Database.closeDatabaseConnection();
				}

			}
		});
		btnSubmit.setBounds(99, 398, 130, 31);
		contentPane.add(btnSubmit);
		
		JButton renewButton = new JButton("Renew Term");
		renewButton.setBounds(532, 10, 89, 23);
		renewButton.setSize(160, 30);
		renewButton.setLocation(600, 7);
		contentPane.add(renewButton);
		
		JButton viewrecordButton = new JButton("View Student Record");
		viewrecordButton.setBounds(532, 10, 89, 23);
		viewrecordButton.setSize(160, 30);
		viewrecordButton.setLocation(600, 50);
		contentPane.add(viewrecordButton);
		
		JLabel lblImage = new JLabel("Image");
		lblImage.setBounds(10, 368, 46, 14);
		contentPane.add(lblImage);
		

		
		imageLabel = new JLabel("New label");
		imageLabel.setBounds(362, 346, 130, 83);
		contentPane.add(imageLabel);
		
		
		
	}
	
	
}
