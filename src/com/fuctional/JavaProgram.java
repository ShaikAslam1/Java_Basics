package com.fuctional;

public class JavaProgram {
    public static void main(String[] args) {
        System.out.println("===String Buffer===");
        StringBuffer sb = new StringBuffer("MyJava");
        System.out.println(sb.reverse());

        System.out.println("===Iterator===");
        String str = "MyJava";
        char[] strArray = str.toCharArray();

        for (int i=strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);
        }
        System.out.println();
        System.out.println("===Using recursion===");
        System.out.println(recursiveString(str));

        // remove all white spaces
        System.out.println("===remove white spaces===");
        String whiteSpace = "aslam is an engineer";
        System.out.println(whiteSpace.replaceAll("\\s+", ""));
    }

    static String recursiveString(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return recursiveString(str.substring(1)) + str.charAt(0);
    }
}
