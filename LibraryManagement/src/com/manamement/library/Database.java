package com.manamement.library;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Database {

	protected static final String jdbc_driver = "com.mysql.jdbc.Driver";
	protected static final String db_url = "jdbc:mysql://localhost:3306/library_management";
	protected static final String username = "root";
	protected static final String pasword = "";

	protected static Connection conn = null;
	protected static Statement stmt = null;
	protected static PreparedStatement pStmt = null;

	protected static void connectToDatabse() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(db_url, username, pasword);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	protected static void insertStudent(String firstName, String lastName,
			long cellNumber, String email, Date studentDob, String education,
			String institutionName, int year, String resAddress,
			String insAddress, String memTerm, int amountPaid, Date term_from,
			Date term_to) {
		try {
			String student_details = "INSERT INTO students (fname, lname, cell, email, dob, education, insname, year, resAddress, insAddress,"
					+ " term, amount, term_from, term_to) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			pStmt = conn.prepareStatement(student_details);
			pStmt.setString(1, firstName);
			pStmt.setString(2, lastName);
			pStmt.setLong(3, cellNumber);
			pStmt.setString(4, email);
			pStmt.setDate(5, studentDob);
			pStmt.setString(6, education);
			pStmt.setString(7, institutionName);
			pStmt.setInt(8, year);
			pStmt.setString(9, resAddress);
			pStmt.setString(10, insAddress);
			pStmt.setString(11, memTerm);
			pStmt.setInt(12, amountPaid);
			pStmt.setDate(13, term_from);
			pStmt.setDate(14, term_to);

			int rowInserted = pStmt.executeUpdate();
			if (rowInserted > 0) {
				JOptionPane.showMessageDialog(null,
						"Student record inserted successfully", "Success",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,
						"Error occured while inserting data", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	protected static void closeDatabaseConnection() {
		try {
			conn.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);

		}
	}

}
