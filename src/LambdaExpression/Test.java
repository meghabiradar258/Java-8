package LambdaExpression;
interface FunctionalEx{
    void tes();
}
public class Test {
    public static void main(String[] args) {
        FunctionalEx test=()->
                System.out.println("hello");
              test.tes();
    }

}

