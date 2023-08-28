import java.util.PriorityQueue;

public class QueuePollPeek {

	public static void main(String[] args) {
		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.add(10);
		q.add(134);
		q.add(178);
		q.add(9);
		q.add(167);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		


	}

}
