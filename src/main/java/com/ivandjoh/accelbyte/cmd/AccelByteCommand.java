package com.ivandjoh.accelbyte.cmd;

import picocli.CommandLine;

@CommandLine.Command(
        name = "AccelByte-cli",
        mixinStandardHelpOptions = true,
        version = "1.0.0"
)
public class AccelByteCommand implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello, World!");
    }
}
