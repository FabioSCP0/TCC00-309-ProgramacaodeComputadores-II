package inputAndOutputWithFiles.q4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EncryptingFile {
	
	private int k;
	private int cryptography;
	private String content;
	private final List<String> strings = new ArrayList<String>();
	
	Scanner entry = new Scanner(System.in);
	
	EncryptingFile(){
		run();
	}
	
	private void run() {
		
		String concat="";
		System.out.print("Enter the K parameter: ");
		int type = entry.nextInt();
		
		if(type>=0 && type<127) this.k = type;
		else this.k = 127;
		
		try {
			content = FileManipulation.fileReader("InputAscii.txt");
			for ( int i = 0; i < content.length(); ++i ){ 
				char c = content.charAt( i ); 
				int j = (int) c; 
				cryptography = j +  k;
				concat +=  (char)cryptography;
				strings.add("Origin > " +j+" -> Destiny: "+cryptography);
			} 

			strings.add("\r\nResult > " + concat +" ");
			boolean sucess = FileManipulation.fileWrite("EncryptedAsciiJK.txt", strings);
			if(sucess) System.out.println("Successfully encrypted!");
		} catch (IOException e) {
			System.out.println("Failed "+e.getMessage());
		}
	}

	/*
	
 */
}
