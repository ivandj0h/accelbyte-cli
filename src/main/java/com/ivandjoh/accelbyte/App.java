package com.ivandjoh.accelbyte;

import com.ivandjoh.accelbyte.command.CommandLine;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		CommandLine.executePrint();
	}

}
