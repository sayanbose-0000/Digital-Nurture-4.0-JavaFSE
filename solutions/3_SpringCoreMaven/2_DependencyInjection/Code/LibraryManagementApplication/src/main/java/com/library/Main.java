package com.library;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.library.service.BookService;

public class Main {
  public static void main(String[] args) {
    XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

    BookService service = (BookService) factory.getBean("bookService");

    service.addBook("1984");
  }
}