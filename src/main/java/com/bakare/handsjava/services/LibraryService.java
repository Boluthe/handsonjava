package com.bakare.handsjava.services;

import com.bakare.handsjava.entities.Library;
import com.bakare.handsjava.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    public Library getLibraryById(Long id) {
        return libraryRepository.findById(id).orElse(null);
    }

    public Library saveLibrary(Library library) {
        return libraryRepository.save(library);
    }

    public void deleteLibrary(Long id) {
        libraryRepository.deleteById(id);
    }
}