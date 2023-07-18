package problem_E1_4;

public class InterestCalculate {

    private double total;

    public InterestCalculate(){
        total = 1;
    }
    public double balance(int capital, int rate, int year) {
        double total = capital * Math.pow(1 + ((double) rate / 100), year);
        return total;
    }
}
