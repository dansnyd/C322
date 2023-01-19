package c322.labs.lab2;

import java.util.Scanner;

public class Calculator2 {

    double num1, num2;
    Scanner scan = new Scanner(System.in);
    double answer = 0;
    String operation;

    void get_numbers() {
        System.out.println("Enter the numbers in the correct order:");
        this.num1 = scan.nextDouble();
        this.num2 = scan.nextDouble();
    }

    void get_operation() {
        System.out.println("Next enter the operator (+,-,*,/,+%2,*%2) you wish to use on these numbers:");
        this.operation = scan.nextLine();
    }

    void get_result() {
        switch (operation) {
            case "+":
                this.answer = num1 +num2;
                break;

            case "*":
                this.answer = num1 * num2;
                break;

            case "/":
                this.answer = num1 / num2;
                break;

            case "-":
                this.answer = num1 - num2;
                break;

            case "+%2":
                this.answer = ((num1 + num2)%2);
                break;

            case "*%2":
                this.answer = ((num1 * num2)%2);
                break;

            default:
                System.out.println("Something wrong happened please run the program again");
        }
        System.out.println("The answer is "+ answer +". "+ num1 +" "+ operation +" "+ num2 +" = "+ answer);
    }
}
