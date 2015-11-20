package galaxy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Compere {

	public List<Door> chooseDoor(List<Door> chooseLis, Door door, int size) {

		List<Door> compereDoorLis = new ArrayList<Door>();
		List<Door> tempDoorLis = new ArrayList<Door>();
		List<Door> doorLis = kickDoor(chooseLis, door,tempDoorLis);

		Random r = new Random();

		for (int i = 0; i < size; i++) {
			
			Door chooseDoor = doorLis.get(r.nextInt(doorLis.size()));

			tempDoorLis.add(chooseDoor);
			doorLis.remove(chooseDoor);
			compereDoorLis.add(chooseDoor);

		}

		chooseLis.addAll(tempDoorLis);
		return compereDoorLis;
	}

	private List<Door> kickDoor(List<Door> chooseLis, Door door,List<Door> tempDoorLis) {

		tempDoorLis.add(door);
		chooseLis.remove(door);
		for (int i = 0; i < chooseLis.size(); i++) {

			if (chooseLis.get(i).isCar() == true) {
				tempDoorLis.add(chooseLis.get(i));
				chooseLis.remove(i);
				break;
			}

		}
		return chooseLis;

	}

}
