package com.baiyun.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baiyun.dao.BookDao;
import com.baiyun.pojo.Book;
import com.baiyun.services.BookService;

@Service
public class BookServiceImpl implements BookService {
	// ◊¢»ÎService“¿¿µ
	@Autowired
	private BookDao bookDao;
	
	public Book getBookById(Long userId) {
		return bookDao.getBookById(userId);
	};
}
