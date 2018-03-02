package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {
		int red, 		//длительность красного сиганла в минутах
			yellow, 	//длительность желтого сиганла в минутах
			green;		//длительность зеленого сиганла в минутах
		
		System.out.println("Длительность красного сигнала:");
		red=readIntervalFromConsole();
		System.out.println("Длительность желтого сигнала:");
		yellow=readIntervalFromConsole();
		System.out.println("Длительность зеленого сигнала:");
		green=readIntervalFromConsole();

		System.out.println("Зупускаем тест:");
		
		//создаем светофор с тремя огнями, интервал передаем в конструктор каждого огня
		new TrafficLight(new Light(red), new Light(yellow), new Light(green)).Show();
		
		System.out.println("Конец "+DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now()));
	}

	private static int readIntervalFromConsole() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String buf=null;
		int interval=0;
		try {
			buf = br.readLine();
			interval=Integer.valueOf(buf);
		} catch (IOException e) {
			e.printStackTrace();
		}			

		return interval;
	}
	
}
