package galaxy.model;

import java.util.List;
import java.util.Random;

public class Player {

	private final int intChoseDoorNum = 0;

	/** ���ѡ�� */
	public Door insistChosen(List<Door> chooseDoorLis) {
		
		Door door = chooseDoorLis.get(intChoseDoorNum);

		return door;
	}

	/** �ı�ѡ�񣬸�ѡ�����������ʣ�µ��Ǹ� */
	public Door changeChosen(List<Door> chosenDoorLis, List<Door> chooseDoorLis) {

		chooseDoorLis.removeAll(chosenDoorLis);

		chooseDoorLis.remove(findThePlayerChosen(chooseDoorLis));

		Random r = new Random();

		int i = r.nextInt(chooseDoorLis.size());

		Door door = chooseDoorLis.get(i);

		return door;
	}

	/** �ڳ��������˴򿪵���֮�����ѡ��һ�� */
	public Door randomChoose(List<Door> chosenDoorLis, List<Door> chooseDoorLis) {

		chooseDoorLis.removeAll(chosenDoorLis);

		Random r = new Random();

		int i = r.nextInt(chooseDoorLis.size());

		Door door = chooseDoorLis.get(i);

		return door;
	}

	/** �ҳ�ѡ���Լ����ѡ����Ǹ��� */
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
