package controllers;

import Domain.Books;
import Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("/books")
public class MainController {
    @Autowired
    BookService bookService;

    @GetMapping("/getBookDetail/{id}")
    public @ResponseBody
    ResponseEntity<?> getById(@PathVariable Integer id) {

        Books b=bookService.getSingleBookDetails(id);
        return  new ResponseEntity<Books>(b,HttpStatus.OK);
    }


}
