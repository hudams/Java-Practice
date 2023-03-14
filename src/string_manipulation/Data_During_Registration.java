package string_manipulation;

public class Data_During_Registration {

	public static void main(String[] args) {

		String email = "john@example.com";
		String phone = "1234567890";
		String pass = "Pass123";

		if (!email.isEmpty()) {
			System.out.println("Email is Available");
			if (!email.contains("@") && !email.contains(".")) {
				System.out.println("Email is valid !!!");
			} else {
				System.out.println("Email is not valid !!!");
			}
		} else {
			System.out.println("Please provide an email");
		}

		if (!phone.isEmpty()) {
			System.out.println("Phone number is Available");
			if (phone.length() != 10) {
				System.out.println("Phone number is invalid!!!");
			} else {
				System.out.println("Phone number is valid!!!");
			}

		} else {
			System.out.println("Please provide a phone number");
		}
	}
}
