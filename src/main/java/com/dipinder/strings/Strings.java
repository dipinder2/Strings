package com.dipinder.strings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Strings {
	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}

	@RequestMapping("/random")
	public String random() {
		return "Spring is okay its average";
	}
}
