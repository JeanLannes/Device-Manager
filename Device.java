/**
 * Object management Device (Smartphone / Pad / Laptop)
 * @author Tom Durand
 * @version 1.0
 */
import java.util.*;

public class Device {
	private String serialNumber;
	private Double width;
	private Double length;
	private Double weight;
	private String brand;
	private String model;
    Scanner scan = new Scanner(System.in);

	/**
	 * Creates a Device Object
	 * @param serialNumber the ID of the device
	 * @param width the width of the device
	 * @param length the length of the device
	 * @param weight the weight of the device
	 * @param brand the brand of the device
	 * @param model the model of the device
	 */
	public Device(String serialNumber, Double width, Double length, Double weight, String brand, String model) {
		this.serialNumber=serialNumber;
		this.width=width;
		this.length=length;
		this.weight=weight;
		this.brand=brand;
		this.model=model;
	}

		// GETTERS //

	/**
	 * Returns the serialNumber of the Device
	 * @return serialNumber 
	 */
	public String getSerialNumber(){
		return serialNumber;
	}

	/**
	 * Returns the width of the Device
	 * @return width 
	 */
	public Double getWidth(){
		return width;
	}

	/**
	 * Returns the length of the Device
	 * @return length 
	 */
	public Double getLength(){
		return length;
	}

	/**
	 * Returns the weight of the Device
	 * @return weight 
	 */
	public Double getWeight(){
		return weight;
	}

	/**
	 * Returns the brand of the Device
	 * @return brand 
	 */
	public String getBrand(){
		return brand;
	}

	/**
	 * Returns the model of the Device
	 * @return model 
	 */
	public String getModel(){
		return model;
	}

		// SETTER

	/**
	 * Sets the serialNumber of the Device
	 * @return serialNumber 
	 */
	public void setSerialNumber(String serialNumber){
		this.serialNumber=serialNumber;
	}

	/**
	 * Sets the width of the Device
	 * @param width 
	 */
	public void setWidth(double width){
		this.width=width;
	}

	/**
	 * Sets the length of the Device
	 * @param length 
	 */
	public void setLength(double length){
		this.length=length;
	}

	/**
	 * Sets the weight of the Device
	 * @param weight 
	 */
	public void setWeight(double weight){
		this.weight=weight;
	}

	/**
	 * Sets the brand of the Device
	 * @param brand 
	 */
	public void setBrand(String brand){
		this.brand=brand;
	}

	/**
	 * Sets the model of the Device
	 * @param model 
	 */
	public void setModel(String model){
		this.model=model;
	}

		// OTHER METHODS 

	/**
	 * Display all the info related to the device
	 */	
	public void display(){
		System.out.println("Serial number......: " + serialNumber);
		System.out.println("Width..............: " + width);
		System.out.println("Length.............: " + length);
		System.out.println("Weight.............: " + weight);
		System.out.println("Brand..............: " + brand);
		System.out.println("Model..............: " + model);
	}
} 