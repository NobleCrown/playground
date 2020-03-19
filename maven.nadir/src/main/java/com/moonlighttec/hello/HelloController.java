package com.moonlighttec.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Als RestController markiert.
public class HelloController {
	
	/**
	 * Wenn man die Seite /hello aufruft, wird man zurück gegrüßt
	 * @return Den String "Hi"
	 */
	@RequestMapping("/hello") // GET method
	public String sayHi() {
		return "Hi";
	}
}
