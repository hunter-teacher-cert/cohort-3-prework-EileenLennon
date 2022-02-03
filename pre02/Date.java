import java.io.*;
import java.util.*;

class Date {
    public static void main(String[] args){
      
//Exercise 2.3//
String day = "Wednesday";
int date = 02;
String month = "February";
int year = 2022;
System.out.print("The current day is ");
System.out.println(day);
System.out.print("The current date is ");
System.out.println(date);
System.out.print("The current month is ");
System.out.println(month);
System.out.print("The current year is ");
System.out.print(year);
System.out.println(".");

//Exercise 2.4//
System.out.println ("American format:");
System.out.print(day);
System.out.print(", ");
System.out.print(month);
System.out.print(" ");
System.out.print(date);
System.out.print(", ");
System.out.println(year);

//Exercise 2.5//
System.out.println ("European format:");
System.out.print(date);
System.out.print(" ");
System.out.print(day);
System.out.print(" ");
System.out.print(month);
System.out.print(" ");
System.out.print(year);
}
}