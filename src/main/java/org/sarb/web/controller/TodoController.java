package org.sarb.web.controller;

import org.sarb.model.Todo;
import org.sarb.repository.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chazz on 5/27/2015.
 */
@Controller
@RequestMapping("/todo")
public class TodoController {

    private static final Logger _logger = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoRepository todoRepository;

    @RequestMapping("/create")
    public String createOne() {
        _logger.info("Saving one todo entry...");

        Todo todo = new Todo("Implement Spring Data JPA", "Implement Spring Data JPA");

        todoRepository.save(todo);

        _logger.info("Successfully create todo entry [" + todo + "]");

        return "index";
    }
}
