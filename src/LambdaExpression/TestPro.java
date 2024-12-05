package LambdaExpression;

@FunctionalInterface
interface FuncInter1 {
    int operation(int a, int b);
}

public class TestPro {

    public static void main(String[] args) {
        // Using lambda expressions to define the operations
        FuncInter1 add = (a, b) -> a + b;
        FuncInter1 multiply = (a, b) -> a * b;

        // Using the operations
        System.out.println(add.operation(6, 3));  // Output: 9
        System.out.println(multiply.operation(4, 5));  // Output: 20
    }
}