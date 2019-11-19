
public class ThreadClass1 implements Runnable {
	long click = 0;
	private volatile boolean running = true;
	Thread t;
	ThreadClass1(int p){
		t = new Thread(this);
		t.setPriority(p);
	}
	public void run() {
		while(running) {
			click++;
		}
	}
	public void stop() {
		running = false;
	}
	public void start() {
		t.start();
	}

}
