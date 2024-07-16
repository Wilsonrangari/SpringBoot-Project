package com.wilson.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wilson.dao.BookRepo;


@Controller
public class BookController {
	
	@Autowired
	BookRepo repo;
	
	@GetMapping("/book")
	public ModelAndView getBookById( @RequestParam(value="ids") Integer id) {
		ModelAndView mav = new ModelAndView();
		Optional<BookEntity> findById = repo.findById(id);
		
		if(findById.isPresent()) {
			BookEntity bookEntity = findById.get();
			mav.addObject("bookObj", bookEntity);
		}
		 
		mav.setViewName("index");
		return mav;
	}

}
