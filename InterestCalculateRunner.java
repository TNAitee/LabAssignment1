package problem_E1_4;

public class InterestCalculateRunner {
    public static void main(String[] args) {
        InterestCalculate calculatedBalance = new InterestCalculate();
        System.out.println("After 1 year,calculated balance:"+calculatedBalance.balance(1000,5,1)+"$");
        System.out.println("After 2 year,calculated balance:"+calculatedBalance.balance(1000,5,2)+"$");
        System.out.println("After 3 year,calculated balance:"+calculatedBalance.balance(1000,5,3)+"$");
    }
}
