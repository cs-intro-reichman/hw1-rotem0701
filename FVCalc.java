// Computes the future value of a saving investment.
public class FVCalc {
    public static void main(String[] args) {
        int currentValue = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]);
        int numyears = Integer.parseInt(args[2]);
        double midcalc = 1 + rate / 100;
        double futureValue = currentValue * Math.pow(midcalc, numyears);

        System.out.println("After " + numyears + " years, a $" + currentValue + 
                           " saved at " + rate + "% will yield $" + (int) futureValue);
    }
}
