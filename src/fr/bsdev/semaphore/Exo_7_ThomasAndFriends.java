package fr.bsdev.semaphore;

public class Exo_7_ThomasAndFriends {
	
	protected int value = 0;
	
	public Exo_7_ThomasAndFriends() {
		super();
		this.value = 1;
	}
	
	public Exo_7_ThomasAndFriends(int value) {
		super();
		this.value = value;
	}
	
	public synchronized boolean occupied() {
		if(this.value > 0)
			return false;
		return true;
	}

	public synchronized void signaler() {
		this.value += 1;
		notify();
	}
	
	public synchronized void init() {
		this.value -= 1;
	}
	
	public synchronized void P() {
		this.value --;
		if(this.value < 0) {
			while(true) {
				try {
						wait();
						break;
				}catch(InterruptedException ie) {
					System.err.println("Exo_7_ThomasAndFriends.P()");
					continue;
				}
			}
		}
	}
	
	public synchronized void V() {
		this.value ++;
		if(this.value <= 0)
			notify();
	}
	
	public synchronized int value() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return "Exo_7_ThomasAndFriends [value=" + value + "]";
	}
	
	
}
