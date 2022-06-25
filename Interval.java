package Lesson4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value: ");
        double x = input.nextDouble();
        if (x>=0&&x<=14)
        {
            System.out.println("The value corresponds to the interval [0-14]");
        }
        else
        {
            if (x>=15&&x<=35)
            {
                System.out.println("The value corresponds to the interval [15-35]");
            }
            else {
                if (x>=36&&x<=50)
                {
                    System.out.println("The value corresponds to the interval [36-50]");
                }
                else
                {
                    if (x>=50&&x<=100)
                    {
                        System.out.println("The value corresponds to the interval [50-100]");
                    }
                    else
                    {
                        System.out.println("Value does not match any range");
                    }
                }
            }
        }
    }
}
