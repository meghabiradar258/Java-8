package LambdaExpression;

interface Arg{
    String test();
}
interface FunEx{
    Double Percentage();
}
public class LambdaEx {
    public static void main(String[] args) {
        Arg a1 = () -> "Hello";
        System.out.println(a1.test());


        FunEx p1 = () -> 85.5;
        System.out.println(p1.Percentage());


    }


}
