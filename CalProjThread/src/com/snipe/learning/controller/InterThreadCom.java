package com.snipe.learning.controller;

class Q {
	int num;
	boolean valueSet = false;

	public synchronized void getNum() {
		while (!valueSet) {
			try {
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("GET:"+num);
		valueSet = false;
		notify();
	}

	public synchronized void setNum(int num) {
		while (valueSet) {
			try {
				wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		System.out.println("PUT:"+num);
		this.num = num;
		valueSet = true;
		notify();
	}

}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		super();
		this.q = q;
		Thread t = new Thread(this, "producer");
		t.start();
	}

	public Q getQ() {
		return q;
	}

	public void setQ(Q q) {
		this.q = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;

		while (true) {
			q.setNum(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}

}

class Consumer implements Runnable {
	Q q;

	public Q getQ() {
		return q;
	}

	public Consumer(Q q) {
		super();
		this.q = q;
		Thread t = new Thread(this, "consumer");
		t.start();

	}

	public void setQ(Q q) {
		this.q = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			q.getNum();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}

		}
	}

}

public class InterThreadCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}

}
