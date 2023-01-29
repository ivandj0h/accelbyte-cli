package com.ivandjoh.accelbyte.cmd;

import picocli.CommandLine;

@CommandLine.Command(
        name = "",
        mixinStandardHelpOptions = true,
        version = "1.0.0",
        requiredOptionMarker = '*',
        description = "%nThis is AccelByte-cli tools",
        optionListHeading = "%nYou can choose several Options are :%n",
        footerHeading = "%nCopy(c)2023%n",
        footer = "Develop by ivandjoh"
)
public class AccelByteCommand implements Runnable {


    @CommandLine.Option(
            names = {"-u", "--user"},
            description = "Please Provide Username",
            paramLabel = "username"
    )
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
