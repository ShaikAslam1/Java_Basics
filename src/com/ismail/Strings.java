package com.ismail;

public class Strings {
    public static void main(String[] args) {
        // String is a Array of Characters
        char[] s = {'c', 'h', 'a', 'r'};
        String s1 = "char";
        // String is immutable - you can't change the string value once defined
        String name = "Ismail";
        // Java "String Pool" memory - create a memory with name ismail
        System.out.println(name);

        name = "Aslam";
        // this will not change value of ismail, rather it will create a new string in String Pool
        System.out.println(name);

        // after some code - 100 lines
        // ..

        String employeeName = "Ismail";
        name = "Ismail";
        // this will not create any string, this will simply use the existing string which is already available

        System.out.println(employeeName);

        if (name.equals(employeeName)) {
            System.out.println("true");
        }

        // String Object
        String name2 = new String("Ismail");

        if (name.equals(name2)) {
            System.out.println("true");
        }

        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);

        System.out.println("length of hello String: " + helloString.length());

        // concatenation
        helloString += " word";

        System.out.println(helloString);

        helloString = helloString.concat(" good morning");
        System.out.println(helloString);

        // format
        System.out.printf("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        "and the string is %s",
                123.43, 5463, helloString);

        // converting strings to numbers
        String aFloat = "5.34";
//        float aFloat2 = Float.valueOf(aFloat);
        float aFloat2 = Float.parseFloat(aFloat);
        System.out.println(aFloat2);

        // number to string
        int bNum = 120;
        String bNum2 = String.valueOf(bNum);
        System.out.println(bNum2);

        System.out.println(s1.charAt(0));
        System.out.println(helloString.substring(3));
        System.out.println(helloString.substring(3, 7));

        System.out.println(helloString.contains("word"));
        System.out.println(helloString.contains("test"));

        helloString = helloString.replace("word", "world");
        System.out.println(helloString);

        helloString += " 123" + " 123" + " 123";
        System.out.println("hello String::: " + helloString);

        helloString = helloString.replaceAll("123", "456abc");
        System.out.println(helloString);

        helloString = helloString.replaceFirst("456abc", "ABCD");
        System.out.println(helloString);

        System.out.println("ends with: " + helloString.endsWith("456abc"));
        System.out.println("ends with: " + helloString.endsWith("456"));

        // ignore case :- Abc = aBC

        String newString = "new String";

        // StringBuilder is Mutable
        StringBuilder stringBuilder = new StringBuilder("StringBuilder string");
        System.out.println(stringBuilder);
        stringBuilder.append("abc");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        // palindrome
        StringBuilder p1 = new StringBuilder("dad");
        StringBuilder p2 = new StringBuilder("dad");

        if (p1.toString().equals(p2.reverse().toString())) {
            System.out.println("this string is palindrome");
        } else {
            System.out.println("false");
        }

        System.out.println(p1);
        System.out.println(p2);
    }
}
