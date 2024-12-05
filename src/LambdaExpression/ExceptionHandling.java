package LambdaExpression;



interface Employee {
    void EmployeeDeatils(String name ,int id) throws Exception;
}
public class ExceptionHandling {
    public static void main(String[] args) {
        // lamba expression
        Employee emp = (name,id )-> {
            System.out.println("The Employee name is: " + name);
            System.out.println("The id name is: " + id);
            throw new Exception();
        };
        try {
            emp.EmployeeDeatils("Megha",1);
        } catch(Exception e) {
            System.out.println("An exception occurred " + e.getMessage());
        }
    }
}


