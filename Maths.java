import java.lang.Math;
import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        double number = 25.0;
        double squareRoot = Math.sqrt(number);
       System.out.println(Math.max(12,13));
       System.out.println("Square root of the number " + number + " is " + squareRoot);
       int Num;
       Scanner Keyb=new Scanner(System.in);
       System.out.println("PLEASE ENTER YOUR NUMBER TO FIND SQORT :");
       Num=Keyb.nextInt();
       System.out.println("The Square root of "+ Num +" is "+ Math.sqrt(Num));
    }
}
