
public class Q {
	int n;
	boolean valueset = false;
	synchronized int get() {
		while(!valueset)
			try {
				wait();
			}catch(InterruptedException e) {
			System.out.println("Thread Interrupted");
			}
		System.out.println("Got: "+n);
		valueset = false;
		notify();
		return n;
	}
	synchronized void put(int n) {
		while(valueset)
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Thread Interrupted");
			}
			this.n = n;
			valueset = true;
			System.out.println("Put: "+n);
			notify();
	}
}
