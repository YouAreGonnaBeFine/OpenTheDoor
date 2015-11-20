package galaxy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Show {

	public List<Door> getDoorList(int num) {
		
		List<Door> doorList = new ArrayList<Door>();

		int doors = num;

		for (int i = 0; i < doors; i++) {
			
			doorList.add(new Door(i,false));

		}


		doorList = chooseDoor(doorList);

		return doorList;

	}

	private List<Door> chooseDoor(List<Door> doorList) {

		Random r = new Random();

		int i = r.nextInt(doorList.size());

		doorList.get(i).setCar(true);

		return doorList;
	}

}
