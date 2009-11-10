package edu.wesga.recommender.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

import edu.westga.recommender.data.Data;

public class ProcessResultSet {
	Data data;
	ResultSet result;
	ResultSet bestMatchSet;
	ResultSet betterMatchSet;
	String songName;
	String artist;	
	LinkedList<Song> aList;
	public ProcessResultSet(){
		data= new Data();
		songName="";
		artist="";		
		aList= new LinkedList<Song>();
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
	


	public LinkedList<Song> getList(){
		
		return aList;
		}
	
	public String work(String songName) {
		String genre = "";
		String bitRate = "";
		String year = "";
		String artist="";
		result = data.returnForSong("Song", "'"+songName+"'");

		if (checkResultSet(result))
			try {
				genre = result.getString("Genre");
				year= result.getString("Year");
				bitRate = result.getString("Bitrate");				
				artist=result.getString("Artist");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		bestMatchSet = data.bestMatch("'" + genre + "'","'" + year + "'", "'"
				+ bitRate + "'","'" + artist + "'");		
		addToList(bestMatchSet);
		betterMatchSet = data.betterMatch("'" + genre + "'","'" + year + "'","'" + artist + "'");
		addToList(betterMatchSet);
		betterMatchSet = data.goodMatch("'" + genre + "'","'" + year + "'");
		addToList(betterMatchSet);
		betterMatchSet = data.genreMatch("'" + genre + "'");
		addToList(betterMatchSet);	
		
		
		// HashSet<String> noDups=new HashSet<String>(aList);
		return genre;
	}
	
	
	
	public void addToList(ResultSet Set){		
		boolean checker;
		if (checkResultSet(Set))
			try {
				Set.beforeFirst();
				while(Set.next())
				{	  checker= true;
					for(Song s : aList)	{
						if (s.getSongName().equals(Set.getString("Song")))
							checker=false;
						}
						if (checker==true){
							aList.add(new Song(Set.getString("Song"),Set.getString("Artist")));
						}
			
				}	
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
		
	}	

	
	
	
	public static void main(String args[]) {

		ProcessResultSet set=new ProcessResultSet();
		set.work("Nazareth Savage");			
		System.out.println("s.getSongName()+ '\n'");
		for(Song s : set.getList())
	{
	System.out.println(s.getSongName()+ '\n');
	}
	}
   
}