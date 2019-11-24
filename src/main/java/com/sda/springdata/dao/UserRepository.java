package com.sda.springdata.dao;

import com.sda.springdata.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
