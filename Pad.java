/**
 * Object management Device Pad
 * @author Tom Durand
 * @version 0.3
 */
public class Pad extends Device {
	private String padScreen;

	/**
	 * Creates a Pad Object, which is also a Device
	 * @param padScreen 
	 */
	public Pad(String serialNumber, Double width, Double length, Double weight, String brand, String model, String padScreen) {
		super(serialNumber, width, length, weight, brand, model);
		this.padScreen=padScreen;
	}

		// GETTER //

	/**
	 * Returns the type of the screen
	 * @return padScreen
	 */
	public String getPadScreen(){
		return padScreen;
	}

		// SETTER //

	/**
	 * Sets the new type of the screen
	 * @param padScreen 
	 */	
	public void setPadScreen(String padScreen){
		this.padScreen=padScreen;
	}

	public void display(){
		System.out.println("Type of device.....: pad");
		super.display();
		System.out.println("Type of screen.....: " + padScreen);
	}
} 