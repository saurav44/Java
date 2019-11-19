
public class Main3a {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		ThreadClass1 hi1 = new ThreadClass1(Thread.NORM_PRIORITY+2);
		ThreadClass1 hi2 = new ThreadClass1(Thread.NORM_PRIORITY-2);
		ThreadClass1 hi3 = new ThreadClass1(Thread.NORM_PRIORITY+3);
		ThreadClass1 hi4 = new ThreadClass1(Thread.NORM_PRIORITY-3);
		ThreadClass1 hi5 = new ThreadClass1(Thread.NORM_PRIORITY+4);
		hi1.start();
		hi2.start();
		hi3.start();
		hi4.start();
		hi5.start();
		System.out.println("Thread 1 is alive: "+ hi1.t.isAlive());
		System.out.println("Thread 2 is alive: "+ hi2.t.isAlive());
		System.out.println("Thread 3 is alive: "+ hi3.t.isAlive());
		System.out.println("Thread 4 is alive: "+ hi4.t.isAlive());
		System.out.println("Thread 5 is alive: "+ hi5.t.isAlive());
		try {
			hi5.t.sleep(1000);
			hi3.t.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("Main thred interrupted");
		}
		hi1.stop();
		hi2.stop();
		hi3.stop();
		hi4.stop();
		hi5.stop();
		try {
			System.out.println("waiting for thread to finish");
			hi1.t.join();
			hi2.t.join();
			hi3.t.join();
			hi4.t.join();
			hi5.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("Priority of thread 1: "+ hi1.t.getPriority());
		System.out.println("Priority of thread 2: "+ hi2.t.getPriority());
		System.out.println("Priority of thread 3: "+ hi3.t.getPriority());
		System.out.println("Priority of thread 4: "+ hi4.t.getPriority());
		System.out.println("Priority of thread 5: "+ hi5.t.getPriority());
		System.out.println("Thread 1 is alive: "+ hi1.t.isAlive());
		System.out.println("Thread 2 is alive: "+ hi2.t.isAlive());
		System.out.println("Thread 3 is alive: "+ hi3.t.isAlive());
		System.out.println("Thread 4 is alive: "+ hi4.t.isAlive());
		System.out.println("Thread 5 is alive: "+ hi5.t.isAlive());
		System.out.println("main thread exiting");
	}
}
