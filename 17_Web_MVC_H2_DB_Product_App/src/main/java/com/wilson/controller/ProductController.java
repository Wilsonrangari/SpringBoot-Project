package com.wilson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wilson.entity.ProductEntity;

@Controller
public class ProductController {
	
		@GetMapping("/")
		public String loadIndexPage(Model model) {
			model.addAttribute("p", new ProductEntity());
			return "index";
		}
		
		@PostMapping("/save")
		public String saveProduct(@ModelAttribute("p") ProductEntity p, Model model) {
			System.out.println(p);
			//model.addAttribute("p", new ProductEntity());
			return "index";
		}
}
