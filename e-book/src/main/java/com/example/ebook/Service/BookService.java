package com.example.ebook.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.ebook.Model.Book;
import com.example.ebook.Repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository br;
	
	//get
	public List<Book>getDetails()
	{
		return br.findAll();
	}
	
	
	//post
	public Book save (Book id)
	{
		return br.save(id);
	}
	
	
	//put
	public Book update(Book id)
	{
		return br.save(id);
	}
	
	//delete
	public void delete(int id)
	{
	     br.deleteById(id);
	}
	
	
	//desc sort
	public List<Book>sortCollege(String field)
	{
		return br.findAll(Sort.by(Direction.DESC,field));
	}
	
	//sort
	public List<Book> sort(String field)
	{
		return br.findAll(Sort.by(field));
	}
	
	//pagination
	public List<Book> page(int num, int size) {
		Page<Book> p=br.findAll(PageRequest.of(num, size));
		return p.getContent();
	}
	

	//paginationsorting
	public List<Book> paginationsorting(int pnum, int psize, String name) {
		// TODO Auto-generated method stub
		Page<Book> p=br.findAll(PageRequest.of(pnum, psize, Sort.by(name).ascending()));
		return p.getContent();
	}
}
