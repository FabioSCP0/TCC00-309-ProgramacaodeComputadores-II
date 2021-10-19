package objectOrientation.q4;

public class Building extends Property {
	
	int totalDoors=0;
	int totalFloors=0;
	Door door[] = new Door[1];
	
	int totalFloors() {
		return totalFloors;
	}
	
	void addFloor() {
		totalFloors++;
	}
	
	void addDoor(Door p) {
		
		if(totalDoors == 0) {
			totalDoors++;
			door[0] = p;
		}else {
			totalDoors++;
			Door temp[] = new Door[totalDoors];
			for(int i=0;i<totalDoors-1;i++) {
				temp[i] = door[i];
			}
			temp[totalDoors-1] = p;
			door = temp;
		}
	}
	
	

	@Override
	int totalOfDoors() {
		return totalDoors;
	}
	
	@Override
	int howManyDoorsAreOpen() {
		int accumulator=0;
		for(int i=0;i<totalDoors;i++) {
			if(door[i].isOpen()) accumulator++;
		}
		return accumulator;
	}
}
