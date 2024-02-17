package com.java7;

public class ProjectFeedback {
    public static void main(String[] args) {
        String str = "5G RAN_5G BTS";
        String[] res = str.split(";");
        System.out.println(res.length);
        for (int i = 0; i < res.length; i++) {
            try {
                System.out.println("actual string - " + res[i]);
                String fc1 = res[i].substring(res[i].lastIndexOf('_') + 1);
                System.out.println("after splitting - " + fc1);
            } catch (RuntimeException c) {
                System.out.println("Error while getting Recommended Competencies" + c);
            }
        }
    }
}
