package com.ismail;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Locale;

public class Numbers {

    // primitive integer data types
    private int a;
    private float b;
    private double c;
    private byte d;
    private short e;
    private long f;

    // non-primitive data types
    private Integer a1;
    private Float b1;
    private Double c1;
    private Byte d1;
    private Short e1;
    private Long f1;

    private static Integer a2 = 6;
    private static int a3 = 6;

    public static void main(String[] args) {
        System.out.println(a2);
        System.out.println(a3);

        String int1 = "12341";

        // Auto-boxing
        if (a2.equals(a3))
            System.out.println("true");
        else
            System.out.println("false");

        printThisNumber(a2);

        System.out.println("Integer Range");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.max(a2, a3));

        // string to int
        Integer convertedValue = Integer.valueOf(int1);
        System.out.println(convertedValue);

        byte b3 = 4;

        System.out.println("================================");

        long n = 461012;
        System.out.format("%d%n", n);      //  -->  "461012"
        System.out.format("%08d%n", n);    //  -->  "00461012"
        System.out.format("%+8d%n", n);    //  -->  " +461012"
        System.out.format("%,8d%n", n);    // -->  " 461,012"
        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

        double pi = Math.PI;

        System.out.format("%f%n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"
        System.out.format(Locale.FRANCE,
                "%-10.4f%n%n", pi); // -->  "3,1416"

        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

        System.out.format("%tD%n", c);    // -->  "05/29/06"

        System.out.println("================================");

        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 123.78);
        customFormat("$###,###.###", 12345.67);

        System.out.println("================================");

        System.out.println(Math.PI);
        System.out.println(Math.cos(0));

        double pi2 = Math.PI;
        System.out.println(pi2);


    }

    static void printThisNumber(int number) {
        System.out.println(number);
    }

    static public void customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + "  " + pattern + "  " + output);
    }

}
