package com.ivandjoh.accelbyte;

import com.ivandjoh.accelbyte.cmd.AccelByteCMD;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class App {

	static void runFromSpecificFolder() {
		try {
			ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\Users\\ivandjoh\\Documents\" && dir");
			processBuilder.redirectErrorStream(true);
			Process p = processBuilder.start();
			p.waitFor();
			String line = null;
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		AccelByteCMD.executeAccelByteCommand();
//		runFromSpecificFolder();

	}

}
