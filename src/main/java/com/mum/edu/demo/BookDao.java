package com.mum.edu.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BookDao implements IBookDao {
	private static int idCount = 1;
	private Map<Integer, Book> books = new HashMap<>();

	public BookDao() {
		add(new Book("7 habits of the most successful people", "978-7485", "William Chaparro", 8.79));
		add(new Book("The secret", "978-684", "Erick Thomas", 11.19));
		add(new Book("The Bible", "123-456", "Example", 11.19));
		add(new Book("The Power of thoughts", "777-852-6314", "Example3", 21.77));
		add(new Book("The Power of thoughts 2", "777-852-6314", "Example3", 21.77));
		add(new Book("The Power of thoughts 3", "777-852-6314", "Example3", 21.77));
		add(new Book("The Power of thoughts 4", "777-852-6314", "Example3", 21.77));
	}

	@Override
	public List<Book> getAll() { 
		return new ArrayList<Book>(books.values());
	}

	@Override
	public void add(Book book) {
		book.setId(idCount);
		books.put(idCount, book);
		idCount++;
	}

	@Override
	public Book get(int id) {
		Book result = books.get(id);

		if (result == null) {
			throw new NoSuchResourceException("Book", id);
		}

		return result;
	}

	@Override
	public void update(int bookId, Book book) {
		books.put(bookId, book);
	}

	@Override
	public void delete(int bookId) {
		Book removed = books.remove(bookId);
		if (removed == null) {
			throw new NoSuchResourceException("Book", bookId);
		}
	}
}
