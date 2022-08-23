package com.pinkskyrider.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCicdApplication {
	
	@GetMapping("/welcome")
	public String greetings() {
		return "Hello Arun";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsCicdApplication.class, args);
	}
	
	
	//git init
	//git add README.md
	//git commit -m "first commit"
	//git branch -M main
	//git remote add origin https://github.com/theprinkskyrider/github-actions-example.git
	//git push -u origin main

}
