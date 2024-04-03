package com.designpatterns.structuraldesign.proxydesign;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String password) {
        if ("Aslam".equals(user) && "p@$$w0rd".equals(password))
            isAdmin = true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String command) throws Exception {
        if (isAdmin) {
            executor.runCommand(command);
        } else {
            if (command.trim().startsWith("rm")) {
                throw new Exception("rm command not allowed for non-admin users.");
            } else {
                executor.runCommand(command);
            }
        }
    }
}
