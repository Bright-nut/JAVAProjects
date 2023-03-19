package Project2;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        /**: In this assignment you will make your own interactive converter applicaton whcih
         convert Celcius (C) to Fahreheit(F).
         - Make a program to convert Celcius(taken input from user) to Fahrenheit.
         - You will use Scanner object and ask user to enter the temperature in Celcius (C)
         //Create a Scanner object named scan
         //Declare 2 double variables, celcius , convertedToF;
         // Execution flow with example :
         // Display promt “Enter the temperature in celcius”
         // 23.5
         //Calculate convertedToF
         // print the value of convertedToF variable.
         */
        Scanner scan = new Scanner(System.in);
        double celsius,convertedTo;
        System.out.println("Enter the temperature in Celsius");
        celsius = scan.nextDouble();
        //°F = (°C x 1.8) + 32
        convertedTo = celsius*1.8+32;
        System.out.println("From C to F "+ convertedTo);

    }
}

