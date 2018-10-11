package com.meomeo.vn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meomeo.vn.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
