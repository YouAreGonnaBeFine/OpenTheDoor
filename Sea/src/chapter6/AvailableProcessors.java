package chapter6;

public class AvailableProcessors {

	public static void main(String[] args) {
		
		/** ��ȡ���ô���������Ŀ���ɸ��ݴ�ֵȷ��ͬʱ����ִ�е�Java�߳�����*/
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		
		System.out.println(availableProcessors);

	}

}
