package Lesson4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double operand1 = 3,operand2 = 4.5, result;
        Scanner input = new Scanner(System.in);
        System.out.printf("You have %s and %s. Input action (+,-,*,/): ", operand1,operand2);
        String sign = input.next();
        switch (sign) {
            case "+" :
               result = operand1+operand2;
                System.out.println("Result = " + result);
               break;
            case "-":
                result = operand1-operand2;
                System.out.println("Result = " + result);
                break;
            case "*":
                result = operand1*operand2;
                System.out.println("Result = " + result);
                break;
            case"/":
                if (operand2==0)
                    System.out.println("Error. Division by zero is not possible");
                else {
                    result = operand1 / operand2;
                    System.out.println("Result = " + result);
                }
                break;
            default:
                System.out.println("Wrong action");
        }
    }
}
