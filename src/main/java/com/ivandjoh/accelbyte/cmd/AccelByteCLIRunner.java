package com.ivandjoh.accelbyte.cmd;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;

public class AccelByteCLIRunner implements CommandLineRunner, ApplicationRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello this is from CommandLine Runner, AccelByte!");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hello this is from Application Runner, AccelByte!");
    }
}
