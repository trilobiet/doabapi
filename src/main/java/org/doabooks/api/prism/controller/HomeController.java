package org.doabooks.api.prisma.controller;

import org.doabooks.api.prisma.service.PrismError;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(value = "/")
public class HomeController {
	
	@RequestMapping("/")
	@ResponseBody
	public String home(){
		
		return "DoaBooks Prism Widget";
	}

	
	//@GetMapping(path = "/**")
	@GetMapping("/{variable:(?!resources).*}/**") // exclude resources path defined in application.properties
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ModelAndView generateNotFoundException() {
		
		PrismError error = new PrismError(404, "Resource not found");
		
		return new ModelAndView("api/prismwidget/error").addObject(error);
	}

}
