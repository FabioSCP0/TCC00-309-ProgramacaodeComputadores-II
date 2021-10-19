package inputAndOutputWithFiles.q3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManipulation {
	private FileManipulation() {}
	
	public static String fileCopy(String filePathOrigin, String filePathDestiny) throws IOException{

		try {
			FileInputStream fileOrigin = new FileInputStream(filePathOrigin);
			FileOutputStream fileDestiny = new FileOutputStream(filePathDestiny);
			DataInputStream fileReader = new DataInputStream(fileOrigin);
			DataOutputStream fileWrite = new DataOutputStream(fileDestiny);
			
			@SuppressWarnings("unused")
			int x;
			byte[] buffer = new byte[10];
			
			while((x = fileReader.read(buffer))!= -1) {
				for(int i=0;i<10;i++) {
					fileWrite.write(buffer[i]);
				}
			}
			
			fileOrigin.close();
			fileDestiny.close();
			fileReader.close();
			fileWrite.close();
			return "Sucess";
		} catch (IOException e) {
			throw e;
		}
		
	}
	
}
