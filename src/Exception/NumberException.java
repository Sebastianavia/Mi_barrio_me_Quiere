package Exception;

 
public class NumberException extends Exception{
	
	private int day;
	
	public NumberException(int day) {
		super("No puede ingresar hoy");
		this.day=day;
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	

}
