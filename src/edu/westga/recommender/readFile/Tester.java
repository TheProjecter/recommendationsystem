package edu.westga.recommender.readFile;

import java.sql.*;

public class Tester {
	Connection con;

	private void displaySQLErrors(SQLException e) {
		System.out.println("SQLException: " + e.getMessage());
		System.out.println("SQLState:     " + e.getSQLState());
		System.out.println("VendorError:  " + e.getErrorCode());
	}

	public Tester() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {
			System.err.println("Unable to find and load driver");
			System.exit(1);
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql:///musicdata",
					"root", "qwer123");
		} catch (SQLException e) {
			displaySQLErrors(e);
		}

	}

	public ResultSet returnForSong(String field, String songName) {
		ResultSet result = null;
		try {
			Statement select = con.createStatement();
			result = select.executeQuery("SELECT * from musicinfo where "
					+ field + "=" + songName);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			displaySQLErrors(e);
		}

		return result;
	}

	public ResultSet bestMatch(String genreValue, String yearValue,
			String bitValue, String artistValue) {
		ResultSet result = null;
		// PreparedStatement prepStmt = null;

		try {

			Statement select = con.createStatement();
			result = select
					.executeQuery("SELECT * from musicinfo Where Genre = "
							+ genreValue + " and Year = " + yearValue
							+ " and Bitrate = " + bitValue + " and Artist = "
							+ artistValue);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			displaySQLErrors(e);
		}

		return result;
	}

	public static void main(String args[]) {

		// Tester test= new Tester();
		// ResultSet result=test.bestMatch("SongName", "'Its Like That'");

		// try {
		// result.next();
		// System.out.print(result.getString("SongName"));
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//		
		System.out.print("SELECT * from musicinfo Where Genre = "
				+ "genreValue" + " and Year = " + "yearValue"
				+ " and Bitrate = " + "bitValue" + " and Artist = "
				+ "artistValue");
		//		
	}

}
