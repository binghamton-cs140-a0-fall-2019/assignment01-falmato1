package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester{
    public static void main(String[] args){
        var personBirthDate = new DateAndPlaceOfBirth(1954, 8, 14, "Bronx", "NY", "United States");
        var personUSADress = new StreetUSAddress("1450 Ave K", "", "Jersey City", "NJ", "12330");
        var newPerson = new Person("Tom", "Mott","563676445", personBirthDate, personUSADress);
        var newComputerOwner = new ComputerOwner(newPerson);
        var firstComputer = new Computer("HP", "Intel i7 2.44Ghz", 8, 1500, false, 899.00 );
        var secondComputer = new Computer("Dell", "AMD Radion", 16, 512, true, 759.00);
        var thirdComputer = new Computer("Razer", "Intel i5 3.64 Ghz", 32, 2000, true, 1599.00);
        var fourthComputer = new Computer("Samsung", "Intel i7 3.5 Ghz", 8, 256, false, 399.00);
        newComputerOwner.addComputer(firstComputer);
        newComputerOwner.addComputer(secondComputer);
        newComputerOwner.addComputer(thirdComputer);
        newComputerOwner.addComputer(fourthComputer);
        System.out.println(newComputerOwner.toString());
        newComputerOwner.removeComputer(0);
        newComputerOwner.removeComputer(0);

        System.out.println(newComputerOwner.toString());

        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR ComputerOwner.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            var personBirthDate2 = new DateAndPlaceOfBirth(1954, 8, 14, "Bronx", "NY", "United States");
            var personUSADress2 = new StreetUSAddress("1450 Ave K", "", "Jersey City", "NJ", "12330");
            var newPerson2 = new Person("Tom", "Mott","563676445", personBirthDate, personUSADress);
            var newComputerOwner2 = new ComputerOwner(newPerson2);
            var firstComputer2 = new Computer("HP", "Intel i7 2.44Ghz", 8, 1500, false, 899.00 );
            var secondComputer2 = new Computer("Dell", "AMD Radion", 16, 512, true, 759.00);
            var thirdComputer2 = new Computer("Razer", "Intel i5 3.64 Ghz", 32, 2000, true, 1599.00);
            var fourthComputer2 = new Computer("Samsung", "Intel i7 3.5 Ghz", 8, 256, false, 399.00);
            newComputerOwner2.addComputer(firstComputer2);
            newComputerOwner2.addComputer(secondComputer2);
            newComputerOwner2.addComputer(thirdComputer2);
            newComputerOwner2.addComputer(fourthComputer2);
            newComputerOwner2.removeComputer(0);
            newComputerOwner2.removeComputer(0);

            output.println(newComputerOwner2.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}