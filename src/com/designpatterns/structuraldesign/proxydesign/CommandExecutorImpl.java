package com.designpatterns.structuraldesign.proxydesign;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String command) throws Exception {
        // some heavy implementation
        Runtime.getRuntime().exec(command);
        System.out.println("'" + command + "' command executed.");
    }
}
