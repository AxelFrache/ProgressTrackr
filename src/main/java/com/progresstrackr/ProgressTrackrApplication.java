package com.progresstrackr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.progresstrackr.controllers.HomeController;


@SpringBootApplication
public class ProgressTrackrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgressTrackrApplication.class, args);
	}

	public HomeController homeController() {
		return new HomeController();
	}

}
