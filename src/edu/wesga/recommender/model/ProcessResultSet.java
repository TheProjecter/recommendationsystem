package edu.wesga.recommender.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import edu.westga.recommender.readFile.Tester;

public class ProcessResultSet {
	Tester test;
	ResultSet result;
	ResultSet genreSet;
	ResultSet beatSet;
	String songName;
	String artist;
	LinkedList<String> aList;
	
	public ProcessResultSet(){
		test= new Tester();
		songName="";
		artist="";
		aList = new LinkedList<String>();
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
	
//	public void perfectMatch(String genre,String BitPattern ){
//	Tester test= new Tester();
//	ResultSet result=test.returnMatchForSong(genre, "'"+BitPattern+"'");
//	if	
//		
//		
//		
//		
//		
//	}
	public LinkedList<String> getList(){
		
	return aList;
	}
	
	
	public String work(){
		String genre="";
		String beatPattern="";		 
		
		result=test.returnForSong("'Its Like That'");
	
	if (checkResultSet(result))
		try {
			genre= result.getString("Genre");
			beatPattern=result.getString("BeatPattern");
		//	System.out.println(genre);
			//System.out.println(beatPattern);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		genreSet=test.returnMatchForSong("'"+genre+"'","'"+beatPattern+"'");	
	//	beatSet=test.returnMatchForSong("BeatPattern", "'"+beatPattern+"'");	
	
		if (checkResultSet(genreSet))
			try {
				genreSet.beforeFirst();
				while(genreSet.next())
				{	aList.add(genreSet.getString("SongName"));
				//    aList.add(genreSet.getString("Artist"));
				}	
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	return genre;
	}
	
	public void addToList(){		
		if (checkResultSet(genreSet))
			try {
				genreSet.beforeFirst();
				while(genreSet.next())
				{	aList.add(genreSet.getString("SongName"));
				//    aList.add(genreSet.getString("Artist"));
				}	
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		
	}
	
	
	public static void main(String args[]) {

	//	Tester test= new Tester();
		ProcessResultSet set=new ProcessResultSet();
		set.work();
		System.out.println(set.getList());
		//
//		ResultSet result=test.returnMatchForSong("SongName", "'Its Like That'");
//	if (set.checkResultSet(result))
//	
//		System.out.println("good");
//		
//	
//	else	
//		System.out.println("bad");
//		
//	try {
//		result.next();
//		System.out.print(result.getString("SongName"));
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		
//		//System.out.print("SELECT * from musicinfo Where " + field+"="+fieldValue);
		
	}

   
}