package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAdressTester{
    public static void main(String[] args){
        var firstAdress = new StreetUSAddress("1620 Ocean Ave", "Apt 5K", "Brooklyn", "NY", "11230");
        var secondAdress = new StreetUSAddress("28 Walnut", "", "Binghamton", "NY", "13905");
        System.out.println("firstAdress: " + firstAdress.toString());
        System.out.println("secondAddress: " + secondAdress.toString());

        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR StreetUSAddress.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            var firstAdress2 = new StreetUSAddress("1620 Ocean Ave", "Apt 5K", "Brooklyn", "NY", "11230");
            var secondAdress2 = new StreetUSAddress("28 Walnut", "", "Binghamton", "NY", "13905");
            output.println("firstAdress: " + firstAdress2.toString());
            output.println("secondAddress: " + secondAdress2.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}