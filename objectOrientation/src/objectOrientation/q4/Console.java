package objectOrientation.q4;

public class Console {
	public static void main(String[] args) {
		Door p1 = new Door("Black", 1, 3, 3);
		Door p2 = new Door("Yellow", 1, 4, 4);
		Door p3 = new Door("Blue", 1, 5, 5);
		
		House c1 = new House(p1,p2,p3);
		c1.doorOne.open();
		c1.doorTwo.close();
		c1.doorTwo.open();
		c1.paint("Branco");
		System.out.printf("%d %d \n",c1.howManyDoorsAreOpen(), c1.totalOfDoors());
		System.out.println(c1.cor);
		
		Building e1 = new Building();
		e1.addDoor(p1);
		e1.addDoor(p2);
		e1.addDoor(p3);
		System.out.printf("%d %d \n", e1.howManyDoorsAreOpen(),e1.totalOfDoors());
	}
}
