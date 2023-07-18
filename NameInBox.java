package problem_E1_5;

public class NameInBox {
    public static void main(String[] args) {
        String name = "TNAitee" ;
        int length = name.length() + 4 ;
        String horizontalLine = "+" + " -".repeat(length/2) + " +" ;
        String onlyLine = "|" + " ".repeat(length) + "|";

        System.out.println(horizontalLine);
        System.out.println(onlyLine);
        System.out.println("|  " + name + "  |");
        System.out.println(onlyLine);
        System.out.println(horizontalLine);
    }
}
