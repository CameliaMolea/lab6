package laborator5;

public class Masina extends Sofer {
	private int rezultat;
	Motor motor;

	public void autotestare()
	{
	}

	public int pornire() 
	{
		motor.pornireMotor();
		autotestare();
		return rezultat; 
	}
	
	public int oprire() {
		motor.stingeMotor();
		return rezultat;
	}
}
