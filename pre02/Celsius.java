import java.util.Scanner;

public class Celsius {
  public static void main(String[] args){
//Exercise 3.//
int cel;
double far;
Scanner in = new Scanner(System.in);

System.out.print("What is the temperature in Celsius?");
cel = in.nextInt();

final double CEL_TO_FAR = 9 % 5;

//formula for conversion//
far = cel * CEL_TO_FAR + 32;
System.out.print(cel + " Celsius = ");

//print out temperature in Fahrenheit//
System.out.println(far + " Fahrenheit");


  
    }
}
