package inputAndOutputWithFiles.q1;

import java.io.IOException;

public class StudentReadFileConsole {
	private String content;
	private final String filePath = "FileOutput.txt";
	
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
			System.out.println(e.getMessage());
		}
		
	}
}
