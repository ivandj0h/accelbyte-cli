package com.ivandjoh.accelbyte.cmd;

import org.apache.commons.cli.*;
import org.apache.commons.cli.ParseException;

public class AccelByteCMD {

    static void accelByteCommand() {
        CommandLineParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("h", "help", false, "print this message");
        options.addOption("v", "version", false, "print the version information and exit");

        try {
            CommandLine line = parser.parse(options, new String[]{});
            if (line.hasOption("help")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("accelByte", options);
            } else if (line.hasOption("version")) {
                System.out.println("1.0.0");
            } else {
                System.out.println("Hello, AccelByte!");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void executeAccelByteCommand() {
        accelByteCommand();
    }
}
