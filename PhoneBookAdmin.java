
public class PhoneBookAdmin extends User implements InterfaceAdmin{
	private String emailAddress;

	public PhoneBookAdmin() {
		super();
	}

	public PhoneBookAdmin(String username, String password, String emailAddress, PhoneBookDirectory phoneBookDirectory) {
		super(username, password, phoneBookDirectory);
		this.emailAddress = emailAddress;
	}
	//Getter and setter
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public void PrintUserInfo() {
		System.out.println("Username: " + username + "\nPassword: " + password + "\nEmail address: " + emailAddress);
		getPhoneBookDirectory().print();
	}
	
	public int delete(String firstName, String lastName) {
		int num = 0;
		
		for (int i=0; i<6; i++) {
			if (firstName == getPhoneBookDirectory().phoneBookEntry[i].getFirstName() && lastName == getPhoneBookDirectory().phoneBookEntry[i].getLastName() && firstName != null) {
				num = i;
				break;
			}
		}
		return this.getPhoneBookDirectory().DeleteEntry(num);
	}
	public void binarySearch(int id) {
		PhoneBookEntry x = getPhoneBookDirectory().SearchbyIdBinarySearch(id);
		if (x != new PhoneBookEntry())
			x.printBookEntry();
		else
			System.out.println("ERROR.");
	}
	public void changePassword(String password) {
		this.password = password;
	}
	public void changeUsername(String username) {
		this.username = username;
		
	}
}
