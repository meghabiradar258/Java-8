package LambdaExpression;

@FunctionalInterface
interface FuncInter1 {
    int operation(int a, int b);
}

public class TestPro {

    public static void main(String[] args) {

        FuncInter1 add = (a, b) -> a + b;
        FuncInter1 multiply = (a, b) -> a * b;


        System.out.println(add.operation(5, 5));
        System.out.println(multiply.operation(4, 5));
    }
}