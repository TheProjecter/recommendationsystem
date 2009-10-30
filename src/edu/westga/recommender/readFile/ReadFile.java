package edu.westga.recommender.readFile;
import java.io.*;
import java.util.LinkedList;
public class ReadFile {
	
	//	BufferedWriter bufferedWriter;
		BufferedReader bufferedReader;
		StringBuilder contents;

		public ReadFile() {
		//	bufferedWriter = null;
			bufferedReader = null;

		}

		

		public LinkedList<String> readGuess(String searchType) {
			LinkedList<String> aList = new LinkedList<String>();



			try {

				BufferedReader input = new BufferedReader(new FileReader(
						"Files\\HipHopArtist.txt"));
				try {
					String line = null;

					while ((line = input.readLine()) != null) {
						aList.add(line);

					}
				} finally {
					input.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			return aList;
		}





















}
