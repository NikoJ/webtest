package com.npotapov.rest;

import com.npotapov.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/api/v1/person/{id}")
    @ResponseBody
    public String hello(@PathVariable("id") Integer id) {
        return personService.getPersonById(id);
    }
}
