package iopack;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ReadFileDistinctWords {

	public List<String> getDistinctWordList(String fileName) throws FileNotFoundException,IOException {
		List<String> listWord = new ArrayList<String>();
		String paragraph = null;
		String temp = "";

		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));

			while ((paragraph = br.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(paragraph, ", ./?!");
				while (st.hasMoreTokens()) {
					temp = st.nextToken().toLowerCase();
					if (!listWord.contains(temp)) {
						listWord.add(temp);
					}
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
			dis.close();
			br.close();
		}

		return listWord;
	}

	public static void main(String[] args) throws FileNotFoundException,IOException {
		ReadFileDistinctWords obj = new ReadFileDistinctWords();
		List<String> wordList = obj.getDistinctWordList("C:\\Users\\HP\\Desktop\\Luminar\\sample.txt");
		
		Collections.sort(wordList);
		System.out.println("Total length of words: "+wordList.size());
		
		for(String words:wordList) {
			System.out.println(words);
		}
		
		
	}

}
