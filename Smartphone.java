public class Smartphone{
	private String brand;
	private String model;
	private int phoneNumber;

	public Smartphone(String brand, String model, int phoneNumber){
		this.brand=brand;
		this.model=model;
		this.phoneNumber=phoneNumber;
	}
	public String getBrand(){
		return brand;
	}
	public String getModel(){
		return model;
	}
	public int getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public void display(){
		System.out.println("La marque du SmartPhone est :" + brand + "\nLe mod?e du SmartPhone est : "  + model + "\nLe num?o du SmartPhone est : " + phoneNumber);
	}
}
