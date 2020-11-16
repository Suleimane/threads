package threads;

public class Principal {
    // jconsole console para monitorar threds iniciados pelo JVM
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Esse é thred main");
		Thread.sleep(50000);
	}

}
