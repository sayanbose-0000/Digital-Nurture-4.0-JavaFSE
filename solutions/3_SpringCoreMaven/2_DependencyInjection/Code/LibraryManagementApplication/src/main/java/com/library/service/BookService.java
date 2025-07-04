package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
  BookRepository br;

  public void setBookRepository(BookRepository br) {
    this.br = br;
  }

  public void addBook(String book) {
    System.out.println("Running book service...");
    br.saveBook(book);
  }
}
