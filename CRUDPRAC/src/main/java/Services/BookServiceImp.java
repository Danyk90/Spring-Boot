package Services;

import Domain.Books;
import Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Book;

public class BookServiceImp implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Books getSingleBookDetails(int id) {

        return (Books) bookRepository.getOne(id);
    }



}
