/**
 * Object management Device Laptop
 * @author Tom Durand
 * @version 1.0
 */
public class Laptop extends Device {
	private String typeOfKeyboard;
	private String operativeSystem;
	
	/**
	 * Creates a Laptop Object, which is also a Device
	 * @param typeOfKeyboard
	 * @param operativeSystem 
	 */
	public Laptop(String serialNumber, Double width, Double length, Double weight, String brand, String model, String typeOfKeyboard, String operativeSystem) {
		super(serialNumber, width, length, weight, brand, model);
		this.typeOfKeyboard=typeOfKeyboard;
		this.operativeSystem=operativeSystem;
	}
	
		// GETTER //

	/**
	 * Returns the type of the keyboard (Azerty or Querty ...)
	 * @return typeOfKeyboard
	 */
	public String getTypeOfKeyboard(){
		return typeOfKeyboard;
	}

	/**
	 * Returns the OS (Microsoft / Linux or Mac OS...)
	 * @return operativeSystem
	 */
	public String getOperativeSystem(){
		return operativeSystem;
	}

		// SETTER //

	/**
	 * Sets the new keyboard of the Laptop
	 * @param typeOfKeyboard 
	 */	
	public void setTypeOfKeyboard(String typeOfKeyboard){
		this.typeOfKeyboard=typeOfKeyboard;
	}

	/**
	 * Sets the new OS of the Laptop
	 * @param operativeSystem 
	 */	
	public void setOperativeSystem(String operativeSystem){
		this.operativeSystem=operativeSystem;
	}

	/**
	 * Display all the info related to the device
	 */	
	public void display(){
		System.out.println("Type of device.....: laptop");
		super.display();
		System.out.println("Type Of Keyboard...: " + typeOfKeyboard);
		System.out.println("Type Of OS.........: " + operativeSystem);
	}
} 