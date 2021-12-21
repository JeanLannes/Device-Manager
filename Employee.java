/**
 * Object management Employee
 * @author Tom Durand
 * @version 1.0
 */
import java.util.*;

public class Employee{
	private String firstName;
	private String lastName;
	private String hireYear;
    ArrayList<Smartphone> listOfSmartphone = new ArrayList<Smartphone>();
    ArrayList<Pad> listOfPad = new ArrayList<Pad>();
    ArrayList<Laptop> listOfLaptop = new ArrayList<Laptop>();
    Scanner scan = new Scanner(System.in);

    /**
     * Creates an Employee Object
     */ 
	public Employee(String firstName, String lastName, String hireYear){
		this.firstName=firstName;
		this.lastName=lastName;
		this.hireYear=hireYear;
	}

        // GETTER

    /**
     * Returns the last name of the employee
     * @return lastName 
     */
	public String getLastName(){
	    return lastName;
	}

    /**
     * Returns the first name of the employee
     * @return firstName 
     */	
	public String getFirstName(){
	    return firstName;
	}

    /**
     * Returns the year of employment of the employee
     * @return hireYear 
     */
	public String getHireYear(){
	    return hireYear;
    }

        // SETTER 

    /**
     * Sets the last name of the employee
     * @param lastName 
     */
    public void setLastName(String lastName){
    	this.lastName=lastName;
    }

    /**
     * Sets the first name of the employee
     * @param firstName 
     */ 
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    /**
     * Sets the year of employment of the employee
     * @param hireYear 
     */
    public void setHireYear(String hireYear){
        this.hireYear=hireYear;
    }

        // OTHER METHODS 

    /**
     * Display the info related to the employee
     */ 
    public void display() {
        System.out.println("First name.........: " + firstName);
        System.out.println("Last name..........: " + lastName);
        System.out.println("Hire Year..........: " + hireYear);
    }

    /**
     * Adds a device in the list linked with the employee 
     * @param type
     */ 
    public void addDevice(int type){
        System.out.println("Enter the serial number:");
        String serialNumber=scan.next();
        System.out.println("Enter the width:");
        double width=scan.nextDouble();
        System.out.println("Enter the length:");
        double length=scan.nextDouble();
        System.out.println("Enter the weight:");
        double weight=scan.nextDouble();
        System.out.println("Enter the brand:");
        String brand=scan.next();
        System.out.println("Enter the model:");
        String model=scan.next();

        if(type==1) {
            System.out.println("Please enter the phone number.");
            int phoneNumber=scan.nextInt();
            listOfSmartphone.add(new Smartphone(serialNumber, width, length, weight, brand, model, phoneNumber));
        } else if(type==2) {
            System.out.println("Please specify the type of screen.");
            String padScreen=scan.next();
            listOfPad.add(new Pad(serialNumber, width, length, weight, brand, model, padScreen));
        } else {
            System.out.println("Please specify the type of keyboard.");
            String typeOfKeyboard=scan.next();
            System.out.println("Please specify the OS.");
            String operativeSystem=scan.next();
            listOfLaptop.add(new Laptop(serialNumber, width, length, weight, brand, model, typeOfKeyboard, operativeSystem));
        }
    }

    /**
     * Modify a device in the list linked with the employee 
     * @param type
     */ 
    public void modifyDevice(int type){
        System.out.println("Enter the serial number:");
        String serialNumber=scan.next();
        int cond=0, choice;
        if(type==1) {
            for (int i=0;i<listOfSmartphone.size(); i++)
                if (serialNumber.equals(listOfSmartphone.get(i).getSerialNumber()))
                    do {
                        System.out.println("What do you want modify ?\n1/ Serial number\n2/ Width\n3/ Length\n4/ Weight\n5/ Brand\n6/ Model\n7/ Phone number\n");
                        choice=scan.nextInt();
                        cond++;
                        switch(choice) {

                            case 1: System.out.println("Enter the serial number:");
                                    listOfSmartphone.get(i).setSerialNumber(scan.next());    
                                    break;

                            case 2: System.out.println("Enter the width:");
                                    listOfSmartphone.get(i).setWidth(scan.nextDouble()); 
                                    break;

                            case 3: System.out.println("Enter the length:");
                                    listOfSmartphone.get(i).setLength(scan.nextDouble()); 
                                    break;

                            case 4: System.out.println("Enter the weight:");
                                    listOfSmartphone.get(i).setWeight(scan.nextDouble()); 
                                    break;

                            case 5: System.out.println("Enter the brand:");
                                    listOfSmartphone.get(i).setBrand(scan.next()); 
                                    break;

                            case 6: System.out.println("Enter the model:");
                                    listOfSmartphone.get(i).setModel(scan.next()); 
                                    break;

                            case 7: System.out.println("Enter the phone number:");
                                    listOfSmartphone.get(i).setPhoneNumber(scan.nextInt()); 
                                    break;

                            default:System.out.println("Enter a correct value.");
                            		cond--;
                        }
                    } while (cond==0);
        } else if(type==2) {
            for (int i=0;i<listOfPad.size(); i++)
                if (serialNumber.equals(listOfPad.get(i).getSerialNumber()))
                     do {
                        System.out.println("What do you want modify ?\n1/ Serial number\n2/ Width\n3/ Length\n4/ Weight\n5/ Brand\n6/ Model\n7/ Type of screen\n");
                        choice=scan.nextInt();
                        cond++;
                        switch(choice) {

                            case 1: System.out.println("Enter the serial number:");
                                    listOfPad.get(i).setSerialNumber(scan.next());    
                                    break;

                            case 2: System.out.println("Enter the width:");
                                    listOfPad.get(i).setWidth(scan.nextDouble()); 
                                    break;

                            case 3: System.out.println("Enter the length:");
                                    listOfPad.get(i).setLength(scan.nextDouble()); 
                                    break;

                            case 4: System.out.println("Enter the weight:");
                                    listOfPad.get(i).setWeight(scan.nextDouble()); 
                                    break;

                            case 5: System.out.println("Enter the brand:");
                                    listOfPad.get(i).setBrand(scan.next()); 
                                    break;

                            case 6: System.out.println("Enter the model:");
                                    listOfPad.get(i).setModel(scan.next()); 
                                    break;

                            case 7: System.out.println("Enter the type of screen:");
                                    listOfPad.get(i).setPadScreen(scan.next()); 
                                    break;

                            default:System.out.println("Enter a correct value."); 
                            		cond--;
                        }
                    } while (cond==0);
        } else if(type==3){
            for (int i=0;i<listOfLaptop.size(); i++)
                if (serialNumber.equals(listOfLaptop.get(i).getSerialNumber()))
                    do {
                        System.out.println("What do you want modify ?\n1/ Serial number\n2/ Width\n3/ Length\n4/ Weight\n5/ Brand\n6/ Model\n7/ Type of keyboard\n8/ OS\n");
                        choice=scan.nextInt();
                        cond++;
                        switch(choice) {

                            case 1: System.out.println("Enter the serial number:");
                                    listOfLaptop.get(i).setSerialNumber(scan.next());    
                                    break;

                            case 2: System.out.println("Enter the width:");
                                    listOfLaptop.get(i).setWidth(scan.nextDouble()); 
                                    break;

                            case 3: System.out.println("Enter the length:");
                                    listOfLaptop.get(i).setLength(scan.nextDouble()); 
                                    break;

                            case 4: System.out.println("Enter the weight:");
                                    listOfLaptop.get(i).setWeight(scan.nextDouble()); 
                                    break;

                            case 5: System.out.println("Enter the brand:");
                                    listOfLaptop.get(i).setBrand(scan.next()); 
                                    break;

                            case 6: System.out.println("Enter the model:");
                                    listOfLaptop.get(i).setModel(scan.next()); 
                                    break;

                            case 7: System.out.println("Enter the type of keyboard:");
                            		listOfLaptop.get(i).setTypeOfKeyboard(scan.next()); 
                                    break;

                            case 8: System.out.println("Enter the OS:");
                            		listOfLaptop.get(i).setOperativeSystem(scan.next()); 
                                    break;

                            default:System.out.println("Enter a correct value."); 
                                    cond--;
                        }
                    } while (cond==0);
        } else 
            System.out.println("Serial number not found.");
    }

    /**
     * Deletes a device in the list linked with the employee 
     * @param type
     */ 
    public void deleteDevice(int type){
        System.out.println("Enter the serial number:");
        String serialNumber=scan.next();
        if(type==1) {
            for (int i=0;i<listOfSmartphone.size(); i++)
                if (serialNumber.equals(listOfSmartphone.get(i).getSerialNumber()))
                    listOfSmartphone.remove(i);
        } else if(type==2) {
            for (int i=0;i<listOfPad.size(); i++)
                if (serialNumber.equals(listOfPad.get(i).getSerialNumber()))
                    listOfPad.remove(i);
        } else if(type==3){
            for (int i=0;i<listOfLaptop.size(); i++)
                if (serialNumber.equals(listOfLaptop.get(i).getSerialNumber()))
                    listOfLaptop.remove(i);
        } else 
            System.out.println("Serial number not found.");
    }

    /**
     * Displays all devices in the list linked with the employee 
     * @param type
     */ 
    public void displayAllDevices() {
    	int t=0;
        for (int i=0; i<listOfSmartphone.size(); i++) {
        	t++;
            System.out.println("******************");
            System.out.println("  Device : " + (t) + "\n");
            listOfSmartphone.get(i).display();
            System.out.println("******************\n");
        }
        for (int j=0; j<listOfPad.size(); j++) {
        	t++;
            System.out.println("******************");
            System.out.println("  Device : " + (t) + "\n");
            listOfPad.get(j).display();
            System.out.println("******************\n");
        }
        for (int k=0; k<listOfLaptop.size(); k++) {
        	t++;
            System.out.println("******************");
            System.out.println("  Device : " + (t) + "\n");
            listOfLaptop.get(k).display();
            System.out.println("******************\n");
        }
    }
}