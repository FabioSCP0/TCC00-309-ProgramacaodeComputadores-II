package inputAndOutputWithFiles.q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileManipulation {
	private FileManipulation() {}
	
	public static void fileWrite(String filePath, List<Student> students) throws IOException{

		try {
			FileWriter file = new FileWriter(filePath);
			PrintWriter writefile = new PrintWriter(file);
			for (Student student : students) {
				writefile.println(student.getEnroll());
				writefile.println(student.getName());
				writefile.println(student.getCr()+"\n");
			}
		
			writefile.close();
			file.close();
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
