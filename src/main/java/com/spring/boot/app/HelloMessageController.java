/**
 * 
 */
package com.spring.boot.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YashPal Singh
 *
 */
@RestController
public class HelloMessageController {

	@RequestMapping("/")
	public String testRnDClass() {
		return "Hello Yashpal!";
	}
	
}
