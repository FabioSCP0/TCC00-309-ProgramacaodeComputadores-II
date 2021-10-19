package objectOrientation.q4;

public class House extends Property{
	Door doorOne;
	Door doorTwo;
	Door doorThree;
	
	House(Door doorOne,Door doorTwo,Door doorThree){
		this.doorOne = doorOne;
		this.doorTwo = doorTwo;
		this.doorThree = doorThree;
	}
	
	@Override
	int totalOfDoors() {
		if(doorOne instanceof Door) {
			if((doorTwo instanceof Door)&&(doorThree instanceof Door)) return 3;
			else if(!(doorTwo instanceof Door)&&(doorThree instanceof Door)) return 2;
			else if((doorTwo instanceof Door)&&!(doorThree instanceof Door)) return 2;
			else return 1;
		}else if(doorTwo instanceof Door) {
			if(doorThree instanceof Door) return 2;
			else return 1;
		}else if(doorThree instanceof Door) {
			return 1;
		}
		else return 0;
	}

	@Override
	int howManyDoorsAreOpen() {
		int accumulator = 0;
		if((doorOne instanceof Door)&&(doorOne.isOpen())) accumulator++;
		if((doorTwo instanceof Door)&&(doorTwo.isOpen())) accumulator++;
		if((doorThree instanceof Door)&&(doorThree.isOpen())) accumulator++;
		return accumulator;
	}
	
}
