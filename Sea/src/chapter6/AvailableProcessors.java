package chapter6;

public class AvailableProcessors {

	public static void main(String[] args) {
		
		/** 获取可用处理器的数目，可根据此值确定同时并发执行的Java线程数。*/
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		
		System.out.println(availableProcessors);

	}

}
