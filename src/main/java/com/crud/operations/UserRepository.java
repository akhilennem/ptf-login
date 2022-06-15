package com.crud.operations;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer>
{
    Iterable<User> findByName(String name);
Iterable<User>existsByName(String name);

    @Query("SELECT attendance from User")
    List<User> findUsers(User user);


    List<User> findByEmail(String email);

    List<User> findAllByDate(LocalDate date);
}
