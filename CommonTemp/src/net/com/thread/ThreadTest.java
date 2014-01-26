package net.com.thread;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ThreadTest {

	private int j = 0;

	// 加线程
	private class Inc implements Runnable {
		public void run() {
			for (int i = 0; i < 10; i++) {
				inc();
			}
		}
	}

	// 减线程
	private class Dec implements Runnable {
		public void run() {
			for (int i = 0; i < 10; i++) {
				dec();
			}
		}
	}

	// 加1
	private synchronized void inc() {
		j++;
		System.out.println(Thread.currentThread().getName() + "-inc:" + j);
	}

	// 减1
	private synchronized void dec() {
		j--;
		System.out.println(Thread.currentThread().getName() + "-dec:" + j);
	}

	/*// 测试程序
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		// 创建两个线程类
		Thread thread = null;
		Inc inc = test.new Inc();
		Dec dec = test.new Dec();
		// 启动4个线程
		for (int i = 0; i < 2; i++) {
			thread = new Thread(inc);
			thread.start();
			thread = new Thread(dec);
			thread.start();
		}
	}*/
}
