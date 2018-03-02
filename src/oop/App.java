package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {
		int red, 		//������������ �������� ������� � �������
			yellow, 	//������������ ������� ������� � �������
			green;		//������������ �������� ������� � �������
		
		System.out.println("������������ �������� �������:");
		red=readIntervalFromConsole();
		System.out.println("������������ ������� �������:");
		yellow=readIntervalFromConsole();
		System.out.println("������������ �������� �������:");
		green=readIntervalFromConsole();

		System.out.println("��������� ����:");
		
		//������� �������� � ����� ������, �������� �������� � ����������� ������� ����
		new TrafficLight(new Light(red), new Light(yellow), new Light(green)).Show();
		
		System.out.println("����� "+DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now()));
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
