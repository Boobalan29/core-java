

	package com.example.Library1.RepositoryLayer;

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.example.Library1.EntityLayer.Books;

	@Repository
	public interface BookRepo extends JpaRepository<Books, Long> {
	    
	    Books findByBookname(String bookname);
	    
	    Books findByBooknameAndPublisher(String bookname, String publisher);
	    
	    List<Books> findByPriceGreaterThan(int price);

	}

