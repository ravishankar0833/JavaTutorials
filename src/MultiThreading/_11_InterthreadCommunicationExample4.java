package MultiThreading;

//One Queue with multiple producer and one consumer
public class _11_InterthreadCommunicationExample4 {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		new producer1(q, "producer1");
		new producer1(q, "producer2");
		new producer1(q, "producer3");
		new consumer1(q, "consumer1");

	}
}

