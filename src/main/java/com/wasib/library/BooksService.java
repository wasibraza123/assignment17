package com.wasib.library;

import java.util.List;

public interface BooksService {

    Books saveBooks(Books t);
    List<Books> getAllBooks();
    Books getBooks (Long id);
    Books updateBooks(Books t);
    String deleteBooks(Long id);
}
