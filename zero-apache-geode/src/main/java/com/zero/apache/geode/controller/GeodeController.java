package com.zero.apache.geode.controller;

import com.zero.apache.geode.common.repository.SystemUserRepository;
import com.zero.apache.geode.domain.entity.SystemUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geode")
public class GeodeController {

    SystemUserRepository personRepository;

    @Autowired
    public GeodeController(SystemUserRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public Object findById(String id) {
        return personRepository.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public Object findAll() {
        return personRepository.findAll();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Object insert(@RequestBody SystemUserEntity bean) {
        personRepository.save(bean);
        return "add OK";
    }
}