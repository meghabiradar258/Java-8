package LambdaExpression;



interface MultiExceptionOperation {
    void execute() throws ArithmeticException, NullPointerException;
}

public class ExceptionPro {
    public static void main(String[] args) {

        MultiExceptionOperation operation = () -> {
            String str = null;
            int result = 10 / 0;

            if (str == null) {
                throw new NullPointerException("Null value entred");
            }

            System.out.println("sucess");
        };

        try {
            operation.execute();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

