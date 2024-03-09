package TpFaibCouplage;

public class Main {

	public static void main(String[] args) {
		Service service = new ServiceC();
		ClientA client = new ClientA(service);
		client.doSomething();
		System.out.println(client.getInfo());
	
	}

}
