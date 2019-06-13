

public class JavaScanner{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = kin.nextLine();

		System.out.print("What is your last name? ");
		String lastname = kin.nextLine();

		System.out.println("Hello " + name + " " + lastname + ", it's nice to meet you!");

		System.out.print("What is your Street Address? ");
		String address = kin.nextLine();

		System.out.print("What city do you live in? ");
		String city = kin.nextLine();

		System.out.print("What state do you live in? ");
		String state = kin.nextLine();

		System.out.print("What is your zip code? ");
		String zipcode = kin.nextLine();

		System.out.print("\n");

		System.out.println(name + " " + lastname);
		System.out.println(address);
		System.out.println(city + ", " + state + " " + zipcode);
	}
}
