package oop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Light implements ITrafficLight{
	
	private int interval;

	public Light(int interval) {
		this.interval = interval;
	}

	@Override
	public void showSignal() {
		System.out.println(" Горит "+DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now()));
		try {
			Thread.sleep(interval*1000*60);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
