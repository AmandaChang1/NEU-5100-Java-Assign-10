import java.util.Scanner;

public class FileCounter {
	private int counterWords;
	private int counterLines;
	private int counterCharacters;
	
	public FileCounter(){
		
	}
	
	public void read(Scanner in) {
		counterLines=0;
		while (in.hasNext()){
			String lines = in.nextLine();
			System.out.println(lines);
			counterLines++;

			String words[]=lines.split(" ");
			counterWords+=words.length;
			
			for (String ch : words){
				counterCharacters+=ch.length();
			}			
				
		}
		
	}
	
	public int getCharacterCount() {
		
		return counterCharacters;
	}
	public int getWordCount() {
		
		return counterWords;
	}
	
	public int getLineCount(){
		return counterLines;
		
	}

}
