package c322.labs.lab2;

import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args) {
        double num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numbers in the correct order:");

        num1 = scan.nextDouble();

        num2 = scan.nextDouble();

        System.out.println("Next enter the operator (+,-,*,/) you wish to use on these numbers:");

        char operation = scan.next().charAt(0);

        double answer = 0;

        switch (operation) {
            case '+':
                answer = num1 +num2;
                break;

            case '*':
                answer = num1 * num2;
                break;

            case '/':
                answer = num1 / num2;
                break;

            case '-':
                answer = num1 - num2;
                break;

            default:
                System.out.println("Something wrong happened please run the program again");
        }
        System.out.println("The answer is "+answer +". "+ num1+" "+ operation+" "+ num2 +" = "+ answer);

    }
}
