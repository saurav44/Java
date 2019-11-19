
public class Main3b {
	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Enter ctrl+C to exit");
	}
}
