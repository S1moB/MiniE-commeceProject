package com.s1mob.mini_ecommerce_project.repository;

import com.s1mob.mini_ecommerce_project.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, String> {
}
