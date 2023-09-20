package com.wasib.library;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookRespository implements BooksService{

    private IBooksRepo iBooksRepo;
    public BookRespository (IBooksRepo iBooksRepo){
        this.iBooksRepo=iBooksRepo;
    }
    @Override
    public Books saveBooks(Books t) {
        return iBooksRepo.save(t);

    }
    @Override
    public List<Books> getAllBooks() {
        return iBooksRepo.findAll();

    }
    @Override
    public Books getBooks(Long id) {
        return iBooksRepo.getReferenceById(id);

    }
    @Override
    public Books updateBooks(Books t) {
        return iBooksRepo.save(t);
    }
    @Override
    public String deleteBooks(Long id) {
        iBooksRepo.deleteById(id);
        return "Item Deleted";
    }
    
}
