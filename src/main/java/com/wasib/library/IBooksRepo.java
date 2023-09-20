package com.wasib.library;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBooksRepo extends JpaRepository<Books, Long>{

    
}
