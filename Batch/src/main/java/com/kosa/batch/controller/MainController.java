package com.kosa.batch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//dddd
@Controller
public class MainController {
	@GetMapping("/")
	public String main() {
		return "main";
	}
}
