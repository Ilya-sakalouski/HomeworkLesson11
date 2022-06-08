package src.runner;

import src.task1.NotFound1a2bExeption;
import src.task2.Task2;

import java.util.Scanner;

import static src.task1.Task1.*;

public class Runner {
    public static void main(String[] args) throws NotFound1a2bExeption {
        // TODO Task1
        System.out.println("TASK 1:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();        //  xxxx-yyy-xxxx-yyy-xyxy     5552-abc-3434-ABC-1a2b
        System.out.println(part1(s));
        System.out.println(part2(s));
        System.out.println(part3(s).toLowerCase());
        System.out.println(part4(s).toUpperCase());
        System.out.println(part5(s));
        System.out.println(part6(s));
        System.out.println(part7(s));

        //TODO Task2
        System.out.println("\nTASK 2:");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ENTER LOGIN:");
        String login = scanner1.next();
        System.out.println("ENTER PASSWORD:");
        String password = scanner1.next();
        System.out.println("CONFIRM PASSWORD:");
        String confirmPassword = scanner1.next();
        Task2.informationCheck(login, password, confirmPassword);
        System.out.println("You have successfully logged into your profile: " + login);
    }
}
