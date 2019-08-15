package com.lungesoft.architecture.core.service.impl;

import com.lungesoft.architecture.core.jpa.entity.Project;
import com.lungesoft.architecture.core.jpa.repository.ProjectRepository;
import com.lungesoft.architecture.core.model.BookModel;
import com.lungesoft.architecture.core.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectServiceImpl.class);
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public BookModel getBookResource(Long id) {
        LOGGER.debug("The input parameter: id - {}", id);
        return convertToDto(projectRepository.findOne(id));
    }

    @Override
    @Transactional
    public List<BookModel> getAllBookResources() {
        List<Project> projectsFromRepo = (List<Project>) projectRepository.findAll();
        return projectsFromRepo.stream()
                .map(project -> convertToDto(project))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public void addBookResource(BookModel bookModel) {
        LOGGER.debug("The input parameter: projectModel - {}", bookModel);
        projectRepository.save(convertToEntity(bookModel));
    }

    @Override
    @Transactional
    public void updateBookResource(BookModel bookModel, Long id) {
        LOGGER.debug("The input parameters: projectModel - {}, id - {}", bookModel, id);
        Long projectId = projectRepository.findOne(id).getId();
        Project project = convertToEntity(bookModel);
        project.setId(projectId);
        projectRepository.save(project);
    }

    @Override
    @Transactional
    public void deleteBookResource(Long id) {
        projectRepository.delete(id);
    }

    private BookModel convertToDto(Project book) {
        BookModel projectModel = modelMapper.map(book, BookModel.class);
        return projectModel;
    }


    private Project convertToEntity(BookModel bookModel) {
        Project project = modelMapper.map(bookModel, Project.class);
        return project;
    }
}