package inputAndOutputWithFiles.q4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileManipulation {
	private FileManipulation() {}
	
	public static boolean fileWrite(String filePath, List<String> strings) throws IOException{

		try {
			FileWriter file = new FileWriter(filePath);
			PrintWriter writefile = new PrintWriter(file);
			for (String string : strings) {
				writefile.println(string);
			}

			writefile.close();
			file.close();
			return true;
		} catch (IOException e) {
			throw e;
		}
		
	}
	
	public static String fileReader(String filePath) throws IOException{
		String content = "";
		try {
			FileReader file = new FileReader(filePath);
			@SuppressWarnings("resource")
			BufferedReader fileReader = new BufferedReader(file);
			String line = "";	
			try {
				line = fileReader.readLine();
				while(line != null) {
					content += line +"\r\n";
					line = fileReader.readLine();
				}
				fileReader.close();
				file.close();
				return content;
			} catch (IOException e) {
				throw e;
			}
		} catch (IOException e) {
			 throw e;
		}
	}
}
