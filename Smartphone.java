/**
 * Object management Smartphone
 * @author Tom Durand
 * @version 0.2
 */
public class Smartphone extends Device {
	private int phoneNumber;

	/**
	 * Creates a Smartphone Object, which is also a Device
	 * @param phoneNumber 
	 */
	public Smartphone(String serialNumber, Double width, Double length, Double weight, String brand, String model, int phoneNumber){
		super(serialNumber, width, length, weight, brand, model);
		this.phoneNumber=phoneNumber;
	}

		// GETTER //

	/**
	 * Creates a Smartphone Object, which is also a Device
	 * @return phoneNumber 
	 */
	public int getPhoneNumber(){
		return phoneNumber;
	}

		// SETTER //

	/**
	 * Sets a new phone number
	 * @param phoneNumber 
	 */	
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber=phoneNumber;
	}

	// OTHER METHODS //

}
