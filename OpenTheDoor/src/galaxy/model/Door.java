package galaxy.model;

public class Door {

	public Door() {

	}

	public Door(int num, boolean car) {

		this.intNum = num;
		
		this.isCar = car;

	}

	/** �ű�� */
	private int intNum;

	/** �ź��Ƿ��г� */
	private boolean isCar;

	public int getIntNum() {
		return intNum;
	}

	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}

	public boolean isCar() {
		return isCar;
	}

	public void setCar(boolean isCar) {
		this.isCar = isCar;
	}

}
