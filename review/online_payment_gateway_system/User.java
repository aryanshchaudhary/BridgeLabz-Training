package online_payment_gateway_system;

abstract class User implements Payment {
	protected String name;
	protected String email;
	protected String item;

	public User(String name, String email, String item) {
		this.name = name;
		this.email = email;
		this.item = item;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public String getItem() {
		return item;
	}
}
