package inputAndOutputWithFiles.q3;

import java.io.IOException;


public class FileConsole {
	
	private final String fileOrigin = "photoInput.jpg";
	private final String fileDestiny = "photoOutput.jpg";
	
	public FileConsole() {
		run();
	}

	private void run() {
		try {
			String sucess = FileManipulation.fileCopy(fileOrigin,fileDestiny);
			System.out.println(sucess);
		} catch (IOException e) {
			System.out.println("Failed " + e.getMessage());
		}
		
	}
}
