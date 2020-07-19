package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitalLabLogin {

	@GetMapping(value="/")
	public String login() {
		return "1-mainPage";
	//	return "index";
	}
}
