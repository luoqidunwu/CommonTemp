package net.com.thread;

class Stack {
	private final int size;
	private int len;

	public Stack(int size) {
		this.size = size;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public Boolean isEmpty() {
		if (0 == this.len) {
			return true;
		}
		return false;
	}

	public Boolean isFull() {
		if (this.size == this.len) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "stack len is " + this.getLen();
	}
}

class Producer implements Runnable {
	private final Stack stack;

	public Producer(Stack stack) {
		this.stack = stack;
	}

	public void produce() {
		synchronized (stack) {
			if (stack.isFull()) {
				try {
					stack.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				stack.setLen(stack.getLen() + 1);
				System.out
						.println("producer produce a production stack len is "
								+ stack.getLen());
				stack.notify();
			}
		}
	}

	@Override
	public void run() {
		while(true){
			this.produce();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {       
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Customer implements Runnable {
	private final Stack stack;

	public Customer(Stack stack) {
		this.stack = stack;
	}

	public void consume() {
		synchronized (stack) {
			if (stack.isEmpty()) {
				try {
					stack.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				stack.setLen(stack.getLen() - 1);
				System.out
						.println("consumer consume a production stack len is "
								+ stack.getLen());
				stack.notify();
			}
		}
	}

	@Override
	public void run() {
		while(true){
			this.consume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ProduceCustomer {
	/*public static void main(String[] args) {
		Stack stack = new Stack(10);
		Runnable produceRun = new Producer(stack);
		Thread produceThr = new Thread(produceRun);
		Runnable customeRun = new Customer(stack);
		Thread customeThr = new Thread(customeRun);
		produceThr.start();
		customeThr.start();

	}*/
}
