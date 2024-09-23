package com.example.Library1.ControllerLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Library1.EntityLayer.Books;
import com.example.Library1.ServiceLayer.BookService;

@RestController
@RequestMapping("books")
public class Controller{
	
	@Autowired
	BookService bookservice;
	
	@GetMapping("/allbooks")
	Iterable<Books> AllBooks()
	{
		return bookservice.getalldetails();
	}
	
	@PostMapping("/addnewbook")
	public Books AddNewBook(@RequestBody Books newbook)
	{
		return bookservice.addnewbooks(newbook);
	}
	 
	@GetMapping("/bookname")
	public Books findByBookName(@RequestParam String bookname)
	{
		return bookservice.findbybookname(bookname);
	}
	
	@GetMapping("/bybooknameandpublisher")
	public Books findByBookNameandPublisher(@RequestParam String bookname,@RequestParam String publisher)
	{
		return bookservice.findbybooknamenndpublisher(bookname, publisher);
	}
	
	@GetMapping("/bypricegreaterthan")
	public List<Books> findByPriceGreaterthan(@RequestParam int price)
	{
		return bookservice.findbyPricegreaterthanEquals(price);
	}
	
}
