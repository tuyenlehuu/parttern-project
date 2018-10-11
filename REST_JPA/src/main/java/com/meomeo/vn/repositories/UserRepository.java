package com.meomeo.vn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meomeo.vn.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
