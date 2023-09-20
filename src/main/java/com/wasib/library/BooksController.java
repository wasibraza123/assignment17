package com.wasib.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
import java.util.List;

@RestController
@RequestMapping("books")

public class BooksController {

    @Autowired

    private BookRespository bookRespository;
    private IBooksRepo iBooksRepo;
    public BooksController(){
        bookRespository = new BookRespository(iBooksRepo);
    }
    
    @GetMapping ("")
    public List<Books> viewAll(){
        return bookRespository.getAllBooks();
    }

       @GetMapping("/id")
    public Books viewSingle(@PathVariable Long id){
        return bookRespository.getBooks(id);
    }
    @PostMapping("add")
    public Books addBooks(@RequestBody Books t){
        return bookRespository.saveBooks(t);
    }

    @GetMapping("update")
        public Books updaBooks(@RequestBody Books t){
            return bookRespository.updateBooks(t);
        }
    
    @DeleteMapping("delete/{id}")
        public String deleteBooks(@PathVariable Long id){
            bookRespository.deleteBooks(id);
            return "Item deleted";
        }
    }

