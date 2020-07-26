import java.util.Scanner;
public class Calculator 
{
   public static void main(String[] args) 
    {
      double num1,num2,res;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.println("Enter two numbers: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.println("Enter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      switch(op)
      {
         case '+': res = num1 + num2;
            break;
         case '-': res = num1 - num2;
            break;
         case '*': res = num1 * num2;
            break;
         case '/': res = num1 / num2;
            break;
         default: System.out.println("Enter correct operator");
         return;
      }
      System.out.println("\nThe result is :\n");
      System.out.println(num1 + " " + op + " " + num2 + " = " + res);
   }
}