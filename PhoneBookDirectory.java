import java.util.Scanner;

public class PhoneBookDirectory {
	//Create a Scanner object called input
	private Scanner input = new Scanner(System.in);
	//Declare variables
	PhoneBookEntry[] phoneBookEntry = new PhoneBookEntry[6];
	
	public PhoneBookDirectory() {
		for (int i=0; i<phoneBookEntry.length; i++) {
			phoneBookEntry[i]=new PhoneBookEntry();
		}
	}

//Add an entry to the phone book
public int addEntry(PhoneBookEntry entry) {
	int index = -1;
	for (int i=0; i<phoneBookEntry.length; i++) {
		if (phoneBookEntry[i].getFirstName()==null && phoneBookEntry[i].getId()==-1) {
			index = i;
			break;
		}
	}
	if (index == -1)
		return 0;
	else {
		phoneBookEntry[index] = entry;
		return 1;
	}
}
//Print all phone book entries
public void print() {
	System.out.println("The phone book entries are:");
	for (int i=0; i<phoneBookEntry.length; i++) {
		phoneBookEntry[i].printBookEntry();
	}
}
//Search for an entry by phone number
public int LinearSearchByPhoneNumber(String PhoneNumber) {
	for (int i=0; i<phoneBookEntry.length; i++) {
		if (PhoneNumber.equals(phoneBookEntry[i].getPhone()))
			return 1;
	}
	return 0;
}
//Search for an entry by id
public PhoneBookEntry SearchbyIdBinarySearch(int id) {
	
	sort();
	
	int low = 0;
	int high = phoneBookEntry.length-1;
	int mid;
	
	while (high >= low) {
		mid = (low+high)/2;
		if (id < phoneBookEntry[mid].getId()) 
			high = mid-1;
		else if (id == phoneBookEntry[mid].getId())
			return phoneBookEntry[mid];
		else
			low = mid+1;
	}
	return new PhoneBookEntry();
}
//Sort phone book entries by id
public void sort() {
	int min, minIndex;
	PhoneBookEntry temp;
	
	for (int i=0; i<phoneBookEntry.length-1; i++) {
		min = phoneBookEntry[i].getId();
		minIndex = i;
		for (int j=1; j<phoneBookEntry.length; j++) {
			if (min > phoneBookEntry[j].getId()) {
				min = phoneBookEntry[j].getId();
				minIndex = j;
			}
		}
		if (minIndex != i) {
			temp = phoneBookEntry[i];
			phoneBookEntry[i] = phoneBookEntry[minIndex];
			phoneBookEntry[minIndex] = temp;
		}
	}
	
}
//Edit an entry
public int Edit(String firstName, String lastName) {
	String first, last, email, zip, phone;
	
	for (int i=0; i<phoneBookEntry.length; i++) {
		if (firstName.equals(phoneBookEntry[i].getFirstName()) && lastName.equals(phoneBookEntry[i].getLastName())) {
			System.out.println("Enter the new first name you want to change to: ");
			first = input.nextLine();
			phoneBookEntry[i].setFirstName(first);
			System.out.println("Enter the new last name you want to change to: ");
			last = input.nextLine();
			phoneBookEntry[i].setLastName(last);
			System.out.println("Enter the new email you want to change to: ");
			email = input.nextLine();
			phoneBookEntry[i].setEmail(email);
			System.out.println("Enter the new zip code you want to change to: ");
			zip = input.nextLine();
			phoneBookEntry[i].setZipCode(zip);
			System.out.println("Enter the new phone number you want to change to: ");
			phone = input.nextLine();
			phoneBookEntry[i].setPhone(phone);
			input.nextLine();
			return 1;
		}
	}
	return 0;
}
//Delete an entry of a given id
public int DeleteEntry(int id) {
	int x = 0;
	int index = -1;
	
	for (int i=0; i<phoneBookEntry.length; i++) {
		if (phoneBookEntry[i].getId()==id) {
			x = 1;
			index = i;
			break;
		}
	}
	if (x==0) 
		return 0;
	else {
		phoneBookEntry[index] = new PhoneBookEntry();
		return 1;
	}
		
		
	
}
}
