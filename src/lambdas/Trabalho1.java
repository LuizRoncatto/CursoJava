package lambdas;

public class Trabalho1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("trabalho1");
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}

}
