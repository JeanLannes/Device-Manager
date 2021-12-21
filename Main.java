/**
 * @author Tom Durand
 * @version 1.0
 */
import java.util.*;

public class Main {

	/**
	 * Returns the last name of the employee
	 * @return lastName  
	 */	
	public static String lastName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the employee's name........:");
		return(scan.next());
	}

	/**
	 * Returns the first name of the employee
	 * @return firstName  
	 */	
	public static String firstName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the employee's first name..: ");
		return(scan.next());
	}

	/**
	 * Returns the year of employment of the employee
	 * @return hireYear  
	 */	
	public static String hireYear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the date of employment.....: ");
		return(scan.next());
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		int quitMenuCondition=0, choiceEmployee=0, phoneNumber, ifValue=0, quitSubMenuCondition=0, subChoice=0, deviceMenu=0;
		String lName, fName, newName, brand, model;

		do{
			System.out.println("******************\n1/ Add an employee to the database\n2/ Delete an employee from the database\n3/ Modify the first name of an employee in the database\n4/ Display all employees in the database\n5/ Device menu\n6/ Leave\n******************");
			choiceEmployee = scan.nextInt();
			switch(choiceEmployee){

				case 1: listOfEmployees.add(new Employee(firstName(), lastName(), hireYear()));		//Add an Employee
						break;

				case 2: fName = firstName();	//Delete an employee
						lName = lastName();		
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(fName) && (listOfEmployees.get(i).getLastName()).equals(lName)) {
								listOfEmployees.remove(i);
								ifValue++;
							}
						}
						if (ifValue == 0) 
							System.out.println("Employee not found.");
						else
							ifValue=0;
						break;

				case 3: fName = firstName();	//Modify the first name of an employee
						lName = lastName();		
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(fName) && (listOfEmployees.get(i).getLastName()).equals(lName)){
								System.out.println("New Name : ");
								newName = scan.next();
								listOfEmployees.get(i).setLastName(newName);
							}
						}
						if (ifValue == 0) 
							System.out.println("Employee not found.");
						else
							ifValue=0;
						break;

				case 4: for (int i=0; i<listOfEmployees.size(); i++) {		//Display all employees
							System.out.println("\n******************");
							System.out.println("  Employee : " + (i+1) + "\n");
							listOfEmployees.get(i).display();
							System.out.println("******************\n");
						}
						break;		

				case 5: fName = firstName();		// DEVICE MENU
						lName = lastName();
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(fName) && (listOfEmployees.get(i).getLastName()).equals(lName)){
								ifValue++;
								do {
									System.out.println("******************\n1/ Show all devices\n2/ Smartphone\n3/ Pad\n4/ Laptop\n5/ Return\n******************");
									subChoice=scan.nextInt();
									switch (subChoice) {

										case 1: listOfEmployees.get(i).displayAllDevices();
												break;
										
										case 2: do {
													System.out.println("******************\n1/ Add\n2/ Modify\n3/ Delete\n******************");
													deviceMenu=scan.nextInt();
													switch (deviceMenu) {

														case 1: listOfEmployees.get(i).addDevice(1);
																break;

														case 2: listOfEmployees.get(i).modifyDevice(1);
																break;
 
														case 3: listOfEmployees.get(i).deleteDevice(1);
																break;

														default:System.out.println("Enter a correct value.");

													}
												} while (deviceMenu==0);
												break;
										
										case 3: do {
													System.out.println("******************\n1/ Add\n2/ Modify\n3/ Delete\n******************");
													deviceMenu=scan.nextInt();
													switch (deviceMenu) {
														
														case 1: listOfEmployees.get(i).addDevice(2);
																break;

														case 2: listOfEmployees.get(i).modifyDevice(2);
																break;

														case 3: listOfEmployees.get(i).deleteDevice(2);
																break;

														default:System.out.println("Enter a correct value.");

													}
												} while (deviceMenu==0);
												break;
												
										case 4: do {
													System.out.println("******************\n1/ Add\n2/ Modify\n3/ Delete\n******************");
													deviceMenu=scan.nextInt();
													switch (deviceMenu) {
														
														case 1: listOfEmployees.get(i).addDevice(3);
																break;

														case 2: listOfEmployees.get(i).modifyDevice(3);
																break;

														case 3: listOfEmployees.get(i).deleteDevice(3);
																break;

														default:System.out.println("Enter a correct value.");

													}
												} while (deviceMenu==0);
												break;

										case 5: quitSubMenuCondition++;
												break;

									}
								} while (quitSubMenuCondition==0);
							}
						}
						if (ifValue == 0) 
							System.out.println("Employee not found.");
						else
							ifValue=0;
						break;

				case 6: quitMenuCondition++;
						break;

				default: System.out.println("VALEUR INCORRECTE !");

			}
		} while (quitMenuCondition==0);

		
	}
}
