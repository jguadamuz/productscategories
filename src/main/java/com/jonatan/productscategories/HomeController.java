package com.jonatan.productscategories;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jonatan.productscategories.services.AppService;

@Controller
public class HomeController {

	private final AppService appservice;
	
	public HomeController(AppService appservice) {
		this.appservice = appservice;
	}
	
	@RequestMapping("/products/new")
	public String productsNew() {
		
		return "";
	}
	
}
