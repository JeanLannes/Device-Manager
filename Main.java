import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner lectureScanner = new Scanner(System.in);
		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		int quitMenuCondition=0, choice=0;
		String firstName, lastName, newName, brand, model, hireYear;
		int phoneNumber;

		do{
			System.out.println("******************\n1/ Ajouter un employé à la base de données\n2/ Supprimer un employé de la base de données\n3/ Modifier le prénom d'un employé dans la base de données\n4/ Afficher tous les employés de la base de données\n5/ Associer un Smartphone à un employé\n6/ Dissocier un Smartphone d'un employé\n7/ Affecter un nouveau numéro à un Smartphone\n10/ Quitter\n******************");
			choice = lectureScanner.nextInt();
			switch(choice){

				case 1: System.out.println("Veuillez entrer le nom de l'employé : ");
						lastName=lectureScanner.next();
						System.out.println("Veuillez entrer le prénom de l'employé : ");
						firstName=lectureScanner.next();
						System.out.println("Veuillez entrer la date d'embauche : ");
						hireYear=lectureScanner.next();
						listOfEmployees.add(new Employee(firstName, lastName, hireYear));
						break;

				case 2: System.out.println("Veuillez entrer le nom de l'employé : ");
						lastName = lectureScanner.next();
						System.out.println("Veuillez entrer le prénom de l'employé : ");
						firstName = lectureScanner.next();
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(firstName) && (listOfEmployees.get(i).getLastName()).equals(lastName))
								listOfEmployees.remove(i);
						}
						break;

				case 3: System.out.println("Veuillez entrer le nom de l'employé : ");
						lastName = lectureScanner.next();
						System.out.println("Veuillez entrer le prénom de l'employé : ");
						firstName = lectureScanner.next();
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(firstName) && (listOfEmployees.get(i).getLastName()).equals(lastName)){
								System.out.println("Nouveau Nom : ");
								newName = lectureScanner.next();
								listOfEmployees.get(i).setLastName(newName);
							}
						}
						break;

				case 4: for (int i=0; i<listOfEmployees.size(); i++) {
							listOfEmployees.get(i).display();
						}
						break;		
				
				case 5: System.out.println("Veuillez entrer le nom de l'employé : ");
						lastName = lectureScanner.next();
						System.out.println("Veuillez entrer le prénom de l'employé : ");
						firstName = lectureScanner.next();
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(firstName) && (listOfEmployees.get(i).getLastName()).equals(lastName)){
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
						lastName = lectureScanner.next();
						System.out.println("Veuillez entrer le prénom de l'employé : ");
						firstName = lectureScanner.next();
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(firstName) && (listOfEmployees.get(i).getLastName()).equals(lastName)){
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
						lastName = lectureScanner.next();
						System.out.println("Veuillez entrer le prénom de l'employé : ");
						firstName = lectureScanner.next();
						for (int i=0; i<listOfEmployees.size(); i++) {
							if ((listOfEmployees.get(i).getFirstName()).equals(firstName) && (listOfEmployees.get(i).getLastName()).equals(lastName)){
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

				case 10: quitMenuCondition++;
						break;

				default: System.out.println("VALEUR INCORRECTE !");

			}
		} while (quitMenuCondition==0);

		
	}
}
