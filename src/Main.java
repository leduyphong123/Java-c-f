import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int key=-1;

        Scanner input=new Scanner(System.in);
        do{
            System.out.println("***Menu***");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            key=input.nextInt();
            switch(key){
                case 1:
                    System.out.println("input C = ");
                    System.out.println( "do f = "+celsiusToFahrenheit(input.nextDouble()));
                    break;
                case 2:
                    System.out.println("input f = ");
                    System.out.println("do c = "+ fahrenheitToCelsius(input.nextDouble()));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Eror");
            }
        }while(key!=0);


    }
    public static double celsiusToFahrenheit(double celsius){
        return (celsius*9/5+32);
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return ((5.0 / 9) * (fahrenheit - 32));
    }
}