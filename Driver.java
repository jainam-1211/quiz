package com.company;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        math q = new math();
        gk p = new gk();
        System.out.println("press 1 for Math \npress 2 for gk");
        int selectSubject = scan.nextInt();
        if (selectSubject == 1) {
            q.start();
        } else if (selectSubject == 2) {
            p.start();
        }
    }
}