import java.io.*;
import java.util.*;

class Time {
    public static void main(String[] args){
//Exercise 3.2//
int hour = 9;
int minute = 15;
int second = 20;
System.out.print("The current time is ");
System.out.print(hour);
System.out.print(":");
System.out.print(minute);
System.out.print(":");
System.out.print(second);
System.out.println(".");

//Exercise 3.3//
System.out.print("Number of seconds since midnight: ");
System.out.println(hour * 60 + minute);

//Exercise 3.4//
System.out.print("Number of remaining in the day: ");
System.out.println((24 * 60 * 60) -  ((hour * 60 * 60) + (minute * 60) + second));

//Exercise 3.5//
System.out.print("Percent of the day that has passed: ");
System.out.println(((hour * 60 * 60) + (minute * 60) + second) * 100/ (24 * 60 * 60));
 
//Exercise 3.6//
System.out.print("Elapsed time: ");
System.out.println((hour * 60 + minute) - (12 * 60 + 20) ); 

}
}