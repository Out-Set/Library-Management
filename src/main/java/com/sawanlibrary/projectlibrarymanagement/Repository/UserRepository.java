package com.sawanlibrary.projectlibrarymanagement.Repository;

import com.sawanlibrary.projectlibrarymanagement.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
