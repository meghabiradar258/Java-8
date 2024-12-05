package LambdaExpression;
interface Operation{
    int CalculateValues(int a, int b);

}



public class Calculation {
    public static void main(String[] args) {
        Operation add=(int aa,int bb)->
                (aa+bb);
        System.out.println("Addition is "+add.CalculateValues(10,20));

        Operation multiply=(int a,int b)->(a*b);
        System.out.println("multiplication is"+multiply.CalculateValues(25,5));

        Operation divide=(int a,int b)->(a/b);
        System.out.println("division is"+divide.CalculateValues(30,5));
    }
}
