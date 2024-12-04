package com.yedam.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.exam.SlipController;


@Controller
@SpringBootApplication
public class PrjtApplication {

	private static final Logger logger = 
			LoggerFactory.getLogger(PrjtApplication.class);
	
	@Value("${file.uploadpath}")
	String uploadPath;
	
	public static void main(String[] args) {
		SpringApplication.run(PrjtApplication.class, args);
	}

	@GetMapping("/")
	public String main(Model model) {
		logger.info("main");
		model.addAttribute("upload", uploadPath);
		return "main";
	}
}
