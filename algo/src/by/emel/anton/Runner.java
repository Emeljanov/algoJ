package by.emel.anton;

import by.emel.anton.datecase.DateCase;
import by.emel.anton.maxeven.MaxEven;
import by.emel.anton.multiplication.Multiplication;
import by.emel.anton.nok.Nok;
import by.emel.anton.palindrome.Palindrome;

import java.time.LocalDate;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Enter NOK, MAXEVEN, MULTI, TIME, PALINDROM or EXIT");
            String s = scanner.nextLine();
            if (s.equals("NOK")) {
                System.out.println("enter first number");
                int a = Integer.parseInt(scanner.nextLine().trim());
                System.out.println("enter second number");
                int b = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(new Nok().lcm(a, b));
            }
            else if (s.equals("EXIT")) {
                System.out.println("exit from progm");
                flag = false;
                scanner.close();
            }
            else  if(s.equals("MAXEVEN")) {
                System.out.println("enter number for max even");
                int a = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(new MaxEven().findMaxEven(a));
            }
            else if(s.equals("MULTI")) {
                System.out.println("enter number for multi");
                int a = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(new Multiplication().multiplicate(a));
            }
            else if(s.equals("TIME")) {
                System.out.println("time of the year");
                LocalDate localDate = LocalDate.parse(scanner.nextLine().trim());
                System.out.println(new DateCase().switchDate(localDate));
            }
            else if(s.equals("PALINDROM")) {
                System.out.println("PALINDROM");
                String pali = scanner.nextLine().trim();
                System.out.println(Palindrome.isPalindrome(pali));
            }
        }

    }
}
