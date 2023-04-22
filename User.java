
public abstract class User {
	protected String username;
	protected String password;
	protected PhoneBookDirectory phoneBookDirectory;
	
	public User() {
		
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public User(String username, String password, PhoneBookDirectory phoneBookDirectory) {
		this.username = username;
		this.password = password;
		this.phoneBookDirectory = phoneBookDirectory;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public PhoneBookDirectory getPhoneBookDirectory() {
		return phoneBookDirectory;
	}
	
	public void PrintUserInfo() {
		System.out.println("Username: " + username +"\nPassword: " + password);
		getPhoneBookDirectory().print();
	}
	
	public void add(PhoneBookEntry phoneBookEntry) {
		int x = getPhoneBookDirectory().addEntry(phoneBookEntry);
		if (x == 1) 
			System.out.println("The new phone entry is added.");
		else
			System.out.println("ERROR.");
	}
	public int edit(String firstName, String lastName) {
		return getPhoneBookDirectory().Edit(firstName, lastName);
	}
	public void sort() {
		this.getPhoneBookDirectory().sort();
	}
	public void linearSearch(String phoneNumber) {
		int index = getPhoneBookDirectory().LinearSearchByPhoneNumber(phoneNumber);
		if (index == 1)
			getPhoneBookDirectory().phoneBookEntry[index].printBookEntry();
		else 
			System.out.println("ERROR.");
	}
	
}
