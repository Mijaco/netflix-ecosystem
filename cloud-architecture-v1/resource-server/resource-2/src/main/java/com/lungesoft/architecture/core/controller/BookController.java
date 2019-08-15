package com.lungesoft.architecture.core.controller;

import com.lungesoft.architecture.core.model.BookModel;
import com.lungesoft.architecture.core.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "Operations pertaining to book")
@RestController
@RequestMapping("/rest/book")
public class BookController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/{id}")
    @ApiOperation(value = "Get book by id")
    public BookModel getProjectResource(@PathVariable Long id) {
        return projectService.getBookResource(id);
    }

    @GetMapping("/")
    @ApiOperation(value = "Get book")
    public List<BookModel> getAllProjectResources() {
        return projectService.getAllBookResources();
    }

    @PostMapping("/")
    public void addProjectResource(@RequestBody BookModel bookModel) {
        projectService.addBookResource(bookModel);
    }

    @PutMapping("/{id}")
    public void updateProjectResource(@RequestBody BookModel bookModel, @PathVariable Long id) {
        projectService.updateBookResource(bookModel, id);
    }

    @DeleteMapping("/{id}")
    public void deleteProjectResource(@PathVariable Long id) {
        projectService.deleteBookResource(id);
    }
}