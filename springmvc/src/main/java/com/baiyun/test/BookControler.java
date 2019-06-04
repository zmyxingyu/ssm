package com.baiyun.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baiyun.pojo.Book;
import com.baiyun.services.BookService;


@Controller
@RequestMapping("/book") // url:/模块/资源/{id}/细分 /seckill/list
public class BookControler {
	@Autowired
	private BookService bookService;

	
	@RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
	private String detail(@PathVariable("bookId") Long bookId, Model model) {
		System.out.println(bookId);
		if (bookId == null) {
			return "redirect:/book/list";
		}
		Book book = bookService.getBookById(bookId);
		if (book == null) {
			return "forward:/book/list";
		}
		model.addAttribute("book", book.getTitle());
		return "index";
	}
}