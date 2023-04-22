
public class NormalUser extends User implements InterfaceNormalUser{
	private int id;
	
	public NormalUser() {
		super();
	}

	public NormalUser(int id, String username, String password, PhoneBookDirectory phoneBookDirectory) {
		super(username, password, phoneBookDirectory);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void PrintUserInfo() {
		System.out.println("Id: " + id + "\nUsername: " + username + "\nPassword: " + password);
		getPhoneBookDirectory().print();
	}
}
