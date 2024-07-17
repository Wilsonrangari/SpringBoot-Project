package com.wilson.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishController {
	
	private static final Logger logger = LoggerFactory.getLogger(WishController.class);
	
	@GetMapping("/wish")
	public String wishMessage(Model model) {
		String msgObj = "Good Morning";
		model.addAttribute("msg", msgObj);
		return "index";
	}
	
	
	@GetMapping("/greet")
	public String greetMessage(Model model) {
		String msgObj = null;
		msgObj.length();
		model.addAttribute("msg", msgObj);
		return "index";
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandler(NullPointerException np) {
		String msg = np.getMessage();
		logger.error(msg);
		return "errorPage";
	}
	
	@ExceptionHandler(value = ArithmeticException.class)
	public String exceptionHandler(ArithmeticException ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "errorPage";
	}
	
	

}
