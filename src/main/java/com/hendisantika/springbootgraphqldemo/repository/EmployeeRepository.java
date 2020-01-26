package com.hendisantika.springbootgraphqldemo.repository;

import com.hendisantika.springbootgraphqldemo.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/01/20
 * Time: 05.51
 */
public interface EmployeeRepository extends CrudRepository<Employee, String> {

    List<Employee> findAll();
}
