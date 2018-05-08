package main;

import assignment22.Driver;
import assignment22.Network;
import assignment22.Utility;
import user.Adult;
import user.Dependent;
import user.Person;

public class MiniNet {

	public static void main(String[] args) {
		int input = menu();
		Person person1 = null;
		Person person2 = null;
		Network network = new Network();

		while (input != 0) {
			switch (input) {
			case 1:
				Driver.addPerson();
				break;
			case 2:
				Driver.connect(person1, person2);
				break;
			case 3:
				network.listEveryone();
				break;

			case 4:
				Network.getProfile(Utility.readString("Type the name"));
				break;
			}
			input = menu();
		}
		System.out.println("Person added thanks " + person1.getName());

	}

	private static int menu() {

		System.out.println("1. Add a person");
		System.out.println("2. Connect two person");// there is an error
		System.out.println("3. List everyone");
		System.out.println("4. Get a person"); // to cheak the getprofile work or not
		System.out.println("0. Exit");
		return Utility.readInt("Enter your chooce", 0, 4);
	}

}
