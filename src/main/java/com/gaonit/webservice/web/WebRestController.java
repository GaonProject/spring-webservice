package com.gaonit.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaonit.webservice.domain.posts.PostsRepository;
import com.gaonit.webservice.dto.posts.PostsSaveRequestDto;
import com.gaonit.webservice.service.PostsService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {
	private PostsService postsService;
	
	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}
	
	@PostMapping("/posts")
	public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
		//postsRepository.save(dto.toEntity());
		return postsService.save(dto);
	}
}
