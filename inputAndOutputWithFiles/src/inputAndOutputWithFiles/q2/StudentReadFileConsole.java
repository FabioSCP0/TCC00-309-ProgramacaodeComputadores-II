package inputAndOutputWithFiles.q2;

import java.io.IOException;

public class StudentReadFileConsole {
	private String content;
	private final String filePath = "File.dat";
	
	public StudentReadFileConsole() {
		run();
	}

	private void run() {
		try {
			content = FileManipulation.fileReader(filePath);
			if(content!="") {
				System.out.println(content);
			}else System.out.println("Empty file !");
		} catch (IOException e) {
			System.out.println("A "+e.getMessage());
		}
		
	}
}
