package com.yedam.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class PrjtApplication {

	@Value("${file.uploadpath}")
	String uploadPath;
	
	public static void main(String[] args) {
		SpringApplication.run(PrjtApplication.class, args);
	}

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("upload", uploadPath);
		return "main";
	}
}
