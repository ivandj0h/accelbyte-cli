package com.ivandjoh.accelbyte;

import com.ivandjoh.accelbyte.cmd.AccelByteCLIRunner;
import com.ivandjoh.accelbyte.cmd.AccelByteCMD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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

	@Bean
	public AccelByteCLIRunner accelByteCLIRunner() {
		return new AccelByteCLIRunner();
	}

	public static void main(String[] args) {
		AccelByteCMD.executeAccelByteCommand();
//		runFromSpecificFolder();
//		SpringApplication.run(App.class, args);
	}

}
