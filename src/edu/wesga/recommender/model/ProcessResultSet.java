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
		
		result=test.returnForSong("SongName","'Its Like That'");
	
	if (checkResultSet(result))
		try {
			genre= result.getString("Genre");
			beatPattern=result.getString("BeatPattern");
		//	System.out.println(genre);
			//System.out.println(beatPattern);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		bestMatchSet=test.returnMatchForSong("'"+genre+"'","'"+beatPattern+"'");		
		addToList(bestMatchSet);
		betterMatchSet=test.returnForSong("Genre","'"+genre+"'");
		addToList(betterMatchSet);
		//HashSet<String> noDups=new HashSet<String>(aList);
	return genre;
	}
	
	public void addToList(ResultSet Set){		
		if (checkResultSet(Set))
			try {
				Set.beforeFirst();
				while(Set.next())
				{	aList.add(Set.getString("SongName"));
				    aList.add(Set.getString("Artist"));
				}	
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
		
	}
	
	public LinkedList<String> proonList(LinkedList<String> list) {		
		LinkedList<String> list2= new LinkedList<String>();
		list2=list;
		for (int y = 0; y < list.size(); y++) {
	//	for (String member : list) {
			
			for (int i = y+1; i < list2.size(); i++) {
				if (list.get(y).equals(list2.get(i))){
					System.out.print(list2.size());
					System.out.print("this is i"+ i+" "+y+ "\n");
					list2.remove(i);					
				//	list2.remove(i + 1);
				}
			}

		}

		return aList;
	}
	
	
	
	
	public static void main(String args[]) {

	//	Tester test= new Tester();
		ProcessResultSet set=new ProcessResultSet();
		set.work();
		System.out.println(set.getList());
		System.out.println(set.proonList(set.getList()));
	//	set.proonList(set.getList());
		

	//	System.out.println(set.getList());
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