package galaxy.model;

import java.util.List;
import java.util.Random;

public class Player {

	private final int intChoseDoorNum = 0;

	/** 坚持选择 */
	public Door insistChosen(List<Door> chooseDoorLis) {
		
		Door door = chooseDoorLis.get(intChoseDoorNum);

		return door;
	}

	/** 改变选择，改选三个门中最后剩下的那个 */
	public Door changeChosen(List<Door> chosenDoorLis, List<Door> chooseDoorLis) {

		chooseDoorLis.removeAll(chosenDoorLis);

		chooseDoorLis.remove(findThePlayerChosen(chooseDoorLis));

		Random r = new Random();

		int i = r.nextInt(chooseDoorLis.size());

		Door door = chooseDoorLis.get(i);

		return door;
	}

	/** 在除了主持人打开的门之外随机选择一个 */
	public Door randomChoose(List<Door> chosenDoorLis, List<Door> chooseDoorLis) {

		chooseDoorLis.removeAll(chosenDoorLis);

		Random r = new Random();

		int i = r.nextInt(chooseDoorLis.size());

		Door door = chooseDoorLis.get(i);

		return door;
	}

	/** 找出选手自己最初选择的那个门 */
	private Door findThePlayerChosen(List<Door> chooseDoorLis) {

		Door door = new Door();

		for (int i = 0; i < chooseDoorLis.size(); i++) {

			if (chooseDoorLis.get(i).getIntNum() == getIntChoseDoorNum()) {
				door = chooseDoorLis.get(i);
				break;
			}

		}

		return door;

	}

	public int getIntChoseDoorNum() {
		return intChoseDoorNum;
	}

}
