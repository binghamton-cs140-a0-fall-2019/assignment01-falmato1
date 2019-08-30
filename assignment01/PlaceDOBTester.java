package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		//Testing the toString method of Person Class
		var firstPerson = new DateAndPlaceOfBirth(2000, 5, 25, "Brooklyn", "NY", "United States");
		System.out.println(firstPerson.toString());
		var secondPerson = new DateAndPlaceOfBirth(1985, 5, 25, "Moscow", "Russia");
		System.out.println(secondPerson.toString());
		var thirdPerson = new DateAndPlaceOfBirth(2000, 12, 23, "Binghamton", "NY", "United States");
		System.out.println(thirdPerson.toString());
		var fourthPerson = new DateAndPlaceOfBirth(2000, 12, 23, "Los Angeles", "CA", "United States");
		System.out.println(fourthPerson.toString());
		var fifthPerson = new DateAndPlaceOfBirth(1988, 6, 03, "Seoul", "South Korea");
		System.out.println(fifthPerson.toString());
		// Testing the methods other than getter methods to check if they work
		System.out.println("Tests olderThan Method");
		//Tests olderThan method for firstPerson
		//Expected true or false
		System.out.println("Tests olderThan Method for firstPerson: ");
		System.out.println(firstPerson.olderThan(secondPerson)); // false
		System.out.println(firstPerson.olderThan(thirdPerson)); // true
		System.out.println(firstPerson.olderThan(fourthPerson)); // true
		System.out.println(firstPerson.olderThan(fifthPerson)); // false
		//Tests olderThan method for secondPerson
		System.out.println("Tests olderThan Method for secondPerson: ");
		System.out.println(secondPerson.olderThan(firstPerson)); // true
		System.out.println(secondPerson.olderThan(thirdPerson)); // true
		System.out.println(secondPerson.olderThan(fourthPerson)); // true
		System.out.println(secondPerson.olderThan(fifthPerson)); // true
		//Tests olderThan method for thirdPerson
		System.out.println("Tests olderThan Method for thirdPerson: ");
		System.out.println(thirdPerson.olderThan(firstPerson)); // false
		System.out.println(thirdPerson.olderThan(secondPerson)); // false
		System.out.println(thirdPerson.olderThan(fourthPerson)); // false
		System.out.println(thirdPerson.olderThan(fifthPerson)); // false
		//Tests olderThan method for fourthPerson
		System.out.println("Tests olderThan Method for fourthPerson: ");
		System.out.println(fourthPerson.olderThan(firstPerson)); // false
		System.out.println(fourthPerson.olderThan(secondPerson)); // false
		System.out.println(fourthPerson.olderThan(thirdPerson)); // false
		System.out.println(fourthPerson.olderThan(fifthPerson)); // false
		//Tests olderThan method for fifthPerson
		System.out.println("Tests olderThan Method for fifthPerson: ");
		System.out.println(fifthPerson.olderThan(firstPerson)); // true
		System.out.println(fifthPerson.olderThan(secondPerson)); // false
		System.out.println(fifthPerson.olderThan(thirdPerson)); // true
		System.out.println(fifthPerson.olderThan(fourthPerson)); // true


		System.out.println("Tests youngerThan Method");
		//Tests yougerThan Method for firstPerson
		System.out.println("Tests youngerThan Method for firstPerson: ");
		System.out.println(firstPerson.youngerThan(secondPerson)); // true
		System.out.println(firstPerson.youngerThan(thirdPerson)); // false
		System.out.println(firstPerson.youngerThan(fourthPerson)); // false
		System.out.println(firstPerson.youngerThan(fifthPerson)); // true
		//Tests youngerThan method for secondPerson
		System.out.println("Tests youngerThan Method for secondPerson: ");
		System.out.println(secondPerson.youngerThan(firstPerson)); // false
		System.out.println(secondPerson.youngerThan(thirdPerson)); // false
		System.out.println(secondPerson.youngerThan(fourthPerson)); // false
		System.out.println(secondPerson.youngerThan(fifthPerson)); // false
		//Tests youngerThan method for thirdPerson
		System.out.println("Tests youngerThan Method for thirdPerson");
		System.out.println(thirdPerson.youngerThan(firstPerson)); // true
		System.out.println(thirdPerson.youngerThan(secondPerson)); // true
		System.out.println(thirdPerson.youngerThan(fourthPerson)); // false
		System.out.println(thirdPerson.youngerThan(fifthPerson)); // true
		//Tests youngerThan method for fourthPerson
		System.out.println("Tests youngerThan Method for fourthPerson");
		System.out.println(fourthPerson.youngerThan(firstPerson)); // true
		System.out.println(fourthPerson.youngerThan(secondPerson)); // true
		System.out.println(fourthPerson.youngerThan(thirdPerson)); // false
		System.out.println(fourthPerson.youngerThan(fifthPerson)); // true
		//Tests youngerThan method for fifthPerson
		System.out.println("Tests youngerThan Methond for fifthPerson");
		System.out.println(fifthPerson.youngerThan(firstPerson)); // false
		System.out.println(fifthPerson.youngerThan(secondPerson)); // true
		System.out.println(fifthPerson.youngerThan(thirdPerson)); // false
		System.out.println(fifthPerson.youngerThan(fourthPerson)); // false


		//Tests to check hasSameBirthDate Method
		System.out.println("Tests sameBirthDate Method/n");
		System.out.println("Tests fistPerson");
		System.out.println(firstPerson.hasSameBirthDateAs(secondPerson));
		System.out.println(firstPerson.hasSameBirthDateAs(thirdPerson));
		System.out.println(firstPerson.hasSameBirthDateAs(fourthPerson));
		System.out.println(firstPerson.hasSameBirthDateAs(fifthPerson));
		System.out.println("Tests secondPerson");
		System.out.println(secondPerson.hasSameBirthDateAs(firstPerson));
		System.out.println(secondPerson.hasSameBirthDateAs(thirdPerson));
		System.out.println(secondPerson.hasSameBirthDateAs(fourthPerson));
		System.out.println(secondPerson.hasSameBirthDateAs(fifthPerson));
		System.out.println("Tests thirdPerson");
		System.out.println(thirdPerson.hasSameBirthDateAs(firstPerson));
		System.out.println(thirdPerson.hasSameBirthDateAs(secondPerson));
		System.out.println(thirdPerson.hasSameBirthDateAs(fourthPerson));
		System.out.println(thirdPerson.hasSameBirthDateAs(fifthPerson));
		System.out.println("Tests fourthPerson");
		System.out.println(fourthPerson.hasSameBirthDateAs(firstPerson));
		System.out.println(fourthPerson.hasSameBirthDateAs(secondPerson));
		System.out.println(fourthPerson.hasSameBirthDateAs(thirdPerson));
		System.out.println(fourthPerson.hasSameBirthDateAs(fifthPerson));
		System.out.println("Tests fifthPerson");
		System.out.println(fifthPerson.hasSameBirthDateAs(firstPerson));
		System.out.println(fifthPerson.hasSameBirthDateAs(secondPerson));
		System.out.println(fifthPerson.hasSameBirthDateAs(thirdPerson));
		System.out.println(fifthPerson.hasSameBirthDateAs(fourthPerson));


		//Tests hasSameBirthDayAs Method
		System.out.println("Tests hasSameBirthDayAs Method\n");
		System.out.println("Tests fisrtPerson");
		System.out.println(firstPerson.hasSameBirthDayAs(secondPerson));
		System.out.println(firstPerson.hasSameBirthDayAs(thirdPerson));
		System.out.println(firstPerson.hasSameBirthDayAs(fourthPerson));
		System.out.println(firstPerson.hasSameBirthDayAs(fifthPerson));
		System.out.println("Tests secondPerson");
		System.out.println(secondPerson.hasSameBirthDayAs(firstPerson));
		System.out.println(secondPerson.hasSameBirthDayAs(thirdPerson));
		System.out.println(secondPerson.hasSameBirthDayAs(fourthPerson));
		System.out.println(secondPerson.hasSameBirthDayAs(fifthPerson));
		System.out.println("Tests thirdPerson");
		System.out.println(thirdPerson.hasSameBirthDayAs(firstPerson));
		System.out.println(thirdPerson.hasSameBirthDayAs(secondPerson));
		System.out.println(thirdPerson.hasSameBirthDayAs(fourthPerson));
		System.out.println(thirdPerson.hasSameBirthDayAs(fifthPerson));
		System.out.println("Tests fourthPerson");
		System.out.println(fourthPerson.hasSameBirthDayAs(firstPerson));
		System.out.println(fourthPerson.hasSameBirthDayAs(secondPerson));
		System.out.println(fourthPerson.hasSameBirthDayAs(thirdPerson));
		System.out.println(fourthPerson.hasSameBirthDayAs(fifthPerson));
		System.out.println("Tests fifthPerson");
		System.out.println(fifthPerson.hasSameBirthDayAs(firstPerson));
		System.out.println(fifthPerson.hasSameBirthDayAs(secondPerson));
		System.out.println(fifthPerson.hasSameBirthDayAs(thirdPerson));
		System.out.println(fifthPerson.hasSameBirthDayAs(fourthPerson));


		try(var output =new PrintWriter(new FileOutputStream(
				new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

			//Copy all your lines above, add an extra "2" to every variable name
			// and replace every System.out.print or System.out.println
			// by output.print or output.println
			//Testing the toString method of Person Class
			var firstPerson2 = new DateAndPlaceOfBirth(2000, 5, 25, "Brooklyn", "NY", "United States");
			output.println(firstPerson2.toString());
			var secondPerson2 = new DateAndPlaceOfBirth(1985, 5, 25, "Moscow", "Russia");
			output.println(secondPerson2.toString());
			var thirdPerson2 = new DateAndPlaceOfBirth(2000, 12, 23, "Binghamton", "NY", "United States");
			output.println(thirdPerson2.toString());
			var fourthPerson2 = new DateAndPlaceOfBirth(2000, 12, 23, "Los Angeles", "CA", "United States");
			output.println(fourthPerson2.toString());
			var fifthPerson2 = new DateAndPlaceOfBirth(1988, 6, 03, "Seoul", "South Korea");
			output.println(fifthPerson2.toString());
			// Testing the methods other than getter methods to check if they work
			output.println("Tests olderThan Method");
			//Tests olderThan method for firstPerson
			//Expected true or false
			output.println("Tests olderThan Method for firstPerson: ");
			output.println(firstPerson2.olderThan(secondPerson2)); // false
			output.println(firstPerson2.olderThan(thirdPerson2)); // true
			output.println(firstPerson2.olderThan(fourthPerson2)); // true
			output.println(firstPerson2.olderThan(fifthPerson2)); // false
			//Tests olderThan method for secondPerson
			output.println("Tests olderThan Method for secondPerson: ");
			output.println(secondPerson2.olderThan(firstPerson2)); // true
			output.println(secondPerson2.olderThan(thirdPerson2)); // true
			output.println(secondPerson2.olderThan(fourthPerson2)); // true
			output.println(secondPerson2.olderThan(fifthPerson2)); // true
			//Tests olderThan method for thirdPerson
			output.println("Tests olderThan Method for thirdPerson: ");
			output.println(thirdPerson2.olderThan(firstPerson2)); // false
			output.println(thirdPerson2.olderThan(secondPerson2)); // false
			output.println(thirdPerson2.olderThan(fourthPerson2)); // false
			output.println(thirdPerson2.olderThan(fifthPerson2)); // false
			//Tests olderThan method for fourthPerson
			output.println("Tests olderThan Method for fourthPerson: ");
			output.println(fourthPerson2.olderThan(firstPerson2)); // false
			output.println(fourthPerson2.olderThan(secondPerson2)); // false
			output.println(fourthPerson2.olderThan(thirdPerson2)); // false
			output.println(fourthPerson2.olderThan(fifthPerson2)); // false
			//Tests olderThan method for fifthPerson
			output.println("Tests olderThan Method for fifthPerson: ");
			output.println(fifthPerson2.olderThan(firstPerson2)); // true
			output.println(fifthPerson2.olderThan(secondPerson2)); // false
			output.println(fifthPerson2.olderThan(thirdPerson2)); // true
			output.println(fifthPerson2.olderThan(fourthPerson2)); // true


			output.println("Tests youngerThan Method");
			//Tests yougerThan Method for firstPerson
			output.println("Tests youngerThan Method for firstPerson: ");
			output.println(firstPerson.youngerThan(secondPerson2)); // true
			output.println(firstPerson.youngerThan(thirdPerson2)); // false
			output.println(firstPerson.youngerThan(fourthPerson2)); // false
			output.println(firstPerson.youngerThan(fifthPerson2)); // true
			//Tests youngerThan method for secondPerson
			output.println("Tests youngerThan Method for secondPerson: ");
			output.println(secondPerson.youngerThan(firstPerson2)); // false
			output.println(secondPerson.youngerThan(thirdPerson2)); // false
			output.println(secondPerson.youngerThan(fourthPerson2)); // false
			output.println(secondPerson.youngerThan(fifthPerson2)); // false
			//Tests youngerThan method for thirdPerson
			output.println("Tests youngerThan Method for thirdPerson");
			output.println(thirdPerson.youngerThan(firstPerson2)); // true
			output.println(thirdPerson.youngerThan(secondPerson2)); // true
			output.println(thirdPerson.youngerThan(fourthPerson2)); // false
			output.println(thirdPerson.youngerThan(fifthPerson2)); // true
			//Tests youngerThan method for fourthPerson
			output.println("Tests youngerThan Method for fourthPerson");
			output.println(fourthPerson.youngerThan(firstPerson2)); // true
			output.println(fourthPerson.youngerThan(secondPerson2)); // true
			output.println(fourthPerson.youngerThan(thirdPerson2)); // false
			output.println(fourthPerson.youngerThan(fifthPerson2)); // true
			//Tests youngerThan method for fifthPerson
			output.println("Tests youngerThan Methond for fifthPerson");
			output.println(fifthPerson.youngerThan(firstPerson2)); // false
			output.println(fifthPerson.youngerThan(secondPerson2)); // true
			output.println(fifthPerson.youngerThan(thirdPerson2)); // false
			output.println(fifthPerson.youngerThan(fourthPerson2)); // false


			//Tests to check hasSameBirthDate Method
			output.println("Tests sameBirthDate Method\n");
			output.println("Tests fistPerson");
			output.println(firstPerson.hasSameBirthDateAs(secondPerson2));
			output.println(firstPerson.hasSameBirthDateAs(thirdPerson2));
			output.println(firstPerson.hasSameBirthDateAs(fourthPerson2));
			output.println(firstPerson.hasSameBirthDateAs(fifthPerson2));
			output.println("Tests secondPerson");
			output.println(secondPerson.hasSameBirthDateAs(firstPerson2));
			output.println(secondPerson.hasSameBirthDateAs(thirdPerson2));
			output.println(secondPerson.hasSameBirthDateAs(fourthPerson2));
			output.println(secondPerson.hasSameBirthDateAs(fifthPerson2));
			output.println("Tests thirdPerson");
			output.println(thirdPerson.hasSameBirthDateAs(firstPerson2));
			output.println(thirdPerson.hasSameBirthDateAs(secondPerson2));
			output.println(thirdPerson.hasSameBirthDateAs(fourthPerson2));
			output.println(thirdPerson.hasSameBirthDateAs(fifthPerson2));
			output.println("Tests fourthPerson");
			output.println(fourthPerson.hasSameBirthDateAs(firstPerson2));
			output.println(fourthPerson.hasSameBirthDateAs(secondPerson2));
			output.println(fourthPerson.hasSameBirthDateAs(thirdPerson2));
			output.println(fourthPerson.hasSameBirthDateAs(fifthPerson2));
			output.println("Tests fifthPerson");
			output.println(fifthPerson.hasSameBirthDateAs(firstPerson2));
			output.println(fifthPerson.hasSameBirthDateAs(secondPerson2));
			output.println(fifthPerson.hasSameBirthDateAs(thirdPerson2));
			output.println(fifthPerson.hasSameBirthDateAs(fourthPerson2));


			//Tests hasSameBirthDayAs Method
			output.println("Tests hasSameBirthDayAs Method/n");
			output.println("Tests fisrtPerson");
			output.println(firstPerson.hasSameBirthDayAs(secondPerson));
			output.println(firstPerson.hasSameBirthDayAs(thirdPerson));
			output.println(firstPerson.hasSameBirthDayAs(fourthPerson));
			output.println(firstPerson.hasSameBirthDayAs(fifthPerson));
			output.println("Tests secondPerson");
			output.println(secondPerson.hasSameBirthDayAs(firstPerson));
			output.println(secondPerson.hasSameBirthDayAs(thirdPerson));
			output.println(secondPerson.hasSameBirthDayAs(fourthPerson));
			output.println(secondPerson.hasSameBirthDayAs(fifthPerson));
			output.println("Tests thirdPerson");
			output.println(thirdPerson.hasSameBirthDayAs(firstPerson));
			output.println(thirdPerson.hasSameBirthDayAs(secondPerson));
			output.println(thirdPerson.hasSameBirthDayAs(fourthPerson));
			output.println(thirdPerson.hasSameBirthDayAs(fifthPerson));
			output.println("Tests fourthPerson");
			output.println(fourthPerson.hasSameBirthDayAs(firstPerson));
			output.println(fourthPerson.hasSameBirthDayAs(secondPerson));
			output.println(fourthPerson.hasSameBirthDayAs(thirdPerson));
			output.println(fourthPerson.hasSameBirthDayAs(fifthPerson));
			output.println("Tests fifthPerson");
			output.println(fifthPerson.hasSameBirthDayAs(firstPerson));
			output.println(fifthPerson.hasSameBirthDayAs(secondPerson));
			output.println(fifthPerson.hasSameBirthDayAs(thirdPerson));
			output.println(fifthPerson.hasSameBirthDayAs(fourthPerson));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}













	}
}