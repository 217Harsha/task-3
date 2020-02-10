
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double result = 0;
        MathOperations ob = new MathOperations();
        Scanner s =new Scanner(System.in);
        System.out.print("To exit type 'n'\n");

while(true)
{       
  System.out.print("Enter an operator (+, -, *, /):\n");
 char choice = s.next().charAt(0);
 switch(choice)
        {
            case '+':
                   result = ob.add();
              break;
            case '-':
               result = ob.subtract();   
                break;
            case '*':
                result = ob.multiply();   
                break;
            case '/':
                result = ob.divide();
                break;
            case 'n':
                break;
            default:
                System.out.println("Error! operator is not correct");
                return;
        }
       System.out.printf("%.1f %c %.1f = %.1f\n", ob.m,choice, ob.n, result);
}
}
}