package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester{
    public static void main(String[] args) {
        var firstSimpleDate = new SimpleDate();
        var secondSimpleDate = new SimpleDate();
        System.out.println("Different year test, expected true");
        firstSimpleDate = SimpleDate.of(2000, 4, 25);
        secondSimpleDate = SimpleDate.of(1985, 4, 31);
        System.out.println("Actual result: " + secondSimpleDate.before(firstSimpleDate));
        firstSimpleDate = SimpleDate.of(1985, 4, 25);
        secondSimpleDate = SimpleDate.of(1985, 4, 31);
        System.out.println("Same Year and Month, different day, expected false");
        System.out.println("Actual result: " + secondSimpleDate.before(firstSimpleDate));
        firstSimpleDate = SimpleDate.of(1998, 3, 25);
        secondSimpleDate = SimpleDate.of(1998, 2, 15);
        System.out.println("Same year, different months, expected true");
        System.out.println("Actual result: " + secondSimpleDate.before(firstSimpleDate));


        try (var output = new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR SimpleDate.java:");

            //Copy all your lines above, add an extra "2" to every variable name
            // and replace every System.out.print or System.out.println
            // by output.print or output.println
            var firstSimpleDate2 = new SimpleDate();
            var secondSimpleDate2 = new SimpleDate();
            output.println("Different year test, expected true");
            firstSimpleDate2 = SimpleDate.of(2000, 4, 25);
            secondSimpleDate2 = SimpleDate.of(1985, 4, 31);
            output.println("Actual result: " + secondSimpleDate2.before(firstSimpleDate2));
            firstSimpleDate2 = SimpleDate.of(1985, 4, 25);
            secondSimpleDate2 = SimpleDate.of(1985, 4, 31);
            output.println("Same Year and Month, different day, expected false");
            output.println("Actual result: " + secondSimpleDate2.before(firstSimpleDate2));
            firstSimpleDate2 = SimpleDate.of(1998, 3, 25);
            secondSimpleDate2 = SimpleDate.of(1998, 2, 15);
            output.println("Same year, different months, expected true");
            output.println("Actual result: " + secondSimpleDate2.before(firstSimpleDate2));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}