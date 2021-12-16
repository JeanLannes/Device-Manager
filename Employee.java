/**
 * Object management Device (Smartphone / Pad / Laptop)
 * @author Tom Durand
 * @version 0.2
 */
import java.util.*;

public class Employee{
	private String firstName;
	private String lastName;
	private String hireYear;
    ArrayList<Smartphone> listOfSmartphone = new ArrayList<>();
    ArrayList<Smartphone> listOfPad = new ArrayList<>();
	ArrayList<Smartphone> listOfLaptop = new ArrayList<>();

	public Employee(String firstName, String lastName, String hireYear){
		this.firstName=firstName;
		this.lastName=lastName;
		this.hireYear=hireYear;
	}

	public String getLastName(){
	    return lastName;
	}
	
	public String getFirstName(){
	    return firstName;
	}

	public String getHireYear(){
	    return hireYear;
    }

    public void setLastName(String lastName){
    	this.lastName=lastName;
    }

    public void addSmartphone(Smartphone smart){
    	listOfDevice.add(smart);
    }

    public void deleteSmartphone(String brand, String model, int phoneNumber){
        if(listOfDevice.size()==0)
            System.out.println("Il n'y a aucun téléphone d'associé");
        else{
            for (int i=0; i<listOfDevice.size(); i++ ) {
                if ((listOfDevice.get(i).getBrand()).equals(brand) && (listOfDevice.get(i).getModel()).equals(model) && listOfDevice.get(i).getPhoneNumber()==phoneNumber){
                listOfDevice.remove(i);
                }
            }
        }
    }

    public void changePhoneNumber(String brand, String model, int phoneNumber){
        for (int i=0; i<listOfDevice.size(); i++ ) {
            if ((listOfDevice.get(i).getBrand()).equals(brand) && (listOfDevice.get(i).getModel()).equals(model)){
            	listOfDevice.get(i).setPhoneNumber(phoneNumber);
            }
        }
    }
    
    public void display() {
    	System.out.println("First Name         : " + firstName + "\nLast Name          : " + lastName + "\nYear of employment : " + hireYear);
        if(listOfDevice.size()==0)
            System.out.println("  -> No device associated.");
        else{
            System.out.println("Il n'y a " + listOfDevice.size() + " téléphone(s) d'associé(s)");
            for (int i=0; i<listOfDevice.size(); i++ ) {
                listOfDevice.get(i).display();
            }
        }
    }

    public void displayAll() {
        for (int i=0; i<listOfDevice.size(); i++) {
            System.out.println("******************");
            System.out.println("  Device : " + (i+1) + "\n");
            listOfSmartphone.get(i).display();
            System.out.println("******************");

        }
        for (int j=0; j<listOfDevice.size(); j++) {
            System.out.println("******************");
            System.out.println("  Device : " + (i+1) + "\n");
            listOfPad.get(i).display();
            System.out.println("******************");
            
        }
        for (int k=0; k<listOfDevice.size(); k++) {
            System.out.println("******************");
            System.out.println("  Device : " + (i+1) + "\n");
            listOfLaptop.get(i).display();
            System.out.println("******************");
        }
    }
}