package com.lungesoft.architecture.core.service;

import com.lungesoft.architecture.core.model.BookModel;

import java.util.List;

public interface ProjectService {

    List<BookModel> getAllBookResources();

    BookModel getBookResource(Long id);

    void addBookResource(BookModel bookModel);

    void updateBookResource(BookModel bookModel, Long id);

    void deleteBookResource(Long id);
}
