package inputAndOutputWithFiles.q2;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FileManipulation {
	private FileManipulation() {}
	
	public static void fileWrite(String filePath, List<Student> students) throws IOException{

		try {
			FileOutputStream file = new FileOutputStream(filePath);
			DataOutputStream fileWrite = new DataOutputStream(file);
			for (Student student : students) {
				fileWrite.writeInt(student.getEnroll());
				fileWrite.writeInt(student.getName().length());
				fileWrite.writeChars(student.getName());
				fileWrite.writeDouble(student.getCr());				
			}
		
			fileWrite.close();
			file.close();
		} catch (IOException e) {
			throw e;
		}
		
	}
	
	public static String fileReader(String filePath) throws IOException{
		String content = "";
		try {
			FileInputStream  file = new FileInputStream (filePath);
			DataInputStream fileReader = new DataInputStream(file);
			
			boolean over = false;
			
			while(!over) {
				
				try {
					content += fileReader.readInt() + " ";
					int k = fileReader.readInt();
					for(int i=0;i<k;i++) {
						content += fileReader.readChar();
					}
					content += " " + fileReader.readDouble() + "\r\n";
					
				} catch (EOFException e) {
					over = true;
				}
			}
			file.close();
			fileReader.close();
			return content;
		} catch (IOException e) {
			 throw e;
		}

	}
}
