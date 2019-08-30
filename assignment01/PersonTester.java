package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{
    public static void main(String[] args){
        var personBirthDate = new DateAndPlaceOfBirth(2000, 06, 24, "Brooklyn", "NY", "United States");
        var personUSADress = new StreetUSAddress("1450 Ave K", "", "Jersey City", "NJ", "11230");
        var newPerson = new Person("Jake", "Landerson", "567786445", personBirthDate, personUSADress);
        System.out.println(newPerson.toString());

        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR Person.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            var personBirthDate2 = new DateAndPlaceOfBirth(2000, 06, 24, "Brooklyn", "NY", "United States");
            var personUSADress2 = new StreetUSAddress("1450 Ave K", "", "Jersey City", "NJ", "11230");
            var newPerson2 = new Person("Jake", "Landerson", "567786445", personBirthDate2, personUSADress2);
            output.println(newPerson2.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}