/**
 * Object management Device (Smartphone / Pad / Laptop)
 * @author Tom Durand
 * @version 0.2
 */
import java.util.*;

public class Main {

	public static String lastName() {
		Scanner lectureScanner = new Scanner(System.in);
		System.out.println("Enter the employee's name........:");
		return(lectureScanner.next());
	}

	public static String firstName() {
		Scanner lectureScanner = new Scanner(System.in);
		System.out.println("Enter the employee's first name..: ");
		return(lectureScanner.next());
	}

	public static String hireYear() {
		Scanner lectureScanner = new Scanner(System.in);
		System.out.println("Enter the date of employment.....: ");
		return(lectureScanner.next());
	}

	public static void main(String[] args) {

		Scanner lectureScanner = new Scanner(System.in);
		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		int quitMenuCondition=0, choiceEmployee=0, phoneNumber, ifValue=0? quitSubMenuCondition=0, subChoice=0,;
		String lName, fName, newName, brand, model;

		do{
			System.out.println("******************\n1/ Add an employee to the database\n2/ Delete an employee from the database\n3/ Modify the first name of an employee in the database\n4/ Display all employees in the database\n5/ Device menu\n6/ Leave\n******************");
			choiceEmployee = lectureScanner.nextInt();
			switch(choiceEmployee){

				case 1: listOfEmployees.add(new Employee(firstName(), lastName(), hireYear()));
						break;

				case 2: lName = lastName();
						fName = firstName();
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

				case 3: lName = lastName();
						fName = firstName();
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(fName) && (listOfEmployees.get(i).getLastName()).equals(lName)){
								System.out.println("New Name : ");
								newName = lectureScanner.next();
								listOfEmployees.get(i).setLastName(newName);
							}
						}
						if (ifValue == 0) 
							System.out.println("Employee not found.");
						else
							ifValue=0;
						break;

				case 4: for (int i=0; i<listOfEmployees.size(); i++) {
							System.out.println("******************");
							System.out.println("  Employee : " + (i+1) + "\n");
							listOfEmployees.get(i).display();
							System.out.println("******************");
						}
						break;		

				case 5: lName = lastName();
						fName = firstName();
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(fName) && (listOfEmployees.get(i).getLastName()).equals(lName)){
								ifValue++;
								do {
									System.out.println("******************\n1/ Show all devices\n2/ Smartphone\n3/ Pad\n4/ Laptop\n5/ Return\n******************");
									subChoice=lectureScanner.nextInt();
									switch (subChoice) {
										case 1: listOfEmployees.get(i).displayAll();
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
/*				

				case 5: for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(fName) && (listOfEmployees.get(i).getLastName()).equals(lName)){
								System.out.println("Marque : ");
								brand = lectureScanner.next();
								System.out.println("Modèle : ");
								model = lectureScanner.next();
								System.out.println("Numéro de téléphone : ");
								phoneNumber = lectureScanner.nextInt();
								listOfEmployees.get(i).addSmartphone(new Smartphone(brand, model, phoneNumber));
								listOfEmployees.get(i).display();
							}

						}
						break;

				case 6: System.out.println("Veuillez entrer le nom de l'employé : ");
						lName = lectureScanner.next();
						System.out.println("Veuillez entrer le prénom de l'employé : ");
						fName = lectureScanner.next();
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(fName) && (listOfEmployees.get(i).getLastName()).equals(lName)){
								System.out.println("Marque : ");
								brand = lectureScanner.next();
								System.out.println("Modèle : ");
								model = lectureScanner.next();
								System.out.println("Numéro de téléphone : ");
								phoneNumber = lectureScanner.nextInt();
								listOfEmployees.get(i).deleteSmartphone(brand, model, phoneNumber);
							}
						}
						break;
						
				case 7: System.out.println("Veuillez entrer le nom de l'employé : ");
						lName = lectureScanner.next();
						System.out.println("Veuillez entrer le prénom de l'employé : ");
						fName = lectureScanner.next();
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(fName) && (listOfEmployees.get(i).getLastName()).equals(lName)){
								System.out.println("Marque : ");
								brand = lectureScanner.next();
								System.out.println("Modèle : ");
								model = lectureScanner.next();
								System.out.println("Nouveau numéro de téléphone : ");
								phoneNumber = lectureScanner.nextInt();
								listOfEmployees.get(i).changePhoneNumber(brand, model, phoneNumber);
							}
						}
						break;
*/
				case 6: quitMenuCondition++;
						break;

				default: System.out.println("VALEUR INCORRECTE !");

			}
		} while (quitMenuCondition==0);

		
	}
}
