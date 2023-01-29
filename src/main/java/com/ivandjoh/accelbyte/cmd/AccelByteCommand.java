package com.ivandjoh.accelbyte.cmd;

import picocli.CommandLine;

import java.util.Optional;

@CommandLine.Command(
        name = "",
        mixinStandardHelpOptions = true,
        version = "1.0.0"
)
public class AccelByteCommand implements Runnable {

    @CommandLine.Option(names = {"-h", "--help"}, usageHelp = true)
    boolean help;

    @CommandLine.Option(names = {"-u", "--user"})
    String user;


    @Override
    public void run() {
        if (user == null || user.length() == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.println("Hello " + user);
        }
    }
}
