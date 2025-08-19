public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstParameter, double secondParameter) {
       long firstRound = (long) firstParameter * 1000;
       long secondRound = (long) secondParameter * 1000;

       return firstRound == secondRound;

    }
}
