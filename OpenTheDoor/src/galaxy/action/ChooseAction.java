package galaxy.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import galaxy.model.Compere;
import galaxy.model.Door;
import galaxy.model.Player;
import galaxy.model.Show;

public class ChooseAction {

	public static void main(String[] args) {

		Show cctvShow = new Show();

		Player player = new Player();

		Compere compere = new Compere();

		List<Door> doorList = new ArrayList<Door>();

		int right = 0;

		int wrong = 0;

		int sum = 100000;

		int open = 1;

		String plan = "C";
		
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);  
        System.out.println("请选择方案：");
        plan =  scanner.nextLine();  

		for (int i = 0; i < sum; i++) {

			doorList = cctvShow.getDoorList(3);

			Door door = player.insistChosen(doorList);

			List<Door> chosenList = compere.chooseDoor(doorList, door, open);

			if (plan.equals("A")) {


			} else if (plan.equals("B")) {

				door = player.changeChosen(chosenList, doorList);

			} else if (plan.equals("C")) {

				door = player.randomChoose(chosenList, doorList);
			}

			if (door.isCar() == true) {
				right++;

			} else {
				wrong++;

			}

		}

		System.out.println("选对了：" + right + "  选错了" + wrong);
		System.out.println((double) right / sum * 100 + "%");

	}

}
