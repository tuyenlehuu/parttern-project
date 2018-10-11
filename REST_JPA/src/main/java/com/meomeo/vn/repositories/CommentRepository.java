package com.meomeo.vn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meomeo.vn.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
