package com.hendisantika.springbootgraphqldemo.service;

import com.hendisantika.springbootgraphqldemo.model.Employee;
import com.hendisantika.springbootgraphqldemo.repository.EmployeeRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/01/20
 * Time: 05.53
 */
@Component
public class AllEmployeeDataFetcher implements DataFetcher<List<Employee>> {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> get(DataFetchingEnvironment environment) {
        return employeeRepository.findAll();
    }
}