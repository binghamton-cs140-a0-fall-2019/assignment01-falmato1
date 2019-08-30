package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		var firstComputer = new Computer("HP", "Intel i7 2.44Ghz", 8, 1500, false, 899.00 );
		var secondComputer = new Computer("Dell", "AMD Radion", 16, 512, true, 759.00);
		var thirdComputer = new Computer("Razer", "Intel i5 3.64 Ghz", 32, 2000, true, 1599.00);
		var fourthComputer = new Computer("Samsung", "Intel i7 3.5 Ghz", 8, 256, false, 399.00);
		System.out.println(fourthComputer.toString());
		System.out.println(thirdComputer.toString());
		System.out.println(secondComputer.toString());
		System.out.println(firstComputer.toString());
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
			var firstComputer2 = new Computer("HP", "Intel i7 2.44Ghz", 8, 1500, false, 899.00 );
			var secondComputer2 = new Computer("Dell", "AMD Radion", 16, 512, true, 759.00);
			var thirdComputer2 = new Computer("Razer", "Intel i5 3.64 Ghz", 32, 2000, true, 1599.00);
			var fourthComputer2 = new Computer("Samsung", "Intel i7 3.5 Ghz", 8, 256, false, 399.00);
			output.println(fourthComputer2.toString());
			output.println(thirdComputer2.toString());
			output.println(secondComputer2.toString());
			output.println(firstComputer2.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
