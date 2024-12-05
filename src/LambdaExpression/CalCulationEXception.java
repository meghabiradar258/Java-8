package LambdaExpression;

interface Calculator {
    double divide(int a, int b) throws ArithmeticException;
}

public class CalCulationEXception {
    public static void main(String[] args) {

        Calculator cal = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return (double) a / b;
        };

        try {

            double result = cal.divide(10, 2);
            System.out.println("Result of division " + result);
            result = cal.divide(10, 0);
            System.out.println("Result of division" + result);
        } catch (ArithmeticException e) {
            System.out.println("An exception  " + e.getMessage());

        }
    }
}



