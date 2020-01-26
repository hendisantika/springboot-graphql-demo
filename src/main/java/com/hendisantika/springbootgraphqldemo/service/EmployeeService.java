package com.hendisantika.springbootgraphqldemo.service;

import com.hendisantika.springbootgraphqldemo.repository.EmployeeRepository;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/01/20
 * Time: 05.51
 */
@Component
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Value("classpath:employee.graphqls")
    Resource resource;

    private GraphQL graphQL;
}
