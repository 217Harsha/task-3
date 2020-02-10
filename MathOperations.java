import java.util.*;
public class MathOperations
{
double m;
double n;
public double add()
{
input();
return m+n;
}

 public double subtract()
 {
 input();
 return m-n;
 }
 public double multiply()
 {
 input();
 return m*n;
 }

public double divide()
{
input();
return m/n;
}
private void input()
{
 Scanner s =new Scanner(System.in);
 System.out.println("Enter two numbers");
  m = s.nextDouble();
  n = s.nextDouble();
}

}