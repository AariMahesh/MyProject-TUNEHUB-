package com.tunehub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
@GetMapping("/login")
public String login()
{
	return "login";
}
@GetMapping("/register")
public String register()
{
	return "registration";
}
@GetMapping("/song")
public String song()
{
	return "songs";
}
@GetMapping("/playlist")
public String playlist()
{
	return "songs";
}

}
