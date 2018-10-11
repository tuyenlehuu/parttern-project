package com.meomeo.vn.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.meomeo.vn.entities.Post;

@Controller
public class PostController {

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public void createOrUpdatePost(@RequestBody List<Post> data) {

	}

}
