package com.example.Library1.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Library1.EntityLayer.Books;
import com.example.Library1.RepositoryLayer.BookRepo;

@Service
public class BookService {
	@Autowired
	BookRepo bookrepo;
	
	public List<Books> getalldetails()
	{
		return bookrepo.findAll();
	}
	
	public Books addnewbooks(Books newbooks)
	{
		bookrepo.save(newbooks);
		return newbooks;
	}
	
	public Books findbybookname(String name)
	{
		return bookrepo.findByBookname(name);
		
	}
	
	public Books findbybooknamenndpublisher(String bookname,String publisher)
	{
		return bookrepo.findByBooknameAndPublisher(bookname, publisher);
	}
	
	
	public List<Books> findbyPricegreaterthanEquals(int price)
	{
		return bookrepo.findByPriceGreaterThan(price);
	}
	
}
