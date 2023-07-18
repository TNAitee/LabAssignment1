package problem_E1_3;

public class PositiveIntegersMultiplication{
        private int result;
        public PositiveIntegersMultiplication(){
            result = 1;
        }

        public int multiplication(int number) {
            for (int loopCount = 1 ; loopCount <= number ; loopCount++)
                result = result * loopCount;
            return result;
        }
}
