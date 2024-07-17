package com.wilson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	
	@GetMapping("/product")
	public String getProduct(Model model) {
		int x = 10/0;
		model.addAttribute("msg", "Hi Buddy");
		return "index";
	}

}
