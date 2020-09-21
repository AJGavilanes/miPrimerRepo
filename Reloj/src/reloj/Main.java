package reloj;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Reloj r=new Reloj(11, 59, 50);
		
		while (true) {
			Thread.sleep(1000);
			r.incrementa();
			if (r.equals(new Reloj(0, 0, 0))) System.out.println("Nuevo día");
			System.out.println(r.toString());			
		}		 
	}
}
