package galaxy.model;

public class Door {

	public Door() {

	}

	public Door(int num, boolean car) {

		this.intNum = num;
		
		this.isCar = car;

	}

	/** 门编号 */
	private int intNum;

	/** 门后是否有车 */
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
