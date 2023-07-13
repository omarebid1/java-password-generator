package org.lessons.java.security;

import java.util.Scanner;
public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fName, lName, favColor;
        int birthDay, birthMonth, birthYear;

        System.out.println("enter ur first name");
        fName = scanner.nextLine();

        System.out.println("enter ur last name");
        lName = scanner.nextLine();

        System.out.println("enter ur fav color");
        favColor = scanner.nextLine();

        System.out.println("enter ur day of birth");
        birthDay = Integer.parseInt(scanner.nextLine());

        System.out.println("enter ur month of birth");
        birthMonth = Integer.parseInt(scanner.nextLine());

        System.out.println("enter ur year of birth");
        birthYear = Integer.parseInt(scanner.nextLine());

        int birthSum = birthDay + birthMonth + birthYear;

        String password = fName + "-" + lName + "-" + favColor + "-" + birthSum;

        System.out.println("PASSWORD :  " + password);

    }

}
