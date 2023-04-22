
public class PhoneBookEntry {
	//Declare variables
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String zipCode;
	private String phone;
	//Default constructor
	public PhoneBookEntry() {
		this.id = -1;
	}
	//Constructor that creates a PhoneBookEntry with first name
	public PhoneBookEntry(String firstName) {
		this.id = -1;
		this.firstName=firstName;
	}
	//Constructor that creates a PhoneBookEntry with first name and phone number
	public PhoneBookEntry(String firstName, String phone) {
		this.firstName=firstName;
		this.phone=phone;
	}
	//Constructor that creates a PhoneBookEntry with id, first name, last name, email, zip code, and phone number
	public PhoneBookEntry(int id, String firstName, String lastName, String email, String zipCode, String phone) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.zipCode=zipCode;
		this.phone=phone;
	}
	//Getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//A method that prints all information
	public void printBookEntry() {
		System.out.println("ID: " + id + "\nFirst name: " + firstName + "\nLast name: " + lastName + "\nEmail: " + email + "\nZip code: " + zipCode + "\nPhone number: " + phone); 
	}
}
