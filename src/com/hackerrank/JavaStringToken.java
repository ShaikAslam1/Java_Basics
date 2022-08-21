package com.hackerrank;

import java.util.Scanner;

public class JavaStringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if (s.trim().equals("")) {
            System.out.println("0");
        } else if (!s.contains("!") && !s.contains(",") && !s.contains("?") && !s.contains(".")
                && !s.contains("_") && !s.contains("'") && !s.contains("@") && !s.contains(" ")) {
            System.out.println("0");
        } else {
            String[] stringSplit = s.trim().split("[!,?._'@\\s]+");
            System.out.println(stringSplit.length);
            for (String str : stringSplit) {
                System.out.println(str);
            }
        }
        scan.close();
    }
}
