import java.util.*;

public class Employee{
	private String firstName;
	private String lastName;
	private String hireYear;
	ArrayList<Smartphone> listOfSmartphones = new ArrayList<>();

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
    	listOfSmartphones.add(smart);
    }

    public void deleteSmartphone(String brand, String model, int phoneNumber){
        if(listOfSmartphones.size()==0)
            System.out.println("Il n'y a aucun téléphone d'associé");
        else{
            for (int i=0; i<listOfSmartphones.size(); i++ ) {
                if ((listOfSmartphones.get(i).getBrand()).equals(brand) && (listOfSmartphones.get(i).getModel()).equals(model) && listOfSmartphones.get(i).getPhoneNumber()==phoneNumber){
                listOfSmartphones.remove(i);
                }
            }
        }
    }

    public void changePhoneNumber(String brand, String model, int phoneNumber){
        for (int i=0; i<listOfSmartphones.size(); i++ ) {
            if ((listOfSmartphones.get(i).getBrand()).equals(brand) && (listOfSmartphones.get(i).getModel()).equals(model)){
            	listOfSmartphones.get(i).setPhoneNumber(phoneNumber);
            }
        }
    }
    
    public void display() {
    	System.out.println("Son pr?om est " + firstName + ", son nom de famille est " + lastName + " et son ann? d'entr? dans l'entreprise est " + hireYear );
        if(listOfSmartphones.size()==0)
            System.out.println("Il n'y a aucun téléphone d'associé");
        else{
            System.out.println("Il n'y a " + listOfSmartphones.size() + " téléphone(s) d'associé(s)");
            for (int i=0; i<listOfSmartphones.size(); i++ ) {
                listOfSmartphones.get(i).display();
            }
        }
    }
}

