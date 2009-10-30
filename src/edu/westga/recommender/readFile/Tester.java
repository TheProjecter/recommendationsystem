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
			      con = DriverManager.getConnection("jdbc:mysql:///musicdata", "root", "qwer123");
			    } catch (SQLException e) {
			      displaySQLErrors(e);
			    }
		 
	        }
//	 public void connectToDB() {
//		    try {
//		      connection = DriverManager.getConnection("jdbc:mysql:///musicdata", "root", "qwer123");
//		    } catch (SQLException e) {
//		      displaySQLErrors(e);
//		    }
//		  }

	public ResultSet returnForSong(String songName) {
		ResultSet result=null;
		try {
			Statement select = con.createStatement();
			result = select
					.executeQuery("SELECT * from musicinfo where SongName="+songName);
		//	result.next();
		//	rowResult = result.getString("SongName");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			displaySQLErrors(e);
		}

		return result;
	}
	
	public ResultSet returnMatchForSong(String field,String fieldValue) {
		ResultSet result=null;
		//PreparedStatement prepStmt = null;

		try {
			 

			Statement select = con.createStatement();
			result = select.executeQuery("SELECT * from musicinfo Where Genre = "+ field+
					" and BeatPattern = " + fieldValue);
			//	prepStmt = con.prepareStatement(sqlStmt);
		//	System.out.println(prepStmt.toString());
		//	prepStmt.setString(1,field);
			//prepStmt.setString(2,fieldValue);
		//	System.out.println(prepStmt.toString());
//System.out.print(prepStmt.);
		//	Statement select = con.createStatement();
		//	result = prepStmt.executeQuery();

		//	result.next();
		//	rowResult = result.getString("SongName");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			displaySQLErrors(e);
		}

		return result;
	}
	
	
	
	
	
	
	
	public static void main(String args[]) {
		
//		String field="Femi"	;
//		String fieldValue="Femi"	;
		Tester test= new Tester();
		ResultSet result=test.returnMatchForSong("SongName", "'Its Like That'");
		
	try {
		result.next();
		System.out.print(result.getString("SongName"));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		//System.out.print("SELECT * from musicinfo Where " + field+"="+fieldValue);
		
	}
	
//	  public static void main(String args[]) {
//	    Connection con = null;
//
//	    try {
//	      Class.forName("com.mysql.jdbc.Driver").newInstance();
//	      con = DriverManager.getConnection("jdbc:mysql:///musicdata", "root", "qwer123");
//
//	      if(!con.isClosed())
//	        System.out.println("Successfully connected to MySQL server...");
//	      
//	    	  Statement select = con.createStatement();
//	    	  ResultSet result = select.executeQuery
//                      ("SELECT * from musicinfo where SongName=\"Its Like That\""); 
////	    	  if(!result.next())
////		    		 System.out.print("no result");
//	    	  while(result.next()) { // process results one row at a time
//	    	        
//	    	        String val = result.getString("Genre");
//	    	
//	    	    
//	    	        System.out.println("val = " + val);
//	    	      
//
//	    	  
//	    	  
//	    	  
//	      }
//	    } catch(Exception e) {
//	      System.err.println("Exception: " + e.getMessage());
//	    } finally {
//	      try {
//	        if(con != null)
//	          con.close();
//	      } catch(SQLException e) {}
//	    }
//	  }
//	

}
