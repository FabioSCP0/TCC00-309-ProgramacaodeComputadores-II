package inputAndOutputWithFiles.q1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentWriteFileConsole {

	private Scanner entry = new Scanner(System.in);
	
	private int registration;
	private String name;
	private double cr;
	
	private final String filePath = "FileOutput.txt";
	private boolean cycle = false;
	
	private final List<Student> students = new ArrayList<Student>();
	
	StudentWriteFileConsole(){
		run();
	}

	private void run() {
			
		do {

			System.out.print("Type registration: ");
			registration = entry.nextInt();
			if(registration!=0) {
				cycle = true;
				System.out.print("Type name: ");
				name = entry.next();
				System.out.print("Type cr: ");
				cr = entry.nextDouble();
				students.add(new Student(registration,name,cr));
			}else {
				cycle = false;
				try {
					FileManipulation.fileWrite(filePath,students);
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}while(cycle);
		
	}	
}
