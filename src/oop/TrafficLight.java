package oop;

//��������
public class TrafficLight {

	private ITrafficLight redLight;
	private ITrafficLight yellowLight;
	private ITrafficLight greenLight;
	
	public TrafficLight(ITrafficLight redLight, ITrafficLight yellowLight, ITrafficLight greenLight) {
		this.redLight = redLight;
		this.yellowLight = yellowLight;
		this.greenLight = greenLight;
	}
	
	public void Show() {	
		System.out.print("������� ");
		redLight.showSignal();
		System.out.print("������ ");
		yellowLight.showSignal();
		System.out.print("������� ");
		greenLight.showSignal();
	}
	
	
}
