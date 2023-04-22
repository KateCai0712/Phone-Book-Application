
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class PhoneBookApplication {
	public static void main(String[] args) throws FileNotFoundException {
		//Declare variables
		int choice, id, x;
		String firstName, lastName, email, zipCode, phone, password, username;
		
		//Create a Scanner object called input
		Scanner input = new Scanner(System.in);
		//Create a PhoneBookAdmin object called admin and a NormalUser object called normal
		PhoneBookAdmin admin = new PhoneBookAdmin();
		NormalUser normal = new NormalUser();
		
		//Read from PhoneBookAdmin.txt
		String fileName1 = "/Users/kate/eclipse-workspace/KateCai_Homework_7/PhoneBookAdmin.txt";
		FileReader reader1 = new FileReader(fileName1);
		Scanner input1 = new Scanner(reader1);
		String line1 = input1.nextLine();
		String[] split= line1.split(",");
		admin = new PhoneBookAdmin(split[0], split[1], split[2], new PhoneBookDirectory());	
		//Read from NormalUser.txt
		String fileName2 = "/Users/kate/eclipse-workspace/KateCai_Homework_7/NormalUser.txt";
		FileReader reader2 = new FileReader(fileName2);
		Scanner input2 = new Scanner(reader2);
		String line2 = input2.nextLine();
		String[] split2= line2.split(",");
		normal = new NormalUser(Integer.parseInt(split2[0]), split2[1], split2[2], new PhoneBookDirectory());	
		
		//Prompt the user to enter a username and password
		System.out.println("Welcome to Phone Book Application.\nEnter you Username and Password (Separate with a space): ");
		username = input.next();
		password = input.next();
		//if the user is an administrator, display the menu
		if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
			System.out.println("Welcome Administrator.");
			do {
				System.out.println("Menu:\n1. Add a phone entry\n2. Edit a phone entry of a given first name and last name\n3. Delete a phone entry of a given first name and last name\n4. Sort the PhoneBookDirectory\n5. Search using Linear Search\n6. Search using Binary Search\n7. Print Admin’s info\n8. Change Password\n9. Change Username\n10. Exit");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println("Enter ID, First name, Last name, Email, Zip code, and Phone number: ");
					id = input.nextInt();
					firstName = input.next();
					lastName = input.next();
					email = input.next();
					zipCode = input.next();
					phone = input.next();
					PhoneBookEntry addEntry = new PhoneBookEntry(id, firstName, lastName, email, zipCode, phone);
					admin.add(addEntry);
					input.nextLine();
				}else if (choice == 2) {
					System.out.println("Enter the first name and last name of the phone entry you want to edit: ");
					firstName = input.next();
					lastName = input.next();
					x = admin.edit(firstName, lastName);
					if (x == 1) 
						System.out.println("The phone entry is edited.");
					else
						System.out.println("ERROR.");
					input.nextLine();
				}else if (choice == 3) {
					System.out.println("Enter the first name and last name of the phone entry you want to delete: ");
					firstName = input.next();
					lastName = input.next();
					x = admin.delete(firstName, lastName);
					if (x == 1)
						System.out.println("The phone entry is deleted.");
					else
						System.out.println("ERROR");
					input.nextLine();
				}else if (choice == 4) {
					admin.sort();
					System.out.println("The phone entry is sorted.");
				}else if (choice == 5) {
					System.out.println("Enter the phone number of the phone entry you want to find: ");
					phone = input.next();
					admin.linearSearch(phone);
					input.nextLine();
				}else if (choice == 6) {
					System.out.println("Enter the id of the phone entry you want to find: ");
					id = input.nextInt();
					admin.binarySearch(id);
					input.nextLine();
				}else if (choice == 7) {
					admin.PrintUserInfo();
				}else if (choice == 8) {
					System.out.println("Enter the new password: ");
					password = input.next();
					admin.changePassword(password);
				}else if (choice == 9) {
					username = input.next();
					admin.changeUsername(username);
				}
			}while (choice != 10);
		}
		//if the user is a normal user, display the menu
		if (username.equals(normal.getUsername()) && password.equals(normal.getPassword())) {
			System.out.println("Welcome Normal User.");
			do {
				System.out.println("Menu:\n1. Add a phone entry\n2. Edit a phone entry of a given first name and last name\n3. Sort the PhoneBookDirectory\n4. Search using Linear Search\n5. Print User's info\n6. Exit");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println("Enter ID, First name, Last name, Email, Zip code, and Phone number: ");
					id = input.nextInt();
					firstName = input.next();
					lastName = input.next();
					email = input.next();
					zipCode = input.next();
					phone = input.next();
					PhoneBookEntry addEntry = new PhoneBookEntry(id, firstName, lastName, email, zipCode, phone);
					normal.add(addEntry);
					input.nextLine();
				}else if (choice == 2) {
					System.out.println("Enter the first name and last name of the phone entry you want to edit: ");
					firstName = input.next();
					lastName = input.next();
					x = normal.edit(firstName, lastName);
					if (x == 1) 
						System.out.println("The phone entry is edited.");
					else
						System.out.println("ERROR.");
					input.nextLine();
				}else if (choice == 3) {
					normal.sort();
					System.out.println("The phone entry is sorted.");
				}else if (choice == 4) {
					System.out.println("Enter the phone number of the phone entry you want to find: ");
					phone = input.next();
					normal.linearSearch(phone);
					input.nextLine();
				}else if (choice == 5) {
					normal.PrintUserInfo();
				}
			}while (choice != 6);		
		}	
		
		input.close();
		input1.close();
		input2.close();
	}

}
