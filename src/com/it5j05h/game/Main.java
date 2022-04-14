package com.it5j05h.game;

import javax.swing.JFrame;

public class Main extends Canvas implements Runnable {
	
	public static int width = 300;
	public static int height = width / 16 * 9;
	public static int scale = 3;
	
	private Thread thread;
	private JFrame frame;
	private boolean running = false;
	
	public Main() {
		
	}
	
	public syncronized void start() {
		running = true;
		thread = new Thread(this, "Display");
		thread.start();
	}
	
public syncronized void stop() {
	running = false;
	try {
	thread.join();
} catch (InterruptedException e) {
	e.printStackTrace();
}
}

public void run() {
	while (running) {
		
	}
}
}
