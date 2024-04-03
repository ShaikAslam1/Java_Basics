package com.designpatterns.structuraldesign.proxydesign;

public class ProxyPatternTest {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Aslam", "wrong_pwd");
        try {
            executor.runCommand("dir");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}
