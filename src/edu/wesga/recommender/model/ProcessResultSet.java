package edu.wesga.recommender.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

import edu.westga.recommender.readFile.Tester;

public class ProcessResultSet {
	Tester test;
	ResultSet result;
	ResultSet bestMatchSet;
	ResultSet betterMatchSet;
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
	

	public LinkedList<String> getList(){
		
	return aList;
	}
	
	
	public String work() {
		String genre = "";
		String bitRate = "";
		String year = "";
		String artist="";
		result = test.returnForSong("Song", "'Nazareth Savage'");

		if (checkResultSet(result))
			try {
				genre = result.getString("Genre");
				year= result.getString("Year");
				bitRate = result.getString("Bitrate");				
				artist=result.getString("Artist");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		bestMatchSet = test.bestMatch("'" + genre + "'","'" + year + "'", "'"
				+ bitRate + "'","'" + artist + "'");
		addToList(bestMatchSet);
		betterMatchSet = test.betterMatch("'" + genre + "'","'" + year + "'","'" + artist + "'");
		addToList(betterMatchSet);
		betterMatchSet = test.goodMatch("'" + genre + "'","'" + year + "'");
		addToList(betterMatchSet);
		betterMatchSet = test.genreMatch("'" + genre + "'");
		addToList(betterMatchSet);
		// HashSet<String> noDups=new HashSet<String>(aList);
		return genre;
	}
	
	public void addToList(ResultSet Set){		
		if (checkResultSet(Set))
			try {
				Set.beforeFirst();
				while(Set.next())
				{	aList.add(Set.getString("Song"));
				    aList.add(Set.getString("Artist"));
				}	
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
		
	}
	
	public LinkedList<String> pruneList(LinkedList<String> list) {		
		LinkedList<String> list2= new LinkedList<String>();
		list2=list;
		int y = 0;
		while ( y < list.size()-2) {	
			
			for (int i = y+1; i < list2.size(); i++) {
				
				if (list.get(y).equals(list2.get(i))){
				
			//		System.out.print("this is i"+ i+" "+y+ "\n");										
					list2.remove(i + 1);
					list2.remove(i);
					i=i-1;
				}
			}
			
			y=y+2;
		
		}

		return list2;
	}
	

	
	
	
	public static void main(String args[]) {

		ProcessResultSet set=new ProcessResultSet();
		set.work();	
		set.pruneList(set.getList());
		System.out.println(set.getList());
	
		
	}

   
}