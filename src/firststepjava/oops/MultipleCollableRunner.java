package firststepjava.oops;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCollableRunner {

	public static void main(String[] args) throws Exception {

		ExecutorService executeService = Executors.newFixedThreadPool(1);

		List<CallableTask> tasks = List.of(new CallableTask("Dhaya"), new CallableTask("Dhanush"),
				new CallableTask("Vijay"));

		String results = executeService.invokeAny(tasks);

		System.out.println(results);

		executeService.shutdown();
	}
}