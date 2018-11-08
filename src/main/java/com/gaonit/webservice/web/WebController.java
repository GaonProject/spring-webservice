package com.gaonit.webservice.web;

import java.io.Console;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gaonit.webservice.service.PostsService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebController {
	private PostsService postsService;
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("posts", postsService.findAllDesc());		
		return "main";
	}
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);	
        System.out.println("/greeting");
		return "greeting";   // html name
	}
}
