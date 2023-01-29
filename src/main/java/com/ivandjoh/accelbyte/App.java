package com.ivandjoh.accelbyte;

import com.ivandjoh.accelbyte.cmd.AccelByteCMD;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
//		new CommandLine(new AccelByteCommand()).execute(args);
		AccelByteCMD.executeAccelByteCommand();
	}

}
