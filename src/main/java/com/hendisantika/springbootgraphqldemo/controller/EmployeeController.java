package com.hendisantika.springbootgraphqldemo.controller;

import com.hendisantika.springbootgraphqldemo.service.EmployeeService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/01/20
 * Time: 05.56
 */
@RestController
@RequestMapping
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @PostMapping("/getemp")
    public ResponseEntity<Object> getEmployeeConfigs(@RequestBody String empReqst) {    //System.out.println(service
        // .getAllEmployees().get(0).getAddress().getCountry());
        ExecutionResult execute = service.getGraphQL().execute(empReqst);
        return new ResponseEntity<>(execute, HttpStatus.OK);
    }
}
