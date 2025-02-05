package iopack;
/*IMPORTANT*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile{
	public static void main(String[] args) throws FileNotFoundException,IOException {
		BufferedReader reader = null;
		
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Luminar\\sample..txt"));
			
			String currentLine="";
			currentLine = reader.readLine();
			
			while(currentLine!=null) {
				lineCount++;
				String[] words = currentLine.split(" ");
				wordCount = wordCount+words.length;
				
				for(String word:words) {
					charCount = charCount+word.length();
				}
				currentLine = reader.readLine();
			}
			
			System.out.println("Line Count: "+lineCount);
			System.out.println("Word Count: "+wordCount);
			System.out.println("Character Count: "+charCount);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}