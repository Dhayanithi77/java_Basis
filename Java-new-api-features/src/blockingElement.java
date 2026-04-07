import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class blockingElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BlockingQueue<String> db = new ArrayBlockingQueue<>(2);
		db.put("A");
		db.put("B");
		System.out.println(db.take());
		db.put("C");
		System.out.println(db.take());
		System.out.println(db.take());
		System.out.println(db.take());
	}

}
