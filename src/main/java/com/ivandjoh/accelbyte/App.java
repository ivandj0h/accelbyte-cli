package com.ivandjoh.accelbyte;

import com.ivandjoh.accelbyte.cmd.AccelByteCMD;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		AccelByteCMD.executeAccelByteCommand();
	}

}
