package assignment01;

public class SimpleDateTester{
    public static void main(String[] args){
        var firstSimpleDate = new SimpleDate();
        var secondSimpleDate = new SimpleDate();
        System.out.println("Different year test, expected true");
        firstSimpleDate = SimpleDate.of(2000, 4, 25);
        secondSimpleDate = SimpleDate.of(1985, 4, 31);
        System.out.println("Actual result: "+ secondSimpleDate.before(firstSimpleDate));
        firstSimpleDate = SimpleDate.of(1985, 4, 25);
        secondSimpleDate = SimpleDate.of(1985, 4, 31);
        System.out.println("Same Year and Month, different day, expected false");
        System.out.println("Actual result: " + secondSimpleDate.before(firstSimpleDate));
        firstSimpleDate = SimpleDate.of(1998, 3, 25);
        secondSimpleDate = SimpleDate.of(1998, 2, 15);
        System.out.println("Same year, different months, expected true");
        System.out.println("Actual result: " + secondSimpleDate.before(firstSimpleDate));
    }
}