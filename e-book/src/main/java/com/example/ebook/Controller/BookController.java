package com.example.ebook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ebook.Model.Book;
import com.example.ebook.Service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bs;
	
	//get
	@GetMapping("/id")
	public List<Book> details(){
		return bs.getDetails();
	}
	@PostMapping("/save")
	public String all(@RequestBody Book id) {
		bs.save(id);
		return "saved";
	}
	
	//put
	@PutMapping("/update")
	public String fun(@RequestBody Book id) {
		bs.update(id);
		return "updated";
	}
	
	//delete
	@DeleteMapping("/delete{id}")
	public String mall(@PathVariable int id) {
		bs.delete(id);
		return "Deleted";
	}
	
	//sorting
	@GetMapping("/sort/{field}")
	public List<Book>sortCollege(@PathVariable String field){
		return bs.sortCollege(field);
	}
	
	//pagination
	@GetMapping("/page/{pnum}/{psize}")
	public List<Book> page(@PathVariable("pnum")int num,@PathVariable("psize")int size)
	{
		return bs.page(num,size);
	}
	
	//pagination sorting
	@GetMapping("/paginationsort/{pnum}/{psize}/{name}")
	public List<Book> paginationsorting(@PathVariable("pnum")int pnum,@PathVariable("psize")int psize,@PathVariable("name")String name)
	{
		return bs.paginationsorting(pnum,psize,name);
	}
}
