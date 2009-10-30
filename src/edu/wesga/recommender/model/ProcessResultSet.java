package edu.wesga.recommender.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import edu.westga.recommender.readFile.Tester;

public class ProcessResultSet {
	Tester test;
	ResultSet result;
	
	
	
	public ProcessResultSet(){
		test= new Tester();
	}
	
	
	
	
	public boolean checkResultSet(ResultSet result){
		try {
			if (!result.next())
				return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	return true;
	}
	
	public void perfectMatch(String genre,String BitPattern ){
	Tester test= new Tester();
	ResultSet result=test.returnMatchForSong(genre, "'"+BitPattern+"'");
	if	
		
		
		
		
		
	}
	
	
	public void work(){
		String genre="";
		String bitPattern="";		 
		ProcessResultSet set=new ProcessResultSet();
		result=test.returnMatchForSong("SongName", "'It Like That'");
	
	if (set.checkResultSet(result))
		try {
			genre= result.getString("Genre");
			bitPattern=result.getString("BitPattern");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	
	
	
//	public static void main(String args[]) {
//
//		Tester test= new Tester();
//		ProcessResultSet set=new ProcessResultSet();
//		ResultSet result=test.returnMatchForSong("SongName", "'It Like That'");
//	if (set.checkResultSet(result))
//	
//		System.out.println("good");
//		
//	
//	else	
//		System.out.println("bad");
		
//	try {
//		result.next();
//		System.out.print(result.getString("SongName"));
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//		
//		//System.out.print("SELECT * from musicinfo Where " + field+"="+fieldValue);
//		
//	}

//}
}