package com.MF.Listing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.MF.Listing.Service.MyService;

public class MyController {
@Autowired
private MyService myService;

@GetMapping("/hello")
public String name() {
	return "hello";
}
 
}