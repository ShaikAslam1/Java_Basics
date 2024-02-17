package com.ismail;

public class GenerateString {

    public static void main(String[] args) {

        String s = "proficiency_level_competency_";
        String s1 = "competency_";
        int[] array = {1, 5, 4,6,27};

        for (int i=59; i<=228; i++) {
            printString(i);
        }
    }

    private static void printString(int columnNumber) {
        // To store result (Excel column name)
        StringBuilder columnName = new StringBuilder();

        while (columnNumber > 0) {
            // Find remainder
            int rem = columnNumber % 26;

            // If remainder is 0, then a
            // 'Z' must be there in output
            if (rem == 0) {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            } else // If remainder is non-zero
            {
                columnName.append((char) ((rem - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }
        // Reverse the string and print result
        System.out.print(",'\"&"+ columnName.reverse()+"7&\"'");
    }
}